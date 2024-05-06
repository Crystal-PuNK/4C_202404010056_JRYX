<template>
    <div class="boxbc1">
        <div class="boxbc0"></div>
        <div class="boxbc2">
            <div class="boxbc21">
                <div class="boxbc211">无人机：{{ wurenjibianhao }}</div>
                <div class="boxbc212"><img src="@/images/wurenji/dianchi.png" alt=""></div>
                <div class="boxbc213"><img src="@/images/wurenji/duihao.png" alt=""></div>
                <div class="boxbc214">当前目标区域：科幻公园</div>
                <div class="boxbc216"><img src="@/images/wurenji/jiantouxia.png" alt=""></div>
                <div class="boxbc215">切换</div>
            </div>
            <div class="boxbc22 pointer" id="clear">清除路径</div>
            <div class="boxbc23 pointer" id="close">确认路径</div>
            <div class="boxbc24 pointer" @click="selectPolyline">规划路径</div>
        </div>
        <div class="boxbc3">
            <div class="bbox">
                <div id='container'></div>
                <div class="input-card" style='width: 24rem;display: none;'>
                    <div class="input-item">
                        <input type="radio" name='func' value='marker'><span class="input-text">画点</span>
                        <input type="radio" name='func' value='polyline' v-model="selectedFunc"><span
                            class="input-text">画折线</span>
                        <input type="radio" name='func' value='polygon'><span class="input-text"
                            style='width:5rem;'>画多边形</span>
                    </div>
                    <div class="input-item">
                        <input type="radio" name='func' value='rectangle'><span class="input-text">画矩形</span>
                        <input type="radio" name='func' value='circle'><span class="input-text">画圆</span>
                    </div>
                    <div class="input-item">
                        <input type="button" class="btn" value="清除" />
                        <input type="button" class="btn" value="关闭绘图" />
                    </div>
                </div>
            </div>
        </div>
        <div class="boxbc4">无人机一览</div>
        <div class="boxbc5">
            <img class="jiantou2" src="@/images/wurenji/jiantouyou.png" alt="">
            <img class="jiantou1" src="@/images/wurenji/jiantouzuo.png" alt="">
            <div class="boxbc51">
                <div class="boxbc511">
                    <img class="boxbc5111" src="@/images/wurenji/wurenji.png" alt="">
                </div>
                <div class="box512">无人机编号：A3245</div>
                <div class="box512">当前电量：&nbsp;&nbsp;&nbsp;&nbsp;80%</div>
                <div class="box513" @click="toggleDrone">{{ anniuwenan1 }}</div>
            </div>
            <div class="boxbc52">
                <div class="boxbc511">
                    <img class="boxbc5111" src="@/images/wurenji/wurenji.png" alt="">
                </div>
                <div class="box512">无人机编号：A2228</div>
                <div class="box512">当前电量：&nbsp;&nbsp;&nbsp;&nbsp;70%</div>
                <div class="box513">切换无人机</div>
            </div>
            <div class="boxbc53">
                <div class="boxbc511">
                    <img class="boxbc5111" src="@/images/wurenji/wurenji.png" alt="">
                </div>
                <div class="box512">无人机编号：A2344</div>
                <div class="box512">当前电量：&nbsp;&nbsp;&nbsp;&nbsp;40%</div>
                <div class="box513">切换无人机</div>
            </div>
            <div class="boxbc54">
                <div class="boxbc511">
                    <img class="boxbc5111" src="@/images/wurenji/wurenji.png" alt="">
                </div>
                <div class="box512">无人机编号：A2248</div>
                <div class="box512">当前电量：&nbsp;&nbsp;&nbsp;&nbsp;80%</div>
                <div class="box513">切换无人机</div>
            </div>
            <div class="boxbc55">
                <div class="boxbc511">
                    <img class="boxbc5111" src="@/images/wurenji/wurenji.png" alt="">
                </div>
                <div class="box512">无人机编号：A3216</div>
                <div class="box512">当前电量：&nbsp;&nbsp;&nbsp;&nbsp;90%</div>
                <div class="box513">{{ anniuwenan }}</div>
            </div>
        </div>
        <div class="boxbc4">目标区域列表</div>
        <div class="boxbc131">
            <div class="boxbc1311">目标区域:&nbsp;&nbsp;科幻公园</div>
            <div class="boxbc1312"></div>
            <div class="boxbc1313">
                <div class="boxbc13131">区域中心点坐标：</div>
                <div class="boxbc13132">(103.25，33.43)</div>
            </div>
            <div class="boxbc1313">
                <div class="boxbc13131">井盖数目：</div>
                <div class="boxbc13132">25个</div>
            </div>
            <div class="boxbc1313">
                <div class="boxbc13131">志愿者人数：</div>
                <div class="boxbc13132">25个</div>
            </div>
            <div class="boxbc1313">
                <div class="boxbc13131">井盖种类：</div>
            </div>
            <div class="boxbc1314">
                <div class="boxbc13141">圆形铁质</div>
                <div class="boxbc13142">长方形</div>
            </div>
            <div class="box1315">切换到该社区</div>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            map: null,
            mouseTool: null,
            overlays: [],
            selectedFunc: '',
            wurenjibianhao: 'A3216',
            anniuwenan: '已经切换到该无人机',
            anniuwenan1: '切换无人机',
        }
    },
    mounted() {
        const script = document.createElement('script')
        script.src = `https://webapi.amap.com/maps?v=2.0&key=	9586a67f06f50db2a342831f6a7f323c&plugin=AMap.MouseTool`
        document.body.appendChild(script)
        script.onload = () => {
            console.log('第一个 JavaScript 文件加载成功');
            this.map = new window.AMap.Map('container', {
                zoom: 18,
                center: [103.862392, 30.779987]
            });
            const imgurl = '/img/jinggai.25e12220.png'; // 请替换成实际的图片URL
            const markerContent = `<div class="jinggai" style="width: 25px; height: 25px;"><img class="jinggai" src="${imgurl}" style="width: 25px; height: 25px;"></div>`;
            const position = new window.AMap.LngLat(103.862392, 30.779987); //Marker 经纬度
            const position1 = new window.AMap.LngLat(103.862703, 30.779693); //Marker 经纬度
            const position2 = new window.AMap.LngLat(103.862226, 30.779799); //Marker 经纬度
            const position3 = new window.AMap.LngLat(103.861984, 30.779467); //Marker 经纬度
            const position4 = new window.AMap.LngLat(103.86141, 30.779799); //Marker 经纬度
            const position5 = new window.AMap.LngLat(103.861974, 30.780559); //Marker 经纬度
            const position6 = new window.AMap.LngLat(103.863111, 30.780393); //Marker 经纬度
            const marker = new window.AMap.Marker({
                position: position,
                content: markerContent, //将 html 传给 content
                offset: new window.AMap.Pixel(-13, -30), //以 icon 的 [center bottom] 为原点
            });
            const marker1 = new window.AMap.Marker({
                position: position1,
                content: markerContent, //将 html 传给 content
                offset: new window.AMap.Pixel(-13, -30), //以 icon 的 [center bottom] 为原点
            });
            const marker2 = new window.AMap.Marker({
                position: position2,
                content: markerContent, //将 html 传给 content
                offset: new window.AMap.Pixel(-13, -30), //以 icon 的 [center bottom] 为原点
            });
            const marker3 = new window.AMap.Marker({
                position: position3,
                content: markerContent, //将 html 传给 content
                offset: new window.AMap.Pixel(-13, -30), //以 icon 的 [center bottom] 为原点
            });
            const marker4 = new window.AMap.Marker({
                position: position4,
                content: markerContent, //将 html 传给 content
                offset: new window.AMap.Pixel(-13, -30), //以 icon 的 [center bottom] 为原点
            });
            const marker5 = new window.AMap.Marker({
                position: position5,
                content: markerContent, //将 html 传给 content
                offset: new window.AMap.Pixel(-13, -30), //以 icon 的 [center bottom] 为原点
            });
            const marker6 = new window.AMap.Marker({
                position: position6,
                content: markerContent, //将 html 传给 content
                offset: new window.AMap.Pixel(-13, -30), //以 icon 的 [center bottom] 为原点
            });
            this.map.add(marker);
            this.map.add(marker1);
            this.map.add(marker2);
            this.map.add(marker3);
            this.map.add(marker4);
            this.map.add(marker5);
            this.map.add(marker6);
            this.mouseTool = new window.AMap.MouseTool(this.map);
            this.mouseTool.on('draw', (e) => {
                this.overlays.push(e.obj);
            })
            var radios = document.getElementsByName('func');
            for (var i = 0; i < radios.length; i += 1) {
                radios[i].onchange = (e) => {
                    this.draw(e.target.value)
                }
            }
            //this.draw('marker')
            document.getElementById('clear').onclick = () => {
                this.map.remove(this.overlays)
                this.overlays = [];
            }
            document.getElementById('close').onclick = () => {
                this.mouseTool.close(true)//关闭，并清除覆盖物
                for (var i = 0; i < radios.length; i += 1) {
                    radios[i].checked = false;
                }
            }
        }
    },
    methods: {
        selectPolyline() {
            this.draw('polyline')
        },
        toggleDrone() {
            this.wurenjibianhao = 'A3245',
                this.anniuwenan = '切换无人机',
                this.anniuwenan1 = '已经切换到该无人机'
        },
        draw(type) {
            switch (type) {
                case 'marker': {
                    this.mouseTool.marker({
                        //同Marker的Option设置
                    });
                    break;
                }
                case 'polyline': {
                    this.mouseTool.polyline({
                        strokeColor: '#80d8ff'
                        //同Polyline的Option设置
                    });
                    break;
                }
                case 'polygon': {
                    this.mouseTool.polygon({
                        fillColor: '#00b0ff',
                        strokeColor: '#80d8ff'
                        //同Polygon的Option设置
                    });
                    break;
                }
                case 'rectangle': {
                    this.mouseTool.rectangle({
                        fillColor: '#00b0ff',
                        strokeColor: '#80d8ff'
                        //同Polygon的Option设置
                    });
                    break;
                }
                case 'circle': {
                    this.mouseTool.circle({
                        fillColor: '#00b0ff',
                        strokeColor: '#80d8ff'
                        //同Circle的Option设置
                    });
                    break;
                }
            }
        }
    }
}
</script>
<style scoped>
@import url(@/utils/demo-center.css);

