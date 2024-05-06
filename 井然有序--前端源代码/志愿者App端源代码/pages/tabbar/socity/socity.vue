<template>
	<view>
		<div class="box0"></div>
		<div class="box1">
			<div class="box11">
				<div class="box111">成都</div>
				<img class="box112" src="static/jiantou1.png" alt="" />
			</div>
			<div class="box12">
				<img class="box121" src="static/saoyisao1.png" alt="" />
				<div class="box122"></div>
				<div class="box123">搜索</div>
			</div>
			<img class="box13" src="static/three.png" alt="" />
		</div>
		<div class="box2">
			<div class="box20 box21">关注</div>
			<div class="box20 box22">推荐</div>
			<div class="box20 box23">最新</div>
		</div>
		<div class="box3">
			<!-- 注意所有的介绍都必须是三行,且必须是全汉字或汉字符号-->
			<div class="box31" v-for="(item, index) in items" :key="index">
			    <img class="box311" :src="item.imageSrc" alt="" />
			    <div class="box312">{{ item.name }}</div>
			    <div class="box313">{{ item.description }}</div>
			    <img class="box318" src="static/dianzan.png" alt="" />
			    <img class="box319" src="static/pinglun.png" alt="" />
			    <img class="box3191" src="static/shoucang.png" alt="" />
			    <div class="box3192">{{ item.likes }}</div>
			    <div class="box3193">{{ item.comments }}</div>
			    <div class="box3194">{{ item.favorites }}</div>
			</div>
		</div>
	</view>
</template>

<script>
	export default {
		data() {
			return {
			    items: [
			        { 
			            imageSrc: 'static/touxiang1.jpg',
			            name: '元宝',
			            description: '深入学习的高级功能你啦啦啦啦啦啦啦啦啦啦问问习的高级功能你啦啦啦啦啦啦啦问问习的高级功能你啦啦......',
			            likes: 935,
			            comments: 912,
			            favorites: 914
			        },
					{
					    imageSrc: 'static/touxiang1.jpg',
					    name: '猪头',
					    description: '深入学习的高级功能你啦啦啦啦啦啦啦啦啦啦问问习啦啦啦啦啦啦啦啦啦问问习的高级功能你啦啦啦啦啦......',
					    likes: 925,
					    comments: 112,
					    favorites: 114
					},
					{
					    imageSrc: 'static/touxiang1.jpg',
					    name: '去大理',
					    description: '深入学习1231231231231231啦问问习的高级功能你啦啦啦啦啦啦啦问问习的高级功能你啦啦......',
					    likes: 335,
					    comments: 412,
					    favorites: 514
					},
			        // Add more items as needed
			    ]
			}
		},
		onLoad() {
	
		},
		methods: {}
	}

</script>
<style>
	.box3192{
		position: absolute;
/* 		top: 147px; */
		bottom: 18px;
		left: 15%;
		font-size: 14px;
		color: #8a8a8a;
	}
	.box3193{
		position: absolute;
/* 		top: 147px; */
		left: 42%;
		bottom: 18px;
		font-size: 14px;
		color: #8a8a8a;
	}
	.box3194{
		position: absolute;
/* 		top: 147px; */
		left: 72%;
		bottom: 18px;
		font-size: 14px;
		color: #8a8a8a;
	}
	.box319{
		width: 6%;
		position: absolute;
		left: 35%;
/* 		top: 145px; */
		bottom: 18px;
	}
	.box3191{
		width: 6%;
		position: absolute;
		left: 65%;
/* 		top: 145px; */
		bottom: 18px;
	}
	.box318{
		width: 6%;
		position: absolute;
		left: 8%;
/* 		top: 145px; */
		bottom: 18px;
	}
	.box317{
		font-weight: 500;
		color: #0bd1ca;
		position: absolute;
		top: 113px;
		right: 10%;
	}
	.box316{
		position: absolute;
		background-color: gray;
		width: 4px;
		height: 4px;
		border-radius: 2px;
		top: 122px;
		right: 22.5%;
	}
	.box315{
		position: absolute;
		background-color: gray;
		width: 4px;
		height: 4px;
		border-radius: 2px;
		top: 122px;
		right: 19.5%;
	}
	.box314{
		position: absolute;
		background-color: gray;
		width: 4px;
		height: 4px;
		border-radius: 2px;
		top: 122px;
		right: 25.5%;
	}
	.box313{
		position: absolute;
		left: 8%;
		top: 67px;
		width: 84%;
		font-weight: 500;
		height: 62px;
	}
	.box312{
		font-size: 18px;
		font-weight: 700;
		position: absolute;
		left: 20%;
		top: 29px;
	}
	.box311{
		position: absolute;
		width: 12%;
		border-radius: 50%;
		background-color: black;
		left: 6%;
		top: 20px;
		overflow: hidden;
	}
	.box31{
		position: relative;
		margin-top: 10px;
		width: 94%;
		margin-left: 3%;
		height: 200px;
		background-color: white;
		border-radius: 15px;
	}
	.box3{
		position: absolute;
		width: 100%;
		top: 120px;
/* 		height: 40px;
		background-color: black; */
	}
	.box20{
		position: absolute;
		top: 4px;
		font-size: 15px;
		/* border-bottom: #0bd1ca 2px solid; */
	}
	.box21{
		left: 10%;
		width: 12%;
		text-align: center;
		height: 28px;
		line-height: 28px;
	}
	.box22{
		left: 44%;
		width: 12%;
		text-align: center;
		height: 28px;
		line-height: 28px;
	}
	.box23{
		right: 10%;
		width: 12%;
		text-align: center;
		height: 28px;
		line-height: 28px;
	}
	.box2{
		width: 100%;
		height: 40px;
		background-color: white;
		position: fixed;
		top: 80px;
		z-index: 1;
	}
	.box13{
		position: absolute;
		right: 0;
		top: -5%;
		height: 100%;
	}
	.box123{
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
	.box122{
		position: absolute;
		left: 14%;
		top: 15%;
		width: 0.5px;
		background-color: #abacaa;
		height: 70%;
	}
	.box121{
		position: absolute;
		width: 9%;
		left: 3%;
		top: 5%;
	}
	.box12{
		position: absolute;
		width: 65%;
		height: 50%;
		left: 20%;
		top: 25%;
		background-color: white;
		border-radius: 10px;
	}
	.box112{
		position: absolute;
		right: 10%;
		width: 25%;
		top: 35%;
		transform: rotate(90deg);
	}
	.box111{
		position: absolute;
		left: 10%;
		font-size: 16px;
		height: 100%;
		line-height: 50px;
		color: white;
	}
	.box11{
		position: absolute;
		left: 2%;
		top: 0;
		width: 16.8%;
		height: 100%;
	}
	.box1{
		width: 100%;
		height: 50px;
		background-color: #0bd1ca;
		position: fixed;
		left: 0;
		top: 30px;
		z-index: 1;
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
</style>