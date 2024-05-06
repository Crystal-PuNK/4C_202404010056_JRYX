<template>
	<view>
		<div class="box0"></div>
		<div class="box1">
			历史订单
		</div>
		<div class="box2">
			<div class="box20 box21">未完成</div>
			<div class="box20 box22">已完成</div>
		</div>
		<div class="box3">
			<!-- 介绍必须只有一行 -->
			  <div v-for="(item, index) in items" :key="index" class="box31">
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
		data() {
			return {
				title: 'Hello',
				items: [
				      { number: '#34556', exp: '+15Exp', description: '圆形铁质井盖，三天内均可进行检查', image: 'static/gps.png', location: '四川省.成都市.成华区', distance: '距离我10km' },
				      { number: '#22516', exp: '+12Exp', description: 'L形大理石井盖，三天内均可进行检查', image: 'static/gps.png', location: '四川省.成都市.成华区', distance: '距离我1km' ,},
					  { number: '#22516', exp: '+12Exp', description: 'L形大理石井盖，三天内均可进行检查', image: 'static/gps.png', location: '四川省.成都市.成华区', distance: '距离我1km' },
					  { number: '#22516', exp: '+12Exp', description: 'L形大理石井盖，三天内均可进行检查', image: 'static/gps.png', location: '四川省.成都市.成华区', distance: '距离我1km' },
					  { number: '#22516', exp: '+12Exp', description: 'L形大理石井盖，三天内均可进行检查', image: 'static/gps.png', location: '四川省.成都市.成华区', distance: '距离我1km' },
					  { number: '#22516', exp: '+12Exp', description: 'L形大理石井盖，三天内均可进行检查', image: 'static/gps.png', location: '四川省.成都市.成华区', distance: '距离我1km' }
					  // 可以继续添加其他数据对象
				    ]
			}
		},
		onLoad() {
	
		},
		methods: {
	
		}
	}
</script>

<style>
	.box316{
			font-size: 10px;
			color: #abacaa;
			position: absolute;
			right: 5%;
			bottom: 13px;
		}
		.box315{
			font-size: 10px;
			position: absolute;
			left: 9%;
			bottom: 13px;
		}
		.box314{
			left: 3%;
			width: 6%;
			position: absolute;
			bottom: 10px;
		}
		.box313{
			font-size: 10px;
			position: absolute;
			left: 4%;
			height: 26px;
			top: 42px;
			width: 92%;
	/* 		font-weight: 700; */
		}
		.box312{
			font-size: 18px;
			font-weight: 700;
			height: 20px;
			position: absolute;
			right: 5%;
			top: 10px;
			color: #0bd1ca;
			line-height: 20px;
		}
		.box311{
			font-size: 18px;
			font-weight: 700;
			height: 20px;
			position: absolute;
			left: 4%;
			top: 10px;
			line-height: 20px;
		}
		.box31{
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
		.box32{
			width: 100%;
			height: 60px;
		}
		.box3{
			width: 100%;
			height: 40px;
			position: absolute;
			left: 0;
			top: 120px;
		}
	.box22{
		right: 15%;
	}
	.box21{
		left: 15%;
	}
	.box20{
		font-size: 15px;
		position: absolute;
		width: 16%;
		text-align: center;
		height: 24px;
		top: 9px;
		/* border-bottom: 2px #0bd1ca solid; */
	}
	.box1{
		font-size: 18px;
		width: 100%;
		height: 50px;
		background-color: #0bd1ca;
		position: fixed;
		left: 0;
		top: 30px;
		z-index: 1;
		color: white;
		line-height: 50px;
		text-align: center;
	}
	.box0{
		width: 100%;
		height: 30px;
		background-color: #0bd1ca;
		position: fixed;
		left: 0;
		right: 0;
		z-index: 1;
	}
	.box2{
		width: 100%;
		height: 40px;
		background-color: white;
		position: fixed;
		top: 80px;
		z-index: 1;
	}
</style>