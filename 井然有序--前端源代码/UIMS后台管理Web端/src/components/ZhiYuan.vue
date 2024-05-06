<template>
    <div class="boxbc1">
        <div class="box0"></div>
        <div class="box1">
            <div class="box10"></div>
            <div class="box11">志愿者账户信息</div>
            <div class="box12">
                <div class="box121 lineheight">人员ID</div>
                <div class="box122"></div>
                <div class="box123 lineheight">人员名称</div>
                <div class="box122"></div>
                <div class="box125">搜索</div>
                <div class="box125">新建</div>
            </div>
            <div class="box13">
                <div class="box131 height1 border font1">
                    <div class="box1311"></div>
                    <div class="box1312 height2">人员ID</div>
                    <div class="box1313 height2">姓名</div>
                    <div class="box1314 height2">所属区域</div>
                    <div class="box1315 height2">权限</div>
                    <div class="box1316 height2">操作</div>
                </div>
                <div class="box132 height1 border">
                    <div class="box1311"></div>
                    <div class="box1312 height2">C1326</div>
                    <div class="box1313 height2">朱灵</div>
                    <div class="box1314 height2">建业区</div>
                    <div class="box1315 height2">三级志愿者</div>
                    <div class="box1316 height2 font2">编辑&nbsp;&nbsp;&nbsp;&nbsp;权限设置&nbsp;&nbsp;&nbsp;&nbsp;删除</div>
                </div>
                <div class="box132 height1 border">
                    <div class="box1311"></div>
                    <div class="box1312 height2">C1325</div>
                    <div class="box1313 height2">朱桓</div>
                    <div class="box1314 height2">柴桑区</div>
                    <div class="box1315 height2">二级志愿者</div>
                    <div class="box1316 height2 font2">编辑&nbsp;&nbsp;&nbsp;&nbsp;权限设置&nbsp;&nbsp;&nbsp;&nbsp;删除</div>
                </div>
                <div class="box132 height1 border">
                    <div class="box1311"></div>
                    <div class="box1312 height2">C1324</div>
                    <div class="box1313 height2">朱然</div>
                    <div class="box1314 height2">吴郡区</div>
                    <div class="box1315 height2">三级志愿者</div>
                    <div class="box1316 height2 font2">编辑&nbsp;&nbsp;&nbsp;&nbsp;权限设置&nbsp;&nbsp;&nbsp;&nbsp;删除</div>
                </div>
                <div class="box132 height1 border">
                    <div class="box1311"></div>
                    <div class="box1312 height2">C1323</div>
                    <div class="box1313 height2">朱治</div>
                    <div class="box1314 height2">百越区</div>
                    <div class="box1315 height2">一级志愿者</div>
                    <div class="box1316 height2 font2">编辑&nbsp;&nbsp;&nbsp;&nbsp;权限设置&nbsp;&nbsp;&nbsp;&nbsp;删除</div>
                </div>
                <div class="box132 height1 border">
                    <div class="box1311"></div>
                    <div class="box1312 height2">C1322</div>
                    <div class="box1313 height2">朱盖</div>
                    <div class="box1314 height2">台湾区</div>
                    <div class="box1315 height2">五级志愿者</div>
                    <div class="box1316 height2 font2">编辑&nbsp;&nbsp;&nbsp;&nbsp;权限设置&nbsp;&nbsp;&nbsp;&nbsp;删除</div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
        }
    }
}
</script>
<style scoped>
.font2 {
    color: #304156;
    font-weight: 700;
}

.box132>div {
    float: left;
}

.height2 {
    height: 40px;
    line-height: 40px;
}

.font1 {
    font-size: 13px;
    font-weight: 700;
}

.box1316 {
    margin-left: 20%;
    width: 20%;
}

.box131>div {
    float: left;
}

.box1315 {
    width: 10%;
}

.box1314 {
    width: 20%;
}

.box1313 {
    width: 10%;
}

.box1312 {
    width: 10%;
    margin-left: 2%;
}

.box1311 {
    width: 10px;
    height: 10px;
    border: 1px solid #304156;
    margin-top: 15px;
    margin-left: 2%;
}

.border {
    border-bottom: 1px solid #eef0f3;
}

.box131 {
    background-color: #e1e1e1;
}

.height1 {
    height: 40px;
    width: 100%;
}

.box13 {
    position: relative;
    width: 96%;
    margin-left: 2%;
    min-height: 60%;
}

.box125 {
    width: 40px;
    margin-top: 11px;
    margin-left: 10px;
    border: 1px solid black;
    height: 18px;
    font-size: 12px;
    line-height: 18px;
    text-align: center;
}

.box123 {
    margin-left: 10px;
}

.box122 {
    width: 80px;
    margin-top: 11px;
    margin-left: 10px;
    border: 1px solid black;
    height: 18px;
}

.box121 {
    margin-left: 23px;
}

.lineheight {
    height: 40px;
    line-height: 40px;
}

.box12>div {
    float: left;
}

.box12 {
    font-size: 13px;
    font-weight: 700;
    width: 100%;
    height: 40px;
    margin-top: 10px;
}

.box1>div {
    position: relative;
}

.box10 {
    width: 100%;
    height: 15px;
}

.box11 {
    width: 100%;
    height: 20px;
    line-height: 20px;
    font-size: 14px;
    font-weight: 700;
    padding-left: 8px;
    margin-left: 15px;
    border-left: 4px solid #304156;
}

.box0 {
    width: 100%;
    height: 50px;
}

.box1 {
    position: relative;
    width: 90%;
    margin-left: 5%;
    height: calc(100vh - 200px);
    background-color: white;
}

.boxbc1 {
    position: relative;
    width: 100%;
    min-height: calc(100vh - 78px);
    background-color: #eef0f3;
}
</style>