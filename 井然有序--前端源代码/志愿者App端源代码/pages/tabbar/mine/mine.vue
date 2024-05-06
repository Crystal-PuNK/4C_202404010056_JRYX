<template>
	<view>
		<div class="box0"></div>
		<div class="box1"></div>
		<div class="box2">
			<img class="box20" src="static/gengmine.png" alt="" />
			<img class="box21" src="static/setmine.png" alt="" />
			<img class="box22" src="static/saomine.png" alt="" />
		</div>
		<div class="box6">
			<div class="box61">
				<img class="" src="static/touxiang1.jpg" alt="" />
			</div>
			<div class="box62">周公瑾</div>
			<img class="box63" src="static/jiantou1.png" alt="" />
		</div>
		<div class="box4">
			<div class="font4123 box41">15</div>
			<div class="font4123 box42">25</div>
			<div class="font4123 box43">9</div>
			<div class="font4456 box44">等级</div>
			<div class="font4456 box45">已完成</div>
			<div class="font4456 box46">发布</div>
		</div>
		<div class="box5">
			<div class="box51">我的动态</div>
			<div class="box52">消息</div>
			<div class="box53"></div>
			<!-- <div class="box54"></div> -->
		</div>
		<div class="box3">
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
			            name: '周公瑾',
			            description: '铁质井盖在道路和人行区域中起着重要的保护作用，因此定期维护和保养铁质井盖是非常重要的涂漆保护：定期为铁质井盖涂抹防锈漆......',
			            likes: 35,
			            comments: 112,
			            favorites: 214
			        },
					{
					    imageSrc: 'static/touxiang1.jpg',
					    name: '周公瑾',
					    description: '调整固定：如发现井盖松动或者不稳固，及时进行调整和固定，确保井盖安全固定在原位修复更换......',
					    likes: 935,
					    comments: 912,
					    favorites: 914
					},
					{
					    imageSrc: 'static/touxiang1.jpg',
					    name: '周公瑾',
					    description: '深入学习1231231231231231啦问问习的高级功能你啦啦啦啦啦啦啦问问习的高级功能你啦啦......',
					    likes: 935,
					    comments: 912,
					    favorites: 914
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
		top: 270px;
/* 		height: 40px;
		background-color: black; */
	}
	.box54{
		position: absolute;
		width: 10%;
		height: 4px;
		right: 25%;
		background-color: #0bd1ca;
		top: 23px;
		border-radius: 2px;
	}
	.box53{
		position: absolute;
		width: 18%;
		height: 4px;
		left: 19%;
		background-color: #0bd1ca;
		top: 23px;
		border-radius: 2px;
	}
	.box51{
		position: absolute;
		width: 18%;
		left: 19%;
		text-align: center;
		/* border-bottom: #0bd1ca 3px solid; */
	}
	.box52{
		position: absolute;
		width:10%;
		right: 25%;
		text-align: center;
		/* border-bottom: #0bd1ca 3px solid; */
	}
	.box5{
		width: 100%;
		font-size: 14px;
		position: absolute;
		top: 240px;
		left: 0;
	}
	.box44{
		left: 7%;
	}
	.box45{
		left: 40%;
	}
	.box46{
		right: 7%;
	}
	.font4456{
		font-size: 15px;
		position: absolute;
		top: 30px;
		width: 20%;
		text-align: center;
	}
	.box41{
		left: 7%;
	}
	.box42{
		left: 40%;
	}
	.box43{
		right: 7%;
	}
	.font4123{
		position: absolute;
		top: 0;
		font-weight: 700;
		font-size: 18px;
		color: #7f7f7f;
		width: 20%;
		text-align: center;
	}
	.box4{
		width: 100%;
		height: 60px;
		position: absolute;
		top: 155px;
		left: 0;
	}
	.box63{
		width: 6%;
		position: absolute;
		right: 5%;
		top: 33px;
	}
	.box62{
		color: black;
		font-weight: 900;
		position: absolute;
		left: 20%;
		top: 30px;
		font-size: 20px;
	}
	.box61 > img{
		width: 100%;
		height: 100%;
	}
	.box61{
		position: absolute;
		top: 20px;
		left: 5%;
		width: 12%;
		border-radius: 50%;
		aspect-ratio: 1/1;
		overflow: hidden;
	}
	.box6{
		height: 80px;
		width: 100%;
		position: absolute;
		top: 60px;
		/* background-color: white; */
	}
	.box20{
		position: absolute;
		top: 14px;
		right: 25%;
		width: 5%;
	}
	.box21{
		position: absolute;
		top: 13px;/* 加15px */
		right: 15%;/* 加2% */
		width: 5%;
	}
	.box22{
		position: absolute;
		top: 15px;
		right: 6%;
		width: 4%;
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
	.box2{
		position: absolute;
		top: 30px;
		left: 0;
		height: 20px;
		width: 100%;
	}
</style>