.box513:hover {
    /* 鼠标悬停样式 */
    background-color: #506c8d;
    color: #fff;
    cursor: pointer;
}

.pointer:hover {
    cursor: pointer;
}

.box1315 {
    width: 80%;
    margin-left: 10%;
    position: relative;
    background-color: #304156;
    font-size: 12px;
    color: white;
    font-weight: 600;
    height: 25px;
    line-height: 25px;
    text-align: center;
    margin-top: 30px;
    border-radius: 5px;
}

.boxbc13142 {
    display: inline-block;
    text-align: center;
    line-height: 20px;
    font-size: 12px;
    width: 60px;
    height: 20px;
    border: 2px yellowgreen solid;
    color: yellowgreen;
    font-weight: 500;
    margin-left: 10px;
}

.boxbc13141 {
    display: inline-block;
    text-align: center;
    line-height: 20px;
    font-size: 12px;
    width: 60px;
    height: 20px;
    border: 2px red solid;
    color: red;
    font-weight: 500;
}

.boxbc1314 {
    margin-left: 10%;
    margin-top: 10px;
    position: relative;
    width: 80%;
}

.boxbc13131 {
    font-size: 14px;
    font-weight: 600;
    position: absolute;
    left: 0;
    top: 0;
    height: 100%;
}

