<template>
  <div>
    <!--在这里搞一个下拉框-->
    <el-button type="primary" class="btnSelect" @click="displaySelectList">点击这里选择视频</el-button>
    <el-button type="primary" class="btnDownload" @click="downloadByPath">点击这里下载视频</el-button>
    <!--这是一个下拉框 v-for="(item, index) in infoList" :key="index"-->
    <div class="selectList" v-show="selectFlag">
        <div class="selectItem" v-for="(item, index) in infoList" :key="index" @click="displayByPath(item.filePath)">
            {{item.fileName}}
        </div>
    </div>
    <video
      v-if="videoPath != ''"
      :src="videoPath"
      class="avatar video-avatar videoBox"
      controls="controls"
    >
      您的浏览器不支持视频播放
    </video>
  </div>
</template>

<script sc>
import {
  listInfo,
  getInfo,
  delInfo,
  addInfo,
  updateInfo,
} from "@/api/video/info";
import { getToken } from "@/utils/auth";
export default {
  data() {
    return {
      loading: true,
      queryParams: {
        pageNum: 1,
        pageSize: 100,
        fileName: null,
        filePath: null,
      },
      total: 0,
      // 文件信息表格数据
      infoList: [],
      videoPath:'http://localhost:8080/profile/upload/2023/09/04/第一式起式_20230904111802A002.mp4',
      selectFlag:false
    };
  },
  methods: {
    getList() {
      this.loading = true;
      listInfo(this.queryParams).then((response) => {
        this.infoList = response.rows;
        console.log(this.infoList);
        this.total = response.total;
        this.loading = false;
      });
    },
    displayByPath(path){
        this.videoPath = path;
        this.selectFlag = false;
    },
    displaySelectList(){
        this.selectFlag = this.selectFlag == false? true : false;
    },
    downloadByPath(){
        this.$download.resource(this.videoPath)
    }
  },
  created() {
    this.getList();
  },
};
</script>

<style scoped>
.avatar-uploader-icon {
  border: 1px dashed #d9d9d9 !important;
}
.avatar-uploader .el-upload {
  border: 1px dashed #d9d9d9 !important;
  border-radius: 6px !important;
  position: relative !important;
  overflow: hidden !important;
}
.avatar-uploader .el-upload:hover {
  border: 1px dashed #d9d9d9 !important;
  border-color: #409eff;
}
.avatar-uploader-icon {
  font-size: 28px;
  color: #8c939d;
  width: 300px;
  height: 178px;
  line-height: 178px;
  text-align: center;
}
.avatar {
  width: 300px;
  height: 178px;
  display: block;
}
.fileTitle{
  width: 400px;
  position: absolute;
  top: 100px;
  left: 20px;
}
.videoBox{
    position: absolute;
    left: 20px;
    top: 80px;
    width: 1500px;
    height: 800px;
}
.btnSelect{
    position: absolute;
    top: 20px;
    left: 20px;
    width: 200px;
    height: 50px;
}
.btnDownload{
    position: absolute;
    top: 20px;
    left: 230px;
    width: 200px;
    height: 50px;
}
.selectList{
    box-sizing: border-box;
    z-index: 100;
    background-color: white;
    border: dashed black 1px;
    position: absolute;
    width: 200px;
    height: 600px;
    top: 70px;
    left: 20px;
    border-top: 0;
    overflow-y:scroll
}
.selectItem{
    width: 100%;
    height: 50px;
    box-sizing: border-box;
    border-bottom: 1px black dashed;
    text-align: center;
    line-height: 50px;
}
.selectItem:hover{
    cursor: pointer;
}
</style>