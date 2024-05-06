<template>
	<view>
		<div class="box0"></div>
		<div class="box1">
			<div class="box11">
				<div class="box111">成都</div>
				<img class="box112" src="static/jiantou1.png" alt="" />
			</div>
			<div class="box12">
				<img @click="handleClick" class="box121" src="static/saoyisao1.png" alt="" />
				<div class="box122"></div>
				<div class="box123">搜索</div>
			</div>
			<img class="box13" src="static/three.png" alt="" />
		</div>
		<div class="box2">
			<div class="box21 box20">推荐</div>
			<div class="box22 box20">附近</div>
			<div class="box23 box20">最新</div>
			<div class="box24">区县</div>
			<div class="box25">筛选</div>
		</div>
		<div class="box3">
			<!-- 介绍必须只有一行 -->
			<div v-for="(item, index) in items" :key="index" class="box31" @click="gotoAnotherPage">
				<div class="box311">{{ item.number }}</div>
				<div class="box312">{{ item.exp }}</div>
				<div class="box313">{{ item.description }}</div>
				<img class="box314" :src="item.image" alt="" />
				<div class="box315">{{ item.location }}</div>
				<div class="box316">{{ item.distance }}</div>
			</div>
			<div class="box32"></div>
		</div>
	</view>
</template>

<script>
export default {
	data () {
		return {
			title: 'Hello',
			items: [
				{
 number: '#34556', exp: '+15', description: '圆形铁质井盖，三天内均可进行检查', image: 'static/gps.png',
					location: '四川省.成都市.成华区', distance: '距离我1.3km' 
},
				{
 number: '#22516', exp: '+13', description: 'L形大理石井盖，需在二十小时内完成', image: 'static/gps.png',
					location: '四川省.成都市.锦江区', distance: '距离我3.7km', 
},
				{
 number: '#23216', exp: '+13', description: 'L形大理石井盖，三天内均可进行检查', image: 'static/gps.png',
					location: '四川省.成都市.金牛区', distance: '距离我1.8km' 
},
				{
 number: '#23514', exp: '+13', description: 'L形大理石井盖，三天内均可进行检查', image: 'static/gps.png',
					location: '四川省.成都市.高新区', distance: '距离我1.5km' 
},
				{
 number: '#32516', exp: '+13', description: 'L形大理石井盖，三天内均可进行检查', image: 'static/gps.png',
					location: '四川省.成都市.龙泉驿区', distance: '距离我1.9km' 
},
				{
 number: '#12522', exp: '+13', description: 'L形大理石井盖，三天内均可进行检查', image: 'static/gps.png',
					location: '四川省.成都市.成华区', distance: '距离我1km' 
}
				// 可以继续添加其他数据对象
			]
		}
	},
	onLoad () {

	},
	methods: {
		handleClick () {
			// 在这里编写点击触发的功能
			console.log('图片被点击了')
			uni.scanCode({
				onlyFromCamera: true,
				success: function (res) {
					console.log('条码类型：' + res.scanType)
					console.log('条码内容：' + res.result)
				}
			})
		},
		gotoAnotherPage () {
			uni.navigateTo({ url: 'renwuxiangqing/renwuxiangqing' })
		}
	}
}
</script>

<style>
.box316 {
	font-size: 10px;
	color: #abacaa;
	position: absolute;
	right: 5%;
	bottom: 13px;
}

.box315 {
	font-size: 10px;
	position: absolute;
	left: 9%;
	bottom: 13px;
}

.box314 {
	left: 3%;
	width: 6%;
	position: absolute;
	bottom: 10px;
}

.box313 {
	font-size: 10px;
	position: absolute;
	left: 4%;
	height: 26px;
	top: 42px;
	width: 92%;
	/* 		font-weight: 700; */
}

.box312 {
	font-size: 18px;
	font-weight: 700;
	height: 20px;
	position: absolute;
	right: 5%;
	top: 10px;
	color: #0bd1ca;
	line-height: 20px;
}

.box311 {
	font-size: 18px;
	font-weight: 700;
	height: 20px;
	position: absolute;
	left: 4%;
	top: 10px;
	line-height: 20px;
}

.box31 {
	width: 94%;
	position: relative;
	left: 0;
	top: 0;
	margin-top: 10px;
	margin-left: 3%;
	height: 100px;
	background-color: white;
	border-radius: 15px;
}

.box32 {
	width: 100%;
	height: 60px;
}

.box3 {
	width: 100%;
	height: 40px;
	position: absolute;
	left: 0;
	top: 120px;
}

.box24 {
	position: absolute;
	right: 16%;
	top: 8px;
	font-size: 13px;
	width: 10%;
	height: 24px;
	background-color: #f2f2f2;
	text-align: center;
	line-height: 24px;
}

.box25 {
	position: absolute;
	right: 4%;
	top: 8px;
	font-size: 13px;
	width: 10%;
	height: 24px;
	background-color: #f2f2f2;
	text-align: center;
	line-height: 24px;
}

.box20 {
	font-size: 13px;
	position: absolute;
	width: 10%;
	height: 20px;
	line-height: 20px;
	text-align: center;
	overflow: hidden;
	/* border-bottom: 2px solid #0bd1ca; */
	top: 10px;
}

.box21 {
	left: 4%;
}

.box22 {
	left: 16%;
}

.box23 {
	left: 28%;
}

.box2 {
	width: 100%;
	height: 40px;
	background-color: white;
	position: fixed;
	top: 80px;
	left: 0;
	z-index: 1;
}

.box13 {
	position: absolute;
	right: 0;
	top: -5%;
	height: 100%;
}

.box123 {
	background-color: #0bd1ca;
	width: 18%;
	height: 80%;
	position: absolute;
	right: 3%;
	top: 10%;
	font-size: 13px;
	color: white;
	text-align: center;
	line-height: 20px;
	border-radius: 5px;
}

.box122 {
	position: absolute;
	left: 14%;
	top: 15%;
	width: 0.5px;
	background-color: #abacaa;
	height: 70%;
}

.box121 {
	position: absolute;
	width: 9%;
	left: 3%;
	top: 5%;
}

.box12 {
	position: absolute;
	width: 65%;
	height: 50%;
	left: 20%;
	top: 25%;
	background-color: white;
	border-radius: 10px;
}

.box112 {
	position: absolute;
	right: 10%;
	width: 25%;
	top: 35%;
	transform: rotate(90deg);
}

.box111 {
	position: absolute;
	left: 10%;
	font-size: 16px;
	height: 100%;
	line-height: 50px;
	color: white;
}

.box11 {
	position: absolute;
	left: 2%;
	top: 0;
	width: 16.8%;
	height: 100%;
}

.box1 {
	width: 100%;
	height: 50px;
	background-color: #0bd1ca;
	position: fixed;
	left: 0;
	top: 30px;
	z-index: 1;
}

.box0 {
	width: 100%;
	height: 30px;
	background-color: #0bd1ca;
	position: fixed;
	left: 0;
	right: 0;
	z-index: 1;
}
</style>