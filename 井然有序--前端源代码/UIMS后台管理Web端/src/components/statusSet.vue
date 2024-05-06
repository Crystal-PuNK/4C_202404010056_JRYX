// eslint-disable-next-line vue/multi-word-component-names
<template>
    <div class="boxbc1">
        <div class="box1">
            <div class="boxd1">
                <div class="boxd11"></div>
                <div class="boxd12 fontd1">井盖状态一览</div>
            </div>
            <div class="boxd2">
                <div class="boxd21 fontd2">井盖ID</div>
                <input type="text" class="boxd22">
                <div class="boxd23 fontd2">目标区域</div>
                <input type="text" class="boxd24">
                <div class="boxd25">搜索</div>
                <div class="boxd26">新建</div>
            </div>
            <div class="boxd3">
                <div class="boxd31">
                    <input class="boxd311" type="radio" style="width: 1%;margin-left: 1%;">
                    <div class="boxd311 fontd3" style="width: 8%">序列</div>
                    <div class="boxd311 fontd3" style="width: 10%;">井盖ID</div>
                    <div class="boxd311 fontd3" style="width: 10%;">目标区域</div>
                    <div class="boxd311 fontd3" style="width: 15%;">状态</div>
                    <div class="boxd311 fontd3" style="width: 15%;">上一次检测时间</div>
                    <div class="boxd311 fontd3" style="width: 18%;">最近检测照片</div>
                    <div class="boxd311 fontd3" style="width: 19%;">操作</div>
                </div>
                <div class="boxd32">
                    <input class="boxd312" type="radio" style="width: 1%;margin-left: 1%;">
                    <div class="boxd312 fontd3" style="width: 8%">1</div>
                    <div class="boxd312 fontd3" style="width: 10%;">#3245</div>
                    <div class="boxd312 fontd3" style="width: 10%;">科幻公园</div>
                    <div class="boxd312 fontd3" style="width: 15%;color: red;">损坏</div>
                    <div class="boxd312 fontd3" style="width: 15%;">2024年4月7日 19:05</div>
                    <div class="boxd312 fontd3" style="width: 18%;">
                        <div v-if="flag5" class="boximg"  @mouseleave="handleMouseLeave" @click="handleClick"
                            style="width: 100px;height: 80px; position: absolute; left: 27%;top: 10px; z-index: 1000;background-color: rgba(0, 0, 0, .5);">
                        </div>
                        <img @mouseover="handleMouseEnter"
                            src="@/images/jinggai/OIP-C (3).jpg" alt=""
                            style="width: 100px;height: 80px; position: absolute; left: 27%;top: 10px;">
                        <img v-if="flag6" src="@/images/jinggai/OIP-C (3).jpg" alt="" style=" position: absolute; left: calc(27% + 120px);top: -50px; z-index: 999999;">
                    </div>
                    <div class="boxd312 fontd3" style="width: 19%;">
                        <span>更新</span>
                        <span style="margin-left: 15px;">查看</span>
                        <span style="margin-left: 15px;">删除</span>
                    </div>
                </div>
                <div class="boxd32">
                    <input class="boxd312" type="radio" style="width: 1%;margin-left: 1%;">
                    <div class="boxd312 fontd3" style="width: 8%">2</div>
                    <div class="boxd312 fontd3" style="width: 10%;">#3211</div>
                    <div class="boxd312 fontd3" style="width: 10%;">姜维公园</div>
                    <div class="boxd312 fontd3" style="width: 15%;color: yellowgreen;">正常</div>
                    <div class="boxd312 fontd3" style="width: 15%;">2024年4月2日 16:30</div>
                    <div class="boxd312 fontd3" style="width: 18%;">
                        <div v-if="flag7" class="boximg"  @mouseleave="handleMouseLeave" @click="handleClick"
                            style="width: 100px;height: 80px; position: absolute; left: 27%;top: 10px; z-index: 1000;background-color: rgba(0, 0, 0, .5);">
                        </div>
                        <img @mouseover="handleMouseEnter"
                            src="@/images/jinggai/image1.png" alt=""
                            style="width: 100px;height: 80px; position: absolute; left: 27%;top: 10px;">
                        <img v-if="flag8" src="@/images/jinggai/image1.png" alt="" style=" position: absolute; left: calc(27% + 120px);top: -50px; z-index: 999999;">
                    </div>
                    <div class="boxd312 fontd3" style="width: 19%;">
                        <span>更新</span>
                        <span style="margin-left: 15px;">查看</span>
                        <span style="margin-left: 15px;">删除</span>
                    </div>
                </div>
                <div class="boxd32">
                    <input class="boxd312" type="radio" style="width: 1%;margin-left: 1%;">
                    <div class="boxd312 fontd3" style="width: 8%">3</div>
                    <div class="boxd312 fontd3" style="width: 10%;">#3214</div>
                    <div class="boxd312 fontd3" style="width: 10%;">科幻公园</div>
                    <div class="boxd312 fontd3" style="width: 15%;color: yellowgreen;">正常</div>
                    <div class="boxd312 fontd3" style="width: 15%;">2024年4月6日 02:20</div>
                    <div class="boxd312 fontd3" style="width: 18%;">
                        <div v-if="flag7" class="boximg"  @mouseleave="handleMouseLeave" @click="handleClick"
                            style="width: 100px;height: 80px; position: absolute; left: 27%;top: 10px; z-index: 1000;background-color: rgba(0, 0, 0, .5);">
                        </div>
                        <img @mouseover="handleMouseEnter"
                            src="@/images/jinggai/OIP-C (4).jpg" alt=""
                            style="width: 100px;height: 80px; position: absolute; left: 27%;top: 10px;">
                        <img v-if="flag8" src="@/images/jinggai/OIP-C (4).jpg" alt="" style=" position: absolute; left: calc(27% + 120px);top: -50px; z-index: 999999;">
                    </div>
                    <div class="boxd312 fontd3" style="width: 19%;">
                        <span>更新</span>
                        <span style="margin-left: 15px;">查看</span>
                        <span style="margin-left: 15px;">删除</span>
                    </div>
                </div>
                <div class="boxd32">
                    <input class="boxd312" type="radio" style="width: 1%;margin-left: 1%;">
                    <div class="boxd312 fontd3" style="width: 8%">4</div>
                    <div class="boxd312 fontd3" style="width: 10%;">#3114</div>
                    <div class="boxd312 fontd3" style="width: 10%;">公园里</div>
                    <div class="boxd312 fontd3" style="width: 15%;color: yellowgreen;">正常</div>
                    <div class="boxd312 fontd3" style="width: 15%;">2024年4月3日 12:24</div>
                    <div class="boxd312 fontd3" style="width: 18%;">
                        <div v-if="flag7" class="boximg"  @mouseleave="handleMouseLeave" @click="handleClick"
                            style="width: 100px;height: 80px; position: absolute; left: 27%;top: 10px; z-index: 1000;background-color: rgba(0, 0, 0, .5);">
                        </div>
                        <img @mouseover="handleMouseEnter"
                            src="@/images/jinggai/image.png" alt=""
                            style="width: 100px;height: 80px; position: absolute; left: 27%;top: 10px;">
                        <img v-if="flag8" src="@/images/jinggai/image.png" alt="" style=" position: absolute; left: calc(27% + 120px);top: -50px; z-index: 999999;">
                    </div>
                    <div class="boxd312 fontd3" style="width: 19%;">
                        <span>更新</span>
                        <span style="margin-left: 15px;">查看</span>
                        <span style="margin-left: 15px;">删除</span>
                    </div>
                </div>
                <div class="boxd32">
                    <input class="boxd312" type="radio" style="width: 1%;margin-left: 1%;">
                    <div class="boxd312 fontd3" style="width: 8%">5</div>
                    <div class="boxd312 fontd3" style="width: 10%;">#3214</div>
                    <div class="boxd312 fontd3" style="width: 10%;">南蔷</div>
                    <div class="boxd312 fontd3" style="width: 15%;color: yellowgreen;">正常</div>
                    <div class="boxd312 fontd3" style="width: 15%;">2024年4月6日 17:12</div>
                    <div class="boxd312 fontd3" style="width: 18%;">
                        <div v-if="flag7" class="boximg"  @mouseleave="handleMouseLeave" @click="handleClick"
                            style="width: 100px;height: 80px; position: absolute; left: 27%;top: 10px; z-index: 1000;background-color: rgba(0, 0, 0, .5);">
                        </div>
                        <img @mouseover="handleMouseEnter"
                            src="@/images/jinggai/image2.jpg" alt=""
                            style="width: 100px;height: 80px; position: absolute; left: 27%;top: 10px;">
                        <img v-if="flag8" src="@/images/jinggai/image2.jpg" alt="" style=" position: absolute; left: calc(27% + 120px);top: -50px; z-index: 999999;">
                    </div>
                    <div class="boxd312 fontd3" style="width: 19%;">
                        <span>更新</span>
                        <span style="margin-left: 15px;">查看</span>
                        <span style="margin-left: 15px;">删除</span>
                    </div>
                </div>
                <div class="boxd33 fontd2">
                    <img src="@/images/jinggai/zuojiantou.png" alt="" style="width: 16px;left: 60%; top: 30px;">
                    <div style="left: 62%; top: 25px;"><span style="font-weight: 700;">1</span>&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;&nbsp;5</div>
                    <img src="@/images/jinggai/zuojiantou.png" alt="" style="width: 16px;transform: rotate(180deg);left: 71%; top: 30px;">
                    <input type="text" style="width: 5px;height: 25px; left: 80%; top: 25px;" placeholder="1">
                    <div style="left: 76%; top: 25px;">当前第</div>
                    <div style="left: 82%; top: 25px;">/7页</div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            flag5: false,
            flag6: false
        }
    },
    methods: {
        handleMouseEnter() {
            this.flag5 = !this.flag5
        },
        handleMouseLeave() {
            this.flag5 = !this.flag5
            if(this.flag6 == true){
                this.flag6 = !this.flag6
            }
        },
        handleClick() {
            this.flag6 = !this.flag6
        }
    }
}
</script>
<style scoped>
.boxd33 > * {
    position: absolute;
}
.boxd33{
    width: 98%;
    margin-left: 1%;
    height: 50px;
    position: relative;
    margin-top: 10px;
}
.boximg:hover {
    cursor: pointer;
}
.boximg{
    background-image: url(@/images/jinggai/fangdajing.png); /* 替换为你的背景图片路径 */
    background-size: 30%; /* 根据需要调整背景图片大小 */
    background-position: center; /* 让背景图片居中 */
    background-repeat: no-repeat; /* 防止背景图片重复显示 */
}

