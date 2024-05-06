<template>
	<view>
		<div class="box0"></div>
		<div class="box1">
		</div>
		<div class="box2">
			<img class="box21" src="static/jiantou2.png" alt="" />
			<input class="box22" type="text" placeholder="井盖编号/任务/动态"/>
			<img class="box23" src="static/sousuo.png" alt="" />
		</div>
		<div class="box3">
			历史记录：
			<img class="box31" src="static/shanchu.png" alt="" />
		</div>
		  <div class="box4" v-for="(item, index) in items" :key="index">
		    <div class="box41">{{ item }}</div>
			<img class="box42" src="static/shanchu1.png" alt="" />
		  </div>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				items: ['#3568111', '成华区井盖修护经验', '西安井盖数量持续上涨', '#3568444', '北京井盖安全调查']
			}
		},
		methods: {
			
		}
	}
</script>

<style>
	.box42 {
	  position: absolute;
	  display: inline-block;
	  color: #8a8a8a; /* 设置叉号的颜色为红色 */
	  width: 5%;
	  top: 13px;
	  right: 1%;
	}
	.box31{
		position: relative;
		width: 6%;
		left: 63%;
		top: 3px;
	}
	.box41{
		display: inline-block;
		margin-top: 10px;
		color: #8a8a8a;
	}
	.box4{
		margin-left: 5%;
		width: 90%;
		position: relative;
	}
	.box3{
		position: relative;
		margin-top: 30px;
		margin-left: 5%;
		font-size: 18px;
		font-weight: 800;
		color: #8a8a8a;
		margin-bottom: 10px;
	}
	.box23{
		width: 7%;
		position: absolute;
		right: 5%;
		top: 2px;
	}
	.box22{
		position: absolute;
		left: 15%;
		width: 70%;
		height: 30px;
		background-color: white;
		border-radius: 10px;
	}
	.box21{
		transform: rotate(180deg);
		position: absolute;
		left: 3%;
		top: 0;
		width: 8%;
	}
	.box1{
		width: 100%;
		height: 30px;
		position: relative;
	}
	.box2{
		width: 100%;
		height: 40px;
		position: relative;
	}
	.box0{
		position: absolute;
		width: 100%;
		height: 300px;
		background: linear-gradient(to bottom, #0bd1ca, #f2f2f2);
		z-index: -1;
	}
</style>
