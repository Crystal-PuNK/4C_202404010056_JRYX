import os
import xml.etree.ElementTree as ET
from PIL import Image

def convert_coordinates(x, y, w, h, img_width, img_height):
    # Convert coordinates to YOLO format
    x_center = (x + w / 2) / img_width
    y_center = (y + h / 2) / img_height
    new_width = w / img_width
    new_height = h / img_height
    return x_center, y_center, new_width, new_height

def process_xml(xml_path, img_folder, txt_folder):
    tree = ET.parse(xml_path)
    root = tree.getroot()
    
    img_name = os.path.splitext(os.path.basename(xml_path))[0]
    img_path_jpg = os.path.join(img_folder, img_name + ".jpg")
    img_path_png = os.path.join(img_folder, img_name + ".png")
    
    img_resolution = (0, 0)
    if os.path.exists(img_path_jpg):
        img_width, img_height = Image.open(img_path_jpg).size
        img_resolution = (img_width, img_height)
    elif os.path.exists(img_path_png):
        img_width, img_height = Image.open(img_path_png).size
        img_resolution = (img_width, img_height)
    else:
        print(f"Image file not found for {img_name}. Skipping...")
        return
    
    txt_path = os.path.join(txt_folder, img_name + ".txt")
    
    with open(txt_path, 'w') as f:
        for obj in root.findall('object'):
            class_name = obj.find('name').text
            if class_name == 'good':
                class_id = 0
            elif class_name == 'broke':
                class_id = 1
            elif class_name == 'lose':
                class_id = 2
            elif class_name == 'uncovered':
                class_id = 3
            elif class_name == 'circle':
                class_id = 4
            else:
                continue

            bbox = obj.find('bndbox')
            xmin = float(bbox.find('xmin').text)
            ymin = float(bbox.find('ymin').text)
            xmax = float(bbox.find('xmax').text)
            ymax = float(bbox.find('ymax').text)
            
            x_center, y_center, new_width, new_height = convert_coordinates(xmin, ymin, xmax - xmin, ymax - ymin, img_width, img_height)
            
            f.write(f"{class_id} {x_center} {y_center} {new_width} {new_height}\n")

train_xml_folder = "/root/yolov8-ultralytics-main/aug/xmls"
train_img_folder = "/root/yolov8-ultralytics-main/aug/images"
train_txt_folder = "/root/yolov8-ultralytics-main/aug/labels"

for xml_file in os.listdir(train_xml_folder):
    if xml_file.endswith('.xml'):
        xml_path = os.path.join(train_xml_folder, xml_file)
        process_xml(xml_path, train_img_folder, train_txt_folder)
        