.boxd312 {
    float: left;
    text-align: center;
    height: 100px;
    line-height: 100px;
    position: relative;
}

.boxd32 {
    width: 98%;
    height: 100px;
    position: relative;
    margin-left: 1%;
    border-bottom: 1px solid #f0f4fa;
}

.boxd311 {
    text-align: center;
    float: left;
    height: 100%;
    line-height: 30px;
}

.fontd3 {
    font-size: 14px;
    font-weight: 500;
}

.boxd31 {
    background-color: #f0f4fa;
    width: 98%;
    height: 100%;
    position: relative;
    margin-left: 1%;
}

.boxd3 {
    position: relative;
    width: 96%;
    height: 30px;
    margin-left: 2%;
    position: relative;
    margin-top: 20px;
}

.boxd26 {
    height: 20px;
    width: 40px;
    text-align: center;
    line-height: 20px;
    color: white;
    background-color: #409eff;
    border-radius: 5px;
    position: absolute;
    top: 5px;
    left: 37%;
}

.boxd25 {
    height: 20px;
    width: 40px;
    text-align: center;
    line-height: 20px;
    color: white;
    background-color: #409eff;
    border-radius: 5px;
    position: absolute;
    top: 5px;
    left: 33%;
}

.boxd24 {
    position: absolute;
    width: 10%;
    height: 20px;
    top: 5px;
    left: 22%;
}

