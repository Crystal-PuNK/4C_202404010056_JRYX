// eslint-disable-next-line vue/multi-word-component-names
<template>
    <div class="boxbc1">
        <div class="box3" v-if="flag4">
        </div>
        <div class="box4" v-if="flag6" style="background-color: rgba(241, 242, 243, .5);">
            <img src="@/images/paifa/jiazai.gif" alt="" style="position: absolute; width: 10%;left: 45%;top: 200px;">
        </div>
        <div class="box2" v-if="flag4">
            <div class="box21">任务创建</div>
            <div class="box22">任务名称：</div>
            <input class="box23" type="text" placeholder="简要描述任务目的">
            <div class="box23a"></div>
            <div class="box24">
                <div class="box241">人员选择：</div>
                <div class="box242">目标区域：</div>
            </div>
            <div class="box25">
                <img class="box25a" src="@/images/paifa/xiangxiajiantou.png" alt="" @click="flag1 = !flag1">
                <img class="box25b" src="@/images/paifa/xiangxiajiantou.png" alt="" @click="flag2 = !flag2">
                <input class="box251 boxx" type="text" placeholder="输入人员ID选择" v-model="selectedPersonId">
                <input class="box252 boxx" type="text" placeholder="下拉选择已导入的目标区域" v-model="selectedDiQv">
                <div class="box253" v-show="flag1">
                    <div class="box2531" v-for="person in people" :key="person.id" @click="uprenyuan(person.name)">
                        {{ person.name }}
                    </div>
                </div>
                <div class="box254" v-show="flag2">
                    <div class="box2541" v-for="location in locations" :key="location.id"
                        @click="updiqv(location.name)">
                        {{ location.name }}
                    </div>
                </div>
            </div>
            <div class="box23a"></div>
            <div class="box24">
                <div class="box241">井盖选择：</div>
                <div class="box242">验收日期：</div>
            </div>
            <div class="box25">
                <img class="box25a" src="@/images/paifa/xiangxiajiantou.png" alt="" @click="flag3 = !flag3">
                <input class="box251 boxx" type="text" placeholder="输入井盖ID选择" v-model="selectedJinggaiId">
                <input class="box252 boxx" type="date" id="birthday" name="birthday">
                <div class="box253" v-show="flag3">
                    <div class="box2531" v-for="jinggai in jinggais" :key="jinggai.id" @click="upjinggai(jinggai.name)">
                        {{ jinggai.name }}
                    </div>
                </div>
            </div>
            <div class="box22">任务描述：</div>
            <input class="box23 boxx" type="text" placeholder="对任务进行备注">
            <div class="box23a"></div>
            <div class="box26">
                <button class="box261" @click="queding">确定</button>
                <button class="box262" @click="flag4 = !flag4">取消</button>
            </div>
        </div>
        <div class="box1">
            <div class="box11 w100">
                <img class="box111 floatleft" src="@/images/paifa/renwulog.png" alt="">
                <div class="box112 floatleft font1">井盖检修历史任务查看</div>
                <!-- <img class="box113 floatleft" src="@/images/paifa/wanchengdu.png" alt=""> -->
            </div>
            <div class="box12 w100">
                <div class="box121">任务</div>
                <div class="box122 ml20px">里程碑</div>
                <div class="box123 ml20px">看板</div>
                <div class="box124 ml20px">甘特图</div>
                <div class="box125 ml20px">统计</div>
                <div class="box126 ml20px">动态</div>
                <div class="box127 ml20px">文件</div>
                <div class="box128 ml20px">概览</div>
                <div class="box129 ml20px">外部协作</div>
                <div class="box130"></div>
            </div>
            <div class="box13"></div>
            <div class="box14 w100">
                <div class="box141 font3 hei3">状态</div>
                <img class="box141img" src="@/images/paifa/jiantou.png" alt="">
                <div class="box142 font3 hei3">人员</div>
                <img class="box141img" src="@/images/paifa/jiantou.png" alt="">
                <img class="box141img mgl30px" src="@/images/paifa/paixu.png" alt="">
                <div class="box143 font3 hei3">系统默认排序</div>
                <img class="box141img mgl30px" src="@/images/paifa/sousuo.png" alt="">
                <div class="box144 font3 hei3">搜索</div>
                <img class="box141img mgl30px" src="@/images/paifa/zongxiang.png" alt="">
                <div class="box145 font3 hei3">纵向视图</div>
                <img class="box141img mgl30px" src="@/images/paifa/yuandian.png" alt="">
                <div class="box146 font3 hei3">更多</div>
            </div>
            <div class="box15 w100">
                <div class="box151">
                    <!-- <div class="box1511" @click="flag4 = !flag4">+&nbsp;&nbsp;&nbsp;&nbsp;创建任务</div> -->
                    <div class="box1512">
                        <div class="box15121" style="background-color: #ffcce5;">
                            <img src="@/images/paifa/shalou.png" alt="">
                            <span>已结束</span>
                        </div>
                        <div class="box15122">
                            马
                        </div>
                        <div class="box15123">#3214号井盖检修</div>
                        <img class="box15124" src="@/images/paifa/rili.png" alt="">
                        <div class="box15125">剩余1天</div>
                        <img class="box15126" src="@/images/paifa/jindu.png" alt="">
                        <div class="box15127">0%</div>
                    </div>
                    <div class="box1512">
                        <div class="box15121" style="background-color: #ffcce5;">
                            <img src="@/images/paifa/shalou.png" alt="">
                            <span>已结束</span>
                        </div>
                        <div class="box15122">
                            汪
                        </div>
                        <div class="box15123">#2245号井盖检修</div>
                        <img class="box15124" src="@/images/paifa/rili.png" alt="">
                        <div class="box15125">剩余3天</div>
                        <img class="box15126" src="@/images/paifa/jindu.png" alt="">
                        <div class="box15127">0%</div>
                    </div>
                    <div class="box1512">
                        <div class="box15121" style="background-color: #ffcce5;">
                            <img src="@/images/paifa/shalou.png" alt="">
                            <span>已结束</span>
                        </div>
                        <div class="box15122">
                            兰
                        </div>
                        <div class="box15123">#1242号井盖检修</div>
                        <img class="box15124" src="@/images/paifa/rili.png" alt="">
                        <div class="box15125">剩余4天</div>
                        <img class="box15126" src="@/images/paifa/jindu.png" alt="">
                        <div class="box15127">0%</div>
                    </div>
                </div>
                <div class="box151">
                    <div class="box1512">
                        <div class="box15121" style="background-color: #ffcce5;">
                            <img src="@/images/paifa/shalou.png" alt="">
                            <span>已结束</span>
                        </div>
                        <div class="box15122">
                            崔
                        </div>
                        <div class="box15123">#3234号井盖检修</div>
                        <img class="box15124" src="@/images/paifa/rili.png" alt="">
                        <div class="box15125">剩余5天</div>
                        <img class="box15126" src="@/images/paifa/jindu.png" alt="">
                        <div class="box15127">0%</div>
                    </div>
                    <div class="box1512">
                        <div class="box15121" style="background-color: #ffcce5;">
                            <img src="@/images/paifa/shalou.png" alt="">
                            <span>已结束</span>
                        </div>
                        <div class="box15122">
                            詹
                        </div>
                        <div class="box15123">#1245号井盖检修</div>
                        <img class="box15124" src="@/images/paifa/rili.png" alt="">
                        <div class="box15125">剩余2天</div>
                        <img class="box15126" src="@/images/paifa/jindu.png" alt="">
                        <div class="box15127">0%</div>
                    </div>
                    <div class="box1512" v-if="flag5">
                        <div class="box15121">
                            <img src="@/images/paifa/shalou.png" alt="">
                            <span>进行中</span>
                        </div>
                        <div class="box15122">
                            郎
                        </div>
                        <div class="box15123">#3244号井盖检修</div>
                        <img class="box15124" src="@/images/paifa/rili.png" alt="">
                        <div class="box15125">剩余3天</div>
                        <img class="box15126" src="@/images/paifa/jindu.png" alt="">
                        <div class="box15127">0%</div>
                    </div>
                </div>
                <div class="box151"></div>
                <div class="box151"></div>
                <img class="box152" src="@/images/paifa/jiantouyou.png" alt="">
            </div>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            flag1: false,
            flag2: false,
            flag3: false,
            flag4: false,
            flag5: false,
            flag6: false,
            selectedPersonId: "",
            selectedDiQv: "",
            selectedJinggaiId: "",
            people: [
                { id: 1, name: 'B1235' },
                { id: 2, name: 'B1232' },
                { id: 3, name: 'B1231' },
                { id: 4, name: 'B1333' },
                { id: 5, name: 'B1134' },
                { id: 6, name: 'B1432' }
            ],
            locations: [
                { id: 1, name: '科幻公园' },
                { id: 2, name: '创客天地' },
                { id: 3, name: '九龙港口' },
                { id: 4, name: '柴桑建业' },
                { id: 5, name: '吴郡桂阳' },
                { id: 6, name: '零陵武陵' }
            ],
            jinggais: [
                { id: 1, name: '#3246' },
                { id: 2, name: '#3242' },
                { id: 3, name: '#3243' },
                { id: 4, name: '#3244' },
                { id: 5, name: '#3236' },
                { id: 6, name: '#3216' }
            ]
        }
    },
    methods: {
        upjinggai(name) {
            this.selectedJinggaiId = name
            this.flag3 = !this.flag3
        },
        uprenyuan(name) {
            this.selectedPersonId = name
            this.flag1 = !this.flag1
        },
        updiqv(name) {
            this.selectedDiQv = name
            this.flag2 = !this.flag2
        },
        queding() {
            this.flag4 = !this.flag4;
            this.flag6 = !this.flag6;
            setTimeout(() => {
                this.flag6 = !this.flag6;
                this.flag5 = !this.flag5;
            }, 500);
        }
    }
}
</script>
<style scoped>
.boxx:hover {
    border: 2px rgb(64, 158, 255) solid;
}