.boxbc13132 {
    top: 0;
    font-size: 14px;
    font-weight: 600;
    position: absolute;
    right: 0;
}

.boxbc1313 {
    width: 80%;
    height: 20px;
    margin-left: 10%;
    margin-top: 10px;
    position: relative;
}

.boxbc1312 {
    margin-top: 5px;
    margin-left: 10%;
    height: 1px;
    width: 80%;
    background-color: #D7D7D7;
}

.boxbc1311 {
    text-align: center;
    margin-top: 10px;
    width: 100%;
    height: 30px;
    line-height: 30px;
    font-size: 16px;
    font-weight: 700;
}

.boxbc131>div {
    position: relative;
}

.jiantou1 {
    position: absolute;
    height: 40px;
    width: 40px;
    left: -40px;
    top: 80px;
}

.jiantou2 {
    position: absolute;
    height: 40px;
    width: 40px;
    right: -40px;
    top: 80px;
}

.box513 {
    margin-left: 25%;
    margin-top: 30px;
    border-radius: 5px;
    width: 50%;
    height: 30px;
    background-color: #304156;
    color: white;
    line-height: 30px;
    text-align: center;
    font-size: 10px;
    transition: background-color 0.3s ease;
}

.box512 {
    margin-top: 10px;
    width: 80%;
    margin-left: 15%;
    line-height: 20px;
    font-weight: 700;
    font-size: 14px;
    height: 20px;
}

.boxbc5111 {
    position: absolute;
    width: 50px;
    left: calc(50% - 25px);
    top: 5px;
}

.boxbc511 {
    width: 100%;
    height: 30%;
    background-color: #304156;
}

