<template>
	<div id="base" style="top: 20px;">
		<div class="boxdingge"
			style="position: absolute;z-index: 100000;top: -20px;left: 0;background-color: #2767af;width: 100vw;height: 20px;">
		</div>
		<!-- Unnamed (矩形) -->
		<div id="u0" class="ax_default box_1">
			<div id="u0_div" class=""></div>
			<div id="u0_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u1" class="ax_default _文本">
			<div id="u1_div" class=""></div>
			<div id="u1_text" class="text ">
				<p><span>成都</span></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u2" class="ax_default box_1">
			<div id="u2_div" class=""></div>
			<div id="u2_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u3" class="ax_default _图像">
			<img id="u3_img" class="img " src="static/images/index/u3.png" />
			<div id="u3_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u4" class="ax_default _文本">
			<div id="u4_div" class=""></div>
			<div id="u4_text" class="text ">
				<p><span>搜索</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u5" class="ax_default _图像">
			<img id="u5_img" class="img " src="static/images/index/u5.png" />
			<div id="u5_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u6" class="ax_default box_1">
			<div id="u6_div" class=""></div>
			<div id="u6_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u7" class="ax_default box_1">
			<div id="u7_div" class=""></div>
			<div id="u7_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u8" class="ax_default _标题_3">
			<div id="u8_div" class=""></div>
			<div id="u8_text" class="text ">
				<p><span>维修器械</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u9" class="ax_default _图像">
			<img id="u9_img" class="img " src="static/images/index/u9.png" />
			<div id="u9_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u10" class="ax_default box_2">
			<div id="u10_div" class=""></div>
			<div id="u10_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u11" class="ax_default _图像">
			<img id="u11_img" class="img " src="static/images/index/u11.png" />
			<div id="u11_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u12" class="ax_default _标题_3">
			<div id="u12_div" class=""></div>
			<div id="u12_text" class="text ">
				<p><span>申请工具</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u13" class="ax_default _图像">
			<img id="u13_img" class="img " src="static/images/index/u13.png" />
			<div id="u13_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u14" class="ax_default _标题_3">
			<div id="u14_div" class=""></div>
			<div id="u14_text" class="text ">
				<p><span>资格证</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u15" class="ax_default _图像">
			<img id="u15_img" class="img " src="static/images/index/u15.png" />
			<div id="u15_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u16" class="ax_default _文本">
			<div id="u16_div" class=""></div>
			<div id="u16_text" class="text ">
				<p><span>对相关维修资格证进行备案</span></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u17" class="ax_default box_1">
			<div id="u17_div" class=""></div>
			<div id="u17_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u18" class="ax_default _图像" @click="goTo(path5)">
			<img id="u18_img" class="img " src="static/images/index/u18.png" />
			<div id="u18_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u19" class="ax_default _文本" @click="goTo(path5)">
			<div id="u19_div" class=""></div>
			<div id="u19_text" class="text ">
				<p><span>实时监控</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u20" class="ax_default _图像">
			<img id="u20_img" class="img " src="static/images/index/u20.png" />
			<div id="u20_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u21" class="ax_default _文本">
			<div id="u21_div" class=""></div>
			<div id="u21_text" class="text ">
				<p><span>任务管理</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u22" class="ax_default _图像">
			<img id="u22_img" class="img " src="static/images/index/u22.png" />
			<div id="u22_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u23" class="ax_default _文本">
			<div id="u23_div" class=""></div>
			<div id="u23_text" class="text ">
				<p><span>历史数据</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u24" class="ax_default _图像">
			<img id="u24_img" class="img " src="static/images/index/u24.png" />
			<div id="u24_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u25" class="ax_default _文本">
			<div id="u25_div" class=""></div>
			<div id="u25_text" class="text ">
				<p><span>GPS</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u26" class="ax_default _图像">
			<img id="u26_img" class="img " src="static/images/index/u26.png" />
			<div id="u26_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u27" class="ax_default _文本">
			<div id="u27_div" class=""></div>
			<div id="u27_text" class="text ">
				<p><span>维护指导</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u28" class="ax_default _图像">
			<img id="u28_img" class="img " src="static/images/index/u28.png" />
			<div id="u28_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u29" class="ax_default _文本">
			<div id="u29_div" class=""></div>
			<div id="u29_text" class="text ">
				<p><span>工具报修</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u30" class="ax_default _图像">
			<img id="u30_img" class="img " src="static/images/index/u30.png" />
			<div id="u30_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u31" class="ax_default _文本">
			<div id="u31_div" class=""></div>
			<div id="u31_text" class="text ">
				<p><span>通知报警</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u32" class="ax_default _图像">
			<img id="u32_img" class="img " src="static/images/index/u32.png" />
			<div id="u32_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u33" class="ax_default _文本">
			<div id="u33_div" class=""></div>
			<div id="u33_text" class="text ">
				<p><span>更多</span></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u34" class="ax_default box_1">
			<div id="u34_div" class=""></div>
			<div id="u34_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u35" class="ax_default _标题_3">
			<div id="u35_div" class=""></div>
			<div id="u35_text" class="text ">
				<p><span>资讯中心</span></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u36" class="ax_default _文本">
			<div id="u36_div" class=""></div>
			<div id="u36_text" class="text ">
				<p><span>最新区域开放信息</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u37" class="ax_default _图像">
			<img id="u37_img" class="img " src="static/images/index/u37.png" />
			<div id="u37_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (直线 / 行距) -->
		<div id="u38" class="ax_default line">
			<img id="u38_img" class="img " src="static/images/index/u38.svg" />
			<div id="u38_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u39" class="ax_default _图像">
			<img id="u39_img" class="img " src="static/images/index/u39.svg" />
			<div id="u39_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u40" class="ax_default _文本">
			<div id="u40_div" class=""></div>
			<div id="u40_text" class="text ">
				<p><span>科幻公园新加入检修目标区域，急招新维修工人...</span></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u41" class="ax_default _文本">
			<div id="u41_div" class=""></div>
			<div id="u41_text" class="text ">
				<p><span>2024-3-28</span></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u42" class="ax_default box_1">
			<div id="u42_div" class=""></div>
			<div id="u42_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u43" class="ax_default _标题_3">
			<div id="u43_div" class=""></div>
			<div id="u43_text" class="text ">
				<p><span>服务中心</span></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u44" class="ax_default _文本">
			<div id="u44_div" class=""></div>
			<div id="u44_text" class="text ">
				<p><span>寻找人工客服服务</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u45" class="ax_default _图像">
			<img id="u45_img" class="img " src="static/images/index/u37.png" />
			<div id="u45_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (直线 / 行距) -->
		<div id="u46" class="ax_default line">
			<img id="u46_img" class="img " src="static/images/index/u38.svg" />
			<div id="u46_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u47" class="ax_default _图像">
			<img id="u47_img" class="img " src="static/images/index/u47.png" />
			<div id="u47_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u48" class="ax_default _图像">
			<img id="u48_img" class="img " src="static/images/index/u48.png" />
			<div id="u48_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u49" class="ax_default _图像">
			<img id="u49_img" class="img " src="static/images/index/u49.png" />
			<div id="u49_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u50" class="ax_default _图像">
			<img id="u50_img" class="img " src="static/images/index/u50.png" />
			<div id="u50_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>
		<!-- u51 ~u63 -->
		<!-- Unnamed (矩形) -->
		<div id="u51" class="ax_default box_1">
			<div id="u51_div" class=""></div>
			<div id="u51_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (椭圆) -->
		<div id="u52" class="ax_default ellipse" @click="saoyisao()">
			<img id="u52_img" class="img " src="static/images/index/u52.svg" />
			<div id="u52_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (椭圆) -->
		<div id="u53" class="ax_default ellipse">
			<img id="u53_img" class="img " src="static/images/index/u53.svg" />
			<div id="u53_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u54" class="ax_default _图像">
			<img id="u54_img" class="img " src="static/images/index/u54.png" />
			<div id="u54_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u55" class="ax_default _文本">
			<div id="u55_div" class=""></div>
			<div id="u55_text" class="text ">
				<p><span>扫一扫</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u56" class="ax_default _图像">
			<img id="u56_img" class="img " src="static/images/index/u56.png" />
			<div id="u56_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u57" class="ax_default _文本" @click="goTo(path1)">
			<div id="u57_div" class=""></div>
			<div id="u57_text" class="text ">
				<p><span>首页</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u58" class="ax_default _图像">
			<img id="u58_img" class="img " src="static/images/index/u58.png" />
			<div id="u58_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u59" class="ax_default _文本" @click="goTo(path2)">
			<div id="u59_div" class=""></div>
			<div id="u59_text" class="text ">
				<p><span>任务</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u60" class="ax_default _图像">
			<img id="u60_img" class="img " src="static/images/index/u60.png" />
			<div id="u60_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u61" class="ax_default _文本" @click="goTo(path3)">
			<div id="u61_div" class=""></div>
			<div id="u61_text" class="text ">
				<p><span>通知</span></p>
			</div>
		</div>

		<!-- Unnamed (图像) -->
		<div id="u62" class="ax_default _图像">
			<img id="u62_img" class="img " src="static/images/index/u62.png" />
			<div id="u62_text" class="text " style="display:none; visibility: hidden">
				<p></p>
			</div>
		</div>

		<!-- Unnamed (矩形) -->
		<div id="u63" class="ax_default _文本" @click="goTo(path4)">
			<div id="u63_div" class=""></div>
			<div id="u63_text" class="text ">
				<p><span>我的</span></p>
			</div>
		</div>
	</div>
</template>

<script>
export default {
	data () {
		return {
			path2: '../renwu/renwu',
			path3: '../xiaoxi/xiaoxi',
			path4: '../wode/wode',
			path1: '../shouye/index',
			path5: '../shishijiankong/shishijiankong'
		}
	},
	methods: {
		goTo (upath) {
			uni.navigateTo({ url: upath })
		},
		saoyisao () {
			uni.scanCode({
				success: function (res) {
					console.log(res)
					// res中包含扫描结果等信息，可以根据需要进行处理
				},
				fail: function (error) {
					console.log(error)
					// 扫描失败时的处理逻辑
				}
			})
		}
	}
}
</script>

<style scoped>
@import url(@/static/style/styles.css);
@import url(@/static/style/index/styles.css);
@import url(@/static/style/axure_rp_page.css);
</style>