.boxx {
    transition: border-color 0.3s ease-in-out;
}

.box262 {
    position: absolute;
    bottom: 50px;
    left: 130px;
    width: 80px;
    height: 30px;
    background-color: white;
    color: black;
    border: 1px solid #c6c3c3;
    border-radius: 5px;
    transition: box-shadow 0.3s ease-in-out;
}

.box262:hover {
    cursor: pointer;
    box-shadow: 2px 2px 5px 2px rgba(0, 0, 0, 0.3);
}

.box261:hover {
    cursor: pointer;
    box-shadow: 2px 2px 5px 2px rgba(64, 158, 255, 0.3);
}

.box261 {
    position: absolute;
    bottom: 50px;
    left: 5%;
    width: 80px;
    height: 30px;
    background-color: #409eff;
    border: 0;
    color: white;
    border-radius: 5px;
    transition: box-shadow 0.3s ease-in-out;
}

.box26 {
    position: relative;
    height: 100px;
    width: 100%;
}

.box23a {
    width: 100%;
    height: 10px;
}

.box2541 {
    padding-left: 10px;
    box-sizing: border-box;
    border-bottom: 1px solid #e4e4e4;
    width: 100%;
    height: 40px;
}

.box2541:hover {
    cursor: pointer;
    background-color: #dbdbdb;
}

