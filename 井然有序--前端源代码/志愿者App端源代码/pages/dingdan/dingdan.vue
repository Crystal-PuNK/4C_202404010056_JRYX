<template>
	<view>
		<div class="box0"></div>
		<div class="box1"></div>
		<div class="box2">
			<img class="box21" src="static/jiantou2.png" alt="" />
		</div>
		<div class="box3">发布者</div>
		<div class="box4"></div>
		<div class="box5">
			<img src="static/touxiang1.jpg" alt="" />
		</div>
		<div class="box6">荀彧</div>
		<div class="box7">电话：13673449476</div>
		<div class="box8">邮箱：1139827051@qq.com</div>
		<div class="box9">任务</div>
		<div class="box10"></div>
		<div class="box11">井盖样式：圆形铁质井盖</div>
		<div class="box12">
			<img class="box121" src="static/jinggai.png" alt="" />
			<div class="box122">
				<div class="box1221">井盖编号：#32551</div>
				<div class="box1222">+15Exp</div>
			</div>
			<div class="box122a">描述：圆形铁质井盖，距离发布任务</div>
			<div class="box123">
				<div class="box1231">位置：四川省.成都市.成华区.成华大道137号附近</div>
				<div class="box1232">导航</div>
			</div>
			<div class="box124">
				发布时间：2024.03.05 11:21
			</div>
			<div class="box125">
				接受
			</div>
		</div>
	</view>
</template>

<script>
	export default {
		data() {
			return {
			};
		},
		onLoad() {
	
		},
		methods: {
	
		}
	}

</script>

<style>
	.box125{
		font-size: 17px;
		width: 80px;
		text-align: center;
		height: 35px;
		line-height: 35px;
		margin-left: 8%;
		background-color: #0bd1ca;
		color:white;
		border-radius: 7px;
		margin-top: 20px;
	}
	.box124{
		margin-left: 8%;
		font-size: 12px;
	}
	.box122a{
		font-size: 14px;
		width: 84%;
		margin-left: 8%;
		margin-top: 10px;
	}
	div{
		box-sizing: border-box;
	}
	.box1232{
		display: inline-block;
		font-size: 12px;
		height: 22px;
		margin-top: 9px;
		margin-left: 10px;
		background-color: #0ad1ca;
		width: 45px;
		text-align: center;
		border-radius: 5px;
		line-height: 22px;
		color: white;
	}
	.box1231{
		display: inline-block;
		font-size: 12px;
		height: 40px;
		line-height: 40px;
		margin-left: 8%;
	}
	.box123{
		width: 100%;
	}
	.box1222{
		display: inline-block;
		margin-top: 15px;
		margin-left: 8%;
		color: #11d2cb;
		font-weight: 800;
		height: 20px;
		line-height: 20px;
	}
	.box1221{
		display: inline-block;
		margin-top: 15px;
		margin-left: 8%;
		font-size: 15px;
		height: 20px;
		line-height: 20px;
	}
	.box122{
		width: 100%;
	}
	.box121{
		margin-left: 8%;
		display: block;
	}
	.box12{
		width: 100%;
		position: absolute;
		left: 0%;
		top: 360px;
		height: 100px;
	}
	.box11{
		position: absolute;
		left: 8%;
		font-size: 15px;
		top: 320px;
	}
	.box10{
		width: 50%;
		height: 2px;
		position: absolute;
		left: 8%;
		top: 300px;
		background-color: #797979;
	}
	.box9{
		position: absolute;
		left: 8%;
		font-size: 18px;
		top: 270px;
		font-weight: 800;
	}
	.box7{
		position: absolute;
		left: 8%;
		top: 190px;
		font-size: 15px;
	}
	.box8{
		position: absolute;
		left: 8%;
		top: 215px;
		font-size: 15px;
	}
	.box6{
		position: absolute;
		left: 24%;
		top: 143px;
		font-size: 18px;
		font-weight: 800;
	}
	.box5 > img{
		width: 100%;
		height: 100%;
	}
	.box5{
		position: absolute;
		top: 134px;
		left: 8%;
		width: 12%;
		border-radius: 50%;
		aspect-ratio: 1/1;
		overflow: hidden;
	}
	.box4{
		width: 50%;
		height: 2px;
		position: absolute;
		left: 8%;
		top: 120px;
		background-color: #797979;
	}
	.box3{
		position: absolute;
		left: 8%;
		font-size: 18px;
		top: 90px;
		font-weight: 800;
	}
	.box21{
		transform: rotate(180deg);
		width: 7%;
		position: absolute;
		top: 0;
		left: 3%;
	}
	.box2{
		width: 100%;
		position: absolute;
		height: 50px;
		top: 30px;
	}
	.box0{
		position: absolute;
		width: 100%;
		height: 300px;
		background: linear-gradient(to bottom, #0bd1ca, #f2f2f2);
		z-index: -1;
	}
	.box1{
		position: absolute;
		top: 0;
		left: 0;
		width: 100%;
		height: 30px;
	}
</style>