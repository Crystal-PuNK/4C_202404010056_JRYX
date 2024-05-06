from ultralytics import YOLO
# Load a model
model = YOLO('/root/yolov8-ultralytics-main/yolov8n.pt')  # build a new model from YAML
# model = YOLO('/root/yolov8-ultralytics-main/ultralytics-main/ultralytics/cfg/models/v8/yolov8.yaml').load('/root/yolov8-ultralytics-main/yolov8n.pt')  # load a pretrained model (recommended for training)
# model = YOLO('path/to/the/YAML').load(
#              'path/to/the/pre_trained/weights')  # build from YAML and transfer weights

# Train the model
if __name__ == '__main__':
  model.train(data='/root/yolov8-ultralytics-main/well.yaml',epochs=500)