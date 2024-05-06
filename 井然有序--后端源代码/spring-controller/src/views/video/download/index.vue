<template>
  <div>
    <!--搜索文件获取resource-->
    <el-form
      :model="queryParams"
      ref="queryForm"
      size="small"
      :inline="true"
      v-show="showSearch"
      label-width="68px"
    >
      <el-form-item label="文件名称" prop="fileName">
        <el-input
          v-model="queryParams.fileName"
          placeholder="请输入文件名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button
          type="primary"
          icon="el-icon-search"
          size="mini"
          @click="handleQuery"
          >搜索</el-button
        >
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery"
          >重置</el-button
        >
      </el-form-item>
    </el-form>
    <div>
      <div v-for="(item, index) in infoList" :key="index" class="fileBox">
        <span class="fileTitle">视频名称:{{item.fileName}}</span>
        <el-button type="primary" class="downloadBtn" @click="downloadVideo((item.filePath))">下载</el-button>
      </div>
    </div>
  </div>
</template>

<script>
import { getToken } from "@/utils/auth";
import {
  listInfo,
  getInfo,
  delInfo,
  addInfo,
  updateInfo,
} from "@/api/video/info";
export default {
  data() {
    return {
      queryParams: {
        pageNum: 1,
        pageSize: 100,
        fileName: null,
        filePath: null,
      },
      total: 0,
      // 文件信息表格数据
      infoList: [],
      loading: true,
      form: {},
      showSearch: true,
    };
  },
  created() {
    this.getList();
  },
  methods: {
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
      console.log(this.infoList);
    },
    getList() {
      this.loading = true;
      listInfo(this.queryParams).then((response) => {
        this.infoList = response.rows;
        console.log(this.infoList);
        this.total = response.total;
        this.loading = false;
      });
    },
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    downloadVideo(path){
      this.$download.resource(path);
    }
  },
};
</script>

<style>
.fileBox {
  position: relative;
  display: inline-block;
  width: 200px;
  height: 300px;
  background-color: rgb(227, 253, 224);
  border-radius: 20px;
  margin-left: 20px;
  margin-top: 10px;
}
.downloadBtn {
  top: 220px;
  left: 60px;
  position: absolute;
}
.fileTitle {
  position: absolute;
  top: 60px;
  width: 100%;
  text-align: center;
}
</style>