.boxbc51 {
    position: relative;
    float: left;
    width: 18.4%;
    height: 200px;
    background-color: white;
    transition: box-shadow 0.5s ease;
}

.boxbc51:hover {
    /* 鼠标悬停样式 */
    box-shadow: 0px 6px 12px rgba(0, 0, 0, 0.2);
}

.boxbc52 {
    position: relative;
    float: left;
    margin-left: 2%;
    width: 18.4%;
    height: 200px;
    background-color: white;
}

.boxbc53 {
    position: relative;
    float: left;
    margin-left: 2%;
    width: 18.4%;
    height: 200px;
    background-color: white;
}

.boxbc54 {
    position: relative;
    float: left;
    margin-left: 2%;
    width: 18.4%;
    height: 200px;
    background-color: white;
}

.boxbc55 {
    position: relative;
    float: left;
    margin-left: 2%;
    width: 18.4%;
    height: 200px;
    background-color: white;
}

.boxbc5 {
    position: relative;
    width: 90%;
    height: 200px;
    margin-left: 5%;
    margin-top: 15px;
}

.boxbc4 {
    color: white;
    text-align: center;
    line-height: 30px;
    font-weight: 700;
    font-size: 16px;
    height: 30px;
    width: 90%;
    margin-left: 5%;
    margin-top: 20px;
    background-color: #304156;
}

.bbox {
    width: 100%;
    height: 100%;
}

html,
body,
#container {
    height: 100%
}

.input-item {
    height: 2.2rem;
}

.btn {
    width: 6rem;
    margin: 0 1rem 0 2rem;
}

.input-text {
    width: 4rem;
    margin-right: 1rem;
}

.boxbc0 {
    position: relative;
    width: 100%;
    height: 20px;
    background-color: transparent;
}

.boxbc23 {
    float: right;
    height: 40px;
    width: 100px;
    color: white;
    line-height: 40px;
    text-align: center;
    font-weight: 700;
    border-radius: 5px;
    background-color: #304156;
    margin-right: 10px;
    transition: background-color 0.3s ease;
}
.boxbc23:hover {
    background-color: #506c8d;
    color: #fff;
    cursor: pointer;
}
.boxbc24 {
    margin-right: 10px;
    float: right;
    height: 40px;
    width: 100px;
    color: white;
    line-height: 40px;
    text-align: center;
    font-weight: 700;
    border-radius: 5px;
    background-color: #304156;
    transition: background-color 0.3s ease;
}
.boxbc24:hover {
    background-color: #506c8d;
    color: #fff;
    cursor: pointer;
}
.boxbc22 {
    float: right;
    height: 40px;
    width: 100px;
    color: white;
    line-height: 40px;
    text-align: center;
    font-weight: 700;
    border-radius: 5px;
    background-color: #304156;
    transition: background-color 0.3s ease;
}

.boxbc22:hover {
    background-color: #506c8d;
    color: #fff;
    cursor: pointer;
}

.boxbc3 {
    width: 90%;
    height: 400px;
    margin-top: 20px;
    margin-left: 5%;
    background-color: white;
}

.boxbc216 {
    float: right;
    width: 17px;
    height: 17px;
    margin-top: 12px;
    margin-right: 10px;
}

.boxbc215 {
    float: right;
    width: 5%;
    height: 40px;
    line-height: 40px;
    font-weight: 700;
}

.boxbc214 {
    float: left;
    margin-left: 3%;
    width: 28%;
    height: 40px;
    line-height: 40px;
    font-weight: 700;
}

.boxbc213 {
    float: left;
    width: 17px;
    height: 17px;
    margin-top: 12px;
    margin-left: 15px;
}

img {
    vertical-align: bottom;
}

.boxbc212 {
    float: left;
    width: 20px;
    height: 20px;
    margin-top: 11px;
}

.boxbc211 {
    float: left;
    margin-left: 3%;
    width: 18%;
    height: 40px;
    line-height: 40px;
    font-weight: 700;
}

.boxbc212>img {
    width: 100%;
    height: 100%;
}

.boxbc213>img {
    width: 100%;
    height: 100%;
}

.boxbc216>img {
    width: 100%;
    height: 100%;
}

.boxbc2 {
    width: 90%;
    margin-left: 5%;
    height: 40px;
}

.boxbc1 {
    position: relative;
    width: 100%;
    min-height: calc(100vh - 78px);
    background-color: #eef0f3;
}

.boxbc21 {
    float: left;
    width: 52.1%;
    height: 100%;
    background-color: #304156;
    color: white;
}
</style>