.box254 {
    border-left: 1px solid #e4e4e4;
    border-right: 1px solid #e4e4e4;
    position: absolute;
    top: 30px;
    left: 42%;
    padding-left: 0.5%;
    line-height: 40px;
    width: 58%;
    font-size: 14px;
    font-weight: 500;
    height: 120px;
    overflow: auto;
    background-color: #fff;
    z-index: 5000;
}

.box25a:hover {
    cursor: pointer;
}

.box25b:hover {
    cursor: pointer;
}


.box2531:hover {
    cursor: pointer;
    background-color: #dbdbdb;
}

.box25b {
    position: absolute;
    right: 1.5%;
    top: 8px;
    width: 15px;
}

.box25a {
    position: absolute;
    left: 36%;
    top: 8px;
    width: 15px;
}

.box2531 {
    padding-left: 10px;
    box-sizing: border-box;
    border-bottom: 1px solid #e4e4e4;
    width: 100%;
    height: 40px;
}

.box253 {
    border-left: 1px solid #e4e4e4;
    border-right: 1px solid #e4e4e4;
    position: absolute;
    top: 30px;
    padding-left: 0.5%;
    line-height: 40px;
    width: 40%;
    font-size: 14px;
    font-weight: 500;
    height: 120px;
    overflow: auto;
    background-color: #fff;
    z-index: 5000;
}

.box251 {
    height: 30px;
    width: 40%;
}

.box252 {
    height: 30px;
    margin-left: 2%;
    width: 58%;
}

.box25>input {
    float: left;
}

.box25 {
    position: relative;
    margin-top: 5px;
    height: 30px;
    width: 90%;
    margin-left: 5%;
    line-height: 30px;
    font-size: 15px;
    font-weight: 600;
    color: black;
}

.box24>div {
    float: left;
}

.box241 {
    width: 40%;
}

.box242 {
    margin-left: 2%;
    width: 56%;
}

.box24 {
    margin-top: 5px;
    height: 30px;
    width: 90%;
    margin-left: 5%;
    line-height: 30px;
    font-size: 15px;
    font-weight: 600;
    color: black;
}

.box23:hover {
    border: 2px rgb(64, 158, 255) solid;
}

.box23 {
    transition: border-color 0.3s ease-in-out;
    margin-top: 5px;
    height: 30px;
    width: 90%;
    margin-left: 5%;
    line-height: 30px;
    font-size: 15px;
}

.box22 {
    margin-top: 20px;
    height: 30px;
    width: 90%;
    margin-left: 5%;
    line-height: 30px;
    font-size: 15px;
    font-weight: 600;
    color: black;
}

.box21 {
    margin-top: 20px;
    height: 30px;
    width: 100%;
    text-align: center;
    line-height: 30px;
    font-size: 16px;
    font-weight: 700;
    color: black;
}

