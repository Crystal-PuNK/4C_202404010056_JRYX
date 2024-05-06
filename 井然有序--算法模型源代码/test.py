from ultralytics import YOLO

# 参赛人员：
# 电子科技大学 高鑫 2021090907028 

model = YOLO('/root/yolov8-ultralytics-main/best.pt')  

# test the model
if __name__ == '__main__':
  model.predict(source='/root/yolov8-ultralytics-main/test',save=True,save_txt=True,save_conf=True)
