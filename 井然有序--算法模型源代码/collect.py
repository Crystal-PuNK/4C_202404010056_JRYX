import os
from PIL import Image

# 指定目录
txts_directory = "/root/yolov8-ultralytics-main/runs/detect/predict4/labels"
images_directory = "/root/yolov8-ultralytics-main/test"
result_file = "/root/yolov8-ultralytics-main/result.txt"

# 获取图片的分辨率函数
def get_image_resolution(image_path):
    with Image.open(image_path) as img:
        return img.size

# 遍历所有.txt文件
for txt_file in os.listdir(txts_directory):
    if txt_file.endswith(".txt"):
        with open(os.path.join(txts_directory, txt_file), "r") as f:
            lines = f.readlines()
            # 遍历每一行
            for line in lines:
                line_parts = line.strip().split()
                class_number = int(line_parts[0])
                confidence = float(line_parts[-1])
                # 预测框的位置
                x_center, y_center, width, height = map(float, line_parts[1:5])
                
                # 获取图片的分辨率
                image_name = txt_file
                image_extensions = ['.jpg', '.png']  # 支持的图片扩展名
                for extension in image_extensions:
                    image_path = os.path.join(images_directory, image_name[:-4] + extension)
                    if os.path.exists(image_path):
                        image_resolution = get_image_resolution(image_path)
                        
                        x_min = int((x_center - width / 2) * image_resolution[0])
                        y_min = int((y_center - height / 2) * image_resolution[1])
                        x_max = int((x_center + width / 2) * image_resolution[0])
                        y_max = int((y_center + height / 2) * image_resolution[1])
                        # 写入到result.txt中
                        with open(result_file, "a") as result:
                            result.write(f"{image_path[35:]} {class_number} {confidence} {x_min} {y_min} {x_max} {y_max}\n")
                        break  # 找到图片后停止循环