.box3 {
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    background-color: rgba(0, 0, 0, 0.5);
    width: 100%;
    z-index: 1000;
}

.box4 {
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    background-color: rgba(0, 0, 0, 0.5);
    width: 100%;
    z-index: 1000;
}

.box2 {
    left: 30%;
    top: 50px;
    position: absolute;
    width: 40%;
    height: 500px;
    background-color: white;
    z-index: 3000;
    border-radius: 15px;
}

.box15127 {
    position: absolute;
    right: 15px;
    bottom: 10px;
    font-size: 11px;
    font-weight: 500;
    color: #898989;
}

.box15126 {
    position: absolute;
    width: 15px;
    bottom: 10px;
    right: 34px;
}

.box15125 {
    position: absolute;
    left: 34px;
    bottom: 10px;
    font-size: 11px;
    font-weight: 500;
    color: #898989;
}

.box15124 {
    position: absolute;
    width: 15px;
    bottom: 10px;
    left: 15px;
}

.box15123 {
    position: absolute;
    left: 15px;
    top: 43px;
    font-size: 12px;
    font-weight: 500;
}

.box15122 {
    position: absolute;
    color: white;
    font-size: 10px;
    font-weight: 700;
    background-color: #dee9ff;
    width: 20px;
    height: 20px;
    border-radius: 10px;
    text-align: center;
    line-height: 20px;
    right: 15px;
    top: 12px;
}

.box15121>img {
    margin-left: 7px;
    width: 15px;
    position: relative;
    top: 0px;
}

.box15121 {
    position: absolute;
    left: 15px;
    top: 15px;
    width: 60px;
    height: 17px;
    background-color: #dee9ff;
    border-radius: 15px;
    font-size: 10px;

}

.box1512:hover {
    cursor: pointer;
    box-shadow: 2px 2px 5px 2px rgba(64, 158, 255, 0.3);
}

.box1512 {
    transition: box-shadow 0.3s ease-in-out;
    position: relative;
    width: 90%;
    background-color: #fff;
    height: 100px;
    font-weight: 600;
    border-radius: 10px;
    margin-left: 5%;
    margin-top: 10px;
}

.box1511:hover {
    cursor: pointer;
    box-shadow: 2px 2px 5px 2px rgba(64, 158, 255, 0.3);
}

.box1511 {
    text-align: center;
    width: 90%;
    background-color: #fff;
    height: 60px;
    line-height: 60px;
    color: #3f9dff;
    font-weight: 600;
    border-radius: 10px;
    margin-left: 5%;
    margin-top: 10px;
    transition: box-shadow 0.3s ease-in-out;
}

.box152 {
    position: absolute;
    right: 0px;
    top: 180px;
    width: 100px;
}

.box15>div {
    float: left;
}

.box15 {
    margin-top: 30px;
    position: relative;
    min-height: 200px;
}

.box151 {
    margin-left: 15px;
    width: 22%;
    height: 430px;
    background-color: #F0F4FA;
    border-radius: 15px;
    position: relative;
}

.box141img {
    margin-left: 5px;
}

.box14>img {
    width: 15px;
    margin-top: 7.5px;
}

.box142 {
    margin-left: 30px;
}

.mgl30px {
    margin-left: 50px;
}

.hei3 {
    height: 30px;
    line-height: 30px;
}

.box141 {
    margin-left: 15px;
}

.box14>* {
    float: left;
}

.box14 {
    height: 30px;
}

.font3 {
    color: #898989;
    font-size: 12px;
}

.box130 {
    position: absolute;
    width: 29px;
    left: 13px;
    bottom: 3px;
    height: 5px !important;
    border-radius: 10px;
    background-color: #409eff;
}

.ml20px {
    margin-left: 30px;
}

.box121 {
    margin-left: 15px;
}

.box12>div {
    float: left;
    height: 40px;
    line-height: 40px;
    font-weight: 700;
}

.box12 {
    position: relative;
    height: 40px;
}

.box13 {
    margin-top: 5px;
    height: 3px;
    border-radius: 50px;
    width: calc(100% - 30px);
    background-color: #eef0f3;
    margin-left: 15px;
}

.box113 {
    margin-left: 15px;
    margin-top: 23px;
    width: 20px;
    height: 20px;
}

.font1 {
    font-size: 16px;
    font-weight: 700;
}

.box112 {
    height: 60px;
    line-height: 60px;
    margin-left: 15px;
}

.floatleft {
    float: left;
}

.box111 {
    margin-left: 15px;
    margin-top: 17px;
    width: 25px;
    height: 25px;
}

.box11 {
    height: 60px;
}

.w100 {
    width: 100%;
}

.bgcred {
    border: 1px solid black;
    box-sizing: border-box;
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