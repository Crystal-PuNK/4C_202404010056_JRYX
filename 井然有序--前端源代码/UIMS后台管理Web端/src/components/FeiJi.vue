<template>
    <div class="boxbc1">
      <div class="boxbc10"></div>
      <div class="boxbc11">当前目标区域：科幻公园无人机位置分布情况
        <div class="boxbc111" style="position: absolute;right: 50px;top: 0;font-size: 14px;">更换</div>
        <img style="position: absolute;width: 20px;right: 25px;top: 10px;" src="@/images/map/sanjiantou.png" alt="">
      </div>
      <div class="boxbc12" id="container"></div>
      <div class="boxbc13">
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
        <div class="boxbc132">
          <div class="boxbc1321">目标区域:&nbsp;&nbsp;井盖种类</div>
          <div class="boxbc1322">目标区域:&nbsp;&nbsp;每月井盖损坏情况统计</div>
          <div class="boxbc1323">
            <div class="echart" ref="mychart5" id="mychart" :style="{ width: '100%', height: '100%' }">
            </div>
          </div>
          <div class="boxbc1324">
            <div class="echart" ref="mychart4" id="mychart" :style="{ width: '100%', height: '100%' }"></div>
          </div>
        </div>
      </div>
      <div class="boxbc13">
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
        <div class="boxbc132">
          <div class="boxbc1321">目标区域:&nbsp;&nbsp;井盖种类</div>
          <div class="boxbc1322">目标区域:&nbsp;&nbsp;每月井盖损坏情况统计</div>
          <div class="boxbc1323">
            <div class="echart" ref="mychart3" id="mychart" :style="{ width: '100%', height: '100%' }">
            </div>
          </div>
          <div class="boxbc1324">
            <div class="echart" ref="mychart2" id="mychart" :style="{ width: '100%', height: '100%' }"></div>
          </div>
        </div>
      </div>
      <div class="boxbc13">
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
        <div class="boxbc132">
          <div class="boxbc1321">目标区域:&nbsp;&nbsp;井盖种类</div>
          <div class="boxbc1322">目标区域:&nbsp;&nbsp;每月井盖损坏情况统计</div>
          <div class="boxbc1323">
            <div class="echart" ref="mychart1" id="mychart" :style="{ width: '100%', height: '100%' }">
            </div>
          </div>
          <div class="boxbc1324">
            <div class="echart" ref="mychart" id="mychart" :style="{ width: '100%', height: '100%' }"></div>
          </div>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  import * as echarts from "echarts"
  export default {
    data() {
      return {
        map: null,
        mouseTool: null,
        overlays: [],
        imgurl: require('@/utils/wurenji.png')
      };
    },
    mounted() {
      this.initEcharts();
      const script = document.createElement('script')
      script.src = `https://webapi.amap.com/maps?v=2.0&key=	9586a67f06f50db2a342831f6a7f323c&plugin=AMap.MouseTool`
      document.body.appendChild(script)
      script.onload = () => {
        console.log('第一个 JavaScript 文件加载成功');
        this.map = new window.AMap.Map('container', {
          zoom: 18,
          center: [103.862392, 30.779987]
        });
        const imgurl = '/img/wurenji.d47b3e79.png'; // 请替换成实际的图片URL
        const markerContent = `<div style="width: 25px; height: 25px;"><img src="${imgurl}" style="width: 25px; height: 25px;"></div>`;
        const position = new window.AMap.LngLat(103.862392, 30.779987); //Marker 经纬度
        const position1 = new window.AMap.LngLat(103.862703, 30.779693); //Marker 经纬度
        const position2 = new window.AMap.LngLat(103.862226, 30.779799); //Marker 经纬度
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
        this.map.add(marker);
        this.map.add(marker1);
        this.map.add(marker2);
      }
    },
    methods: {
      initEcharts() {
        const option = {
          tooltip: {
            trigger: 'item'
          },
          legend: {
            top: '0%',
            left: 'center'
          },
          series: [
            {
              name: '',
              type: 'pie',
              radius: ['40%', '70%'],
              avoidLabelOverlap: false,
              label: {
                show: false,
                position: 'center'
              },
              emphasis: {
                label: {
                  show: true,
                  fontSize: 10,
                  fontWeight: 'bold'
                }
              },
              labelLine: {
                show: false
              },
              data: [
                { value: 20, name: '圆形铁质' },
                { value: 30, name: '长方形' },
                { value: 50, name: 'L形水泥质' }
              ]
            }
          ]
        };
        const option1 = {
          xAxis: {
            type: 'category',
            data: ['1月', '2月', '3月', '4月']
          },
          yAxis: {
            type: 'value'
          },
          series: [
            {
              data: [153, 235, 221, 30, 130, 142],
              type: 'line'
            }
          ]
        };
        const option2 = {
          tooltip: {
            trigger: 'item'
          },
          legend: {
            top: '0%',
            left: 'center'
          },
          series: [
            {
              name: '',
              type: 'pie',
              radius: ['40%', '70%'],
              avoidLabelOverlap: false,
              label: {
                show: false,
                position: 'center'
              },
              emphasis: {
                label: {
                  show: true,
                  fontSize: 10,
                  fontWeight: 'bold'
                }
              },
              labelLine: {
                show: false
              },
              data: [
                { value: 40, name: '圆形铁质' },
                { value: 60, name: '长方形' }
              ]
            }
          ]
        };
        const option3 = {
          xAxis: {
            type: 'category',
            data: ['1月', '2月', '3月', '4月']
          },
          yAxis: {
            type: 'value'
          },
          series: [
            {
              data: [150, 230, 224, 218, 135, 147, 260],
              type: 'line'
            }
          ]
        };
        const option4 = {
          tooltip: {
            trigger: 'item'
          },
          legend: {
            top: '0%',
            left: 'center'
          },
          series: [
            {
              name: '',
              type: 'pie',
              radius: ['40%', '70%'],
              avoidLabelOverlap: false,
              label: {
                show: false,
                position: 'center'
              },
              emphasis: {
                label: {
                  show: true,
                  fontSize: 10,
                  fontWeight: 'bold'
                }
              },
              labelLine: {
                show: false
              },
              data: [
                { value: 20, name: '圆形铁质' },
                { value: 30, name: '长方形' },
                { value: 50, name: 'L形水泥质' }
              ]
            }
          ]
        };
        const option5 = {
          xAxis: {
            type: 'category',
            data: ['1月', '2月', '3月', '4月']
          },
          yAxis: {
            type: 'value'
          },
          series: [
            {
              data: [150, 230, 224, 218, 135, 147, 260],
              type: 'line'
            }
          ]
        };
        const myChart1 = echarts.init(this.$refs.mychart1);// 图标初始化
        myChart1.setOption(option1);// 渲染页面
        const myChart = echarts.init(this.$refs.mychart);// 图标初始化
        myChart.setOption(option);// 渲染页面
        const myChart3 = echarts.init(this.$refs.mychart3);// 图标初始化
        myChart3.setOption(option3);// 渲染页面
        const myChart2 = echarts.init(this.$refs.mychart2);// 图标初始化
        myChart2.setOption(option2);// 渲染页面
        const myChart4 = echarts.init(this.$refs.mychart4);// 图标初始化
        myChart4.setOption(option4);// 渲染页面
        const myChart5 = echarts.init(this.$refs.mychart5);// 图标初始化
        myChart5.setOption(option5);// 渲染页面
        //随着屏幕大小调节图表
        window.addEventListener("resize", () => {
          myChart.resize();
          myChart1.resize();
          myChart2.resize();
          myChart3.resize();
          myChart4.resize();
          myChart5.resize();
        });
      }
    }
  };
  </script>
  
  <style scoped>
  @import url(@/utils/demo-center.css);
  /* .custom-content-marker {
    width: 25px;
    height: 25px;
  }
  
  .custom-content-marker img {
    width: 25px;
    height: 25px;
  } */
  .boxbc1324 {
    position: absolute;
    left: 0;
    top: 50px;
    width: 38%;
    height: 240px;
  }
  
  .boxbc1323 {
    position: absolute;
    width: 58%;
    right: 0;
    top: 10px;
    height: 290px;
  }
  
  .boxbc1321 {
    left: 0;
    top: 10px;
    position: absolute;
    width: 38%;
    text-align: center;
    height: 30px;
    line-height: 30px;
    font-size: 16px;
    font-weight: 700;
  }
  
  .boxbc1322 {
    right: 0;
    top: 10px;
    position: absolute;
    width: 58%;
    text-align: center;
    height: 30px;
    line-height: 30px;
    font-size: 16px;
    font-weight: 700;
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
  
  .boxbc132 {
    position: absolute;
    top: 0;
    right: 0;
    width: 66.1%;
    height: 100%;
    background-color: #fff;
  }
  
  .boxbc131 {
    position: absolute;
    top: 0;
    left: 0;
    width: 32.1%;
    height: 100%;
    background-color: #fff;
  }
  
  .boxbc13 {
    width: 90%;
    position: relative;
    margin-left: 5%;
    margin-top: 20px;
    background-color: transparent;
    height: 290px;
  }
  
  .boxbc12 {
    width: 90%;
    position: relative;
    margin-left: 5%;
    background-color: white;
    height: 500px;
    margin-top: 20px;
  }
  
  .boxbc10 {
    position: relative;
    width: 100%;
    height: 20px;
    background-color: transparent;
  }
  
  .boxbc11 {
    position: relative;
    margin-left: 5%;
    width: 90%;
    height: 40px;
    text-align: center;
    line-height: 40px;
    font-weight: 700;
    font-size: 16px;
    background-color: #304156;
    color:white;
  }
  .boxbc1 {
    position: relative;
    width: 100%;
    min-height: calc(100vh - 78px);
    background-color: #eef0f3;
  }
  </style>