.boxd23 {
    height: 30px;
    line-height: 30px;
    position: absolute;
    left: 16.5%;
}

.boxd22 {
    position: absolute;
    width: 10%;
    height: 20px;
    top: 5px;
    left: 5%;
}

.fontd2 {
    font-size: 15px;
}

.boxd21 {
    height: 30px;
    line-height: 30px;
    position: absolute;
    left: 1%;
    top: 0;
}

.boxd2 {
    width: 96%;
    height: 30px;
    margin-left: 2%;
    position: relative;
}

.fontd1 {
    font-size: 16px;
    font-weight: 600;
}

.boxd12 {
    position: absolute;
    left: 1%;
    top: 0px;
    height: 60px;
    line-height: 60px;
}

.boxd11 {
    position: absolute;
    background-color: #409eff;
    width: 5px;
    height: 26px;
    top: 17px;
    border-radius: 5px;
}

.boxd1 {
    position: relative;
    width: 96%;
    height: 60px;
    margin-left: 2%;
}

.box1 {
    position: absolute;
    width: 90%;
    min-height: calc(100vh - 128px);
    left: 5%;
    top: 30px;
    background-color: #fff;
}

.boxbc1 {
    position: relative;
    width: 100%;
    min-height: calc(100vh - 78px);
    background-color: #eef0f3;
}
</style>