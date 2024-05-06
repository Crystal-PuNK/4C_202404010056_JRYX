<template>
  <div>
    <div :style="{ width: boxWidth }" ref="boxs" class="boxs">
      <!-- 这里是写死的菜单菜单，采用文档流 @mouseenter="changeBackgroundColor(0, true)" @mouseleave="changeBackgroundColor(0, false)" -->
      <!-- 首页 -->
      <div class="boxs1" @click="onePageClick(0)" :class="{ 'to263445': bigpages[0].flag1 }"
        @mouseenter="oneTwopageMouseIn(0)" @mouseleave="oneTwopageMouseOut(0)">
        <img class="boxs11" :src="bigpages[0].imageUrl">
        <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[0].flag3 }">{{ bigpages[0].title }}</div>
      </div>
      <!-- 文档 -->
      <div class="boxs1" @click="onePageClick(1)" :class="{ 'to263445': bigpages[1].flag1 }"
        @mouseenter="oneTwopageMouseIn(1)" @mouseleave="oneTwopageMouseOut(1)">
        <img class="boxs11" :src="bigpages[1].imageUrl">
        <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[1].flag3 }">{{ bigpages[1].title }}</div>
      </div>
      <!-- 二级菜单示例 -->
      <div class="boxs1" @click="twoPageClick(2)" :class="{ 'to263445': bigpages[2].flag1 }"
        @mouseenter="oneTwopageMouseIn(2)" @mouseleave="oneTwopageMouseOut(2)">
        <img class="boxs11" :src="bigpages[2].imageUrl">
        <div v-show="flag4" class="boxs12" :class="{ 'toWhiteFont': bigpages[2].flag3 }">{{ bigpages[2].title }}</div>
        <!-- 搞一个下箭头和上箭头 -->
        <img v-show="flag4" class="jiantou" :src="bigpages[2].jiantouurl" alt="">
      </div>
      <!-- 三级菜单示例 * 3 -->
      <div class="threeone" :class="{ 'threeonehover': bigpages[2].flag5 }">
        <div class="boxs1 boxs1s" @click="threePageClick(2, 3)" :class="{ 'to001528': bigpages[3].flag1 }"
          @mouseenter="oneTwopageMouseIn(3)" @mouseleave="threepageMouseOut(3)">
          <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[3].flag3 }">{{ bigpages[3].title }}
          </div>
        </div>
        <div class="boxs1 boxs1s" @click="threePageClick(2, 4)" :class="{ 'to001528': bigpages[4].flag1 }"
          @mouseenter="oneTwopageMouseIn(4)" @mouseleave="threepageMouseOut(4)">
          <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[4].flag3 }">{{ bigpages[4].title }}
          </div>
        </div>
        <div class="boxs1 boxs1s" @click="threePageClick(2, 5)" :class="{ 'to001528': bigpages[5].flag1 }"
          @mouseenter="oneTwopageMouseIn(5)" @mouseleave="threepageMouseOut(5)">
          <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[5].flag3 }">{{ bigpages[5].title }}
          </div>
        </div>
      </div>
      <!-- 来个用户管理二级菜单 -->
      <div class="boxs1" @click="twoPageClick(6)" :class="{ 'to263445': bigpages[6].flag1 }"
        @mouseenter="oneTwopageMouseIn(6)" @mouseleave="oneTwopageMouseOut(6)">
        <img class="boxs11" :src="bigpages[6].imageUrl">
        <div v-show="flag4" class="boxs12" :class="{ 'toWhiteFont': bigpages[6].flag3 }">{{ bigpages[6].title }}</div>
        <img v-show="flag4" class="jiantou" :src="bigpages[6].jiantouurl" alt="">
      </div>
      <!-- 用户管理下的三级菜单 -->
      <div class="threeone" :class="{ 'threeonehover': bigpages[6].flag5 }">
        <div class="boxs1 boxs1s" @click="threePageClick(6, 7)" :class="{ 'to001528': bigpages[7].flag1 }"
          @mouseenter="oneTwopageMouseIn(7)" @mouseleave="threepageMouseOut(7)">
          <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[7].flag3 }">{{ bigpages[7].title }}
          </div>
        </div>
        <div class="boxs1 boxs1s" @click="threePageClick(6, 8)" :class="{ 'to001528': bigpages[8].flag1 }"
          @mouseenter="oneTwopageMouseIn(8)" @mouseleave="threepageMouseOut(8)">
          <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[8].flag3 }">{{ bigpages[8].title }}
          </div>
        </div>
        <!-- <div class="boxs1 boxs1s" @click="threePageClick(6, 9)" :class="{ 'to001528': bigpages[9].flag1 }"
          @mouseenter="oneTwopageMouseIn(9)" @mouseleave="threepageMouseOut(9)">
          <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[9].flag3 }">{{ bigpages[9].title }}
          </div>
        </div> -->
      </div>
      <div class="boxs1" @click="twoPageClick(9)" :class="{ 'to263445': bigpages[9].flag1 }"
        @mouseenter="oneTwopageMouseIn(9)" @mouseleave="oneTwopageMouseOut(9)">
        <img class="boxs11" :src="bigpages[9].imageUrl">
        <div v-show="flag4" class="boxs12" :class="{ 'toWhiteFont': bigpages[9].flag3 }">{{ bigpages[9].title }}</div>
        <img v-show="flag4" class="jiantou" :src="bigpages[9].jiantouurl" alt="">
      </div>
      <div class="threeone" :class="{ 'threeonehover': bigpages[9].flag5 }">
        <div class="boxs1 boxs1s" @click="threePageClick(9, 10)" :class="{ 'to001528': bigpages[10].flag1 }"
          @mouseenter="oneTwopageMouseIn(10)" @mouseleave="threepageMouseOut(10)">
          <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[10].flag3 }">{{ bigpages[10].title }}
          </div>
        </div>
        <div class="boxs1 boxs1s" @click="threePageClick(9, 11)" :class="{ 'to001528': bigpages[11].flag1 }"
          @mouseenter="oneTwopageMouseIn(11)" @mouseleave="threepageMouseOut(11)">
          <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[11].flag3 }">{{ bigpages[11].title }}
          </div>
        </div>
        <div class="boxs1 boxs1s" @click="threePageClick(9, 12)" :class="{ 'to001528': bigpages[12].flag1 }"
          @mouseenter="oneTwopageMouseIn(12)" @mouseleave="threepageMouseOut(12)">
          <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[12].flag3 }">{{ bigpages[12].title }}
          </div>
        </div>
      </div>
      <div class="boxs1" @click="onePageClick(13)" :class="{ 'to263445': bigpages[13].flag1 }"
        @mouseenter="oneTwopageMouseIn(13)" @mouseleave="oneTwopageMouseOut(13)">
        <img class="boxs11" :src="bigpages[13].imageUrl">
        <div v-show="flag4" class="boxs12" :class="{ 'toBluefont': bigpages[13].flag3 }">{{ bigpages[13].title }}</div>
      </div>
      <!-- footer -->
    </div>
    <div class="boxb" :style="{ left: boxLeft }">
      <div class="boxba">
        <!-- 这里用来写访问路径的 -->
        <div class="boxba0" @click="shrinkWidth"></div>
        <img class="boxbaa" @click="shrinkWidth" :src="shousuourl">
        <div class="boxbab">{{ perUrl }}</div>
      </div>
      <div class="boxbb">
        <!-- 这里用来写访问过的页面的 这里似乎不允许删除 -->
        <div class="boxbb0">
          <div class="boxbba" @click="togreen(index)"
            :class="{ 'boxbba1': page[index].flag1, 'boxbba2': !page[index].flag1 }" v-for="(item, index) in page"
            :key="index">{{ item.pageName }}
            <div v-if="index != 0" class="boxbba11" @click="deletePage(index)">x</div>
          </div>
        </div>
      </div>
      <div class="boxbc">
          <MainBoxbc1 v-if="bigpages[0].flag3" />
          <MainBoxbc2 v-if="bigpages[4].flag3" />
          <WeiHu v-if="bigpages[7].flag3" />
          <ZhiYuan v-if="bigpages[8].flag3" />
          <PaiFa v-if="bigpages[13].flag3" />
          <JingGaiCom v-if="bigpages[11].flag3" />
          <SystemSet v-if="bigpages[1].flag3" />
          <statusSet v-if="bigpages[3].flag3" />
          <FeiJi v-if="bigpages[5].flag3" />
          <RenWuLiShi v-if="bigpages[10].flag3" />
          <ShiBieResult v-if="bigpages[12].flag3" />
        </div>
    </div>
  </div>
</template>


<script>
import statusSet from '@/components/statusSet.vue'
import MainBoxbc1 from '@/components/MainBoxbc1.vue'
import MainBoxbc2 from '@/components/MainBoxbc2.vue'
import WeiHu from '@/components/WeiHu.vue'
import ZhiYuan from '@/components/ZhiYuan.vue'
import PaiFa from '@/components/PaiFa.vue'
import JingGaiCom from '@/components/JingGaiCom.vue'
import SystemSet from '@/components/SystemSet.vue'
import FeiJi from '@/components/FeiJi.vue'
import RenWuLiShi from '@/components/RenWuLiShi.vue'
import ShiBieResult from '@/components/ShiBieResult.vue'
export default {
  data () {
    return {
      perUrl: '',
      page: [],
      // {
      //   pageName: '首页', // 就是哪个页面的标题
      //   flag1: false,
      //   pindex: 0
      // }
      zhiyoushouye: true,
      boxLeft: '210px',
      shousuourl: require('@/images/main/shouqi.png'),
      boxWidth: '210px',
      boxshow: false,
      flag4: true,
      jiantouurl1: require('@/images/main/jiantou.png'),
      jiantouurl2: require('@/images/main/jiantou1.png'),
      bigpages: [
        {
          imageUrl: require('@/images/main/shouye1.png'),
          description: '这是第一张图片的描述', // 无用
          flag1: false, // 就是进入退出时控制背景颜色的
          title: '首页',
          flag3: false, // 无论怎么说flag3都是控制一级菜单是否是被选中状态的。toBlue必须只能是简单的把菜单变蓝
          url1: require('@/images/main/shouye.png'),
          url2: require('@/images/main/shouye1.png'),
          grade: 1,
          paopaoflag: false,
          baseurl: '首页'
        },
        {
          imageUrl: require('@/images/main/wendang1.png'),
          description: '这是第一张图片的描述',
          flag1: false,
          title: '系统设置',
          flag3: false,
          url1: require('@/images/main/wendang.png'),
          url2: require('@/images/main/wendang1.png'),
          grade: 1, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          baseurl: '系统设置'
        },
        {
          imageUrl: require('@/images/main/wurenji1.png'),
          description: '这是第一张图片的描述',
          flag1: false,
          title: '无人机',
          flag3: false,
          url1: require('@/images/main/wurenji.png'),
          url2: require('@/images/main/wurenji1.png'),
          grade: 2, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          jiantouurl: require('@/images/main/jiantou1.png')
        },
        { // 搞几个三级菜单
          flag1: false,
          title: '状态管理',
          flag3: false,
          url1: require('@/images/main/wurenji.png'),
          url2: require('@/images/main/wurenji1.png'),
          grade: 3, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          baseurl: '首页 / 状态管理',
          faindex: 2
        },
        { // 搞几个三级菜单 #1f2d3d #001528
          flag1: false,
          title: '航线配置',
          flag3: false,
          grade: 3, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          baseurl: '首页 / 航线配置',
          faindex: 2
        },
        { // 搞几个三级菜单
          flag1: false,
          title: '位置一览',
          flag3: false,
          grade: 3, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          baseurl: '首页 / 位置一览',
          faindex: 2
        },
        {
          imageUrl: require('@/images/main/yonghuguanli1.png'),
          description: '这是第一张图片的描述',
          flag1: false,
          title: '用户管理',
          flag3: false,
          url1: require('@/images/main/yonghuguanli.png'),
          url2: require('@/images/main/yonghuguanli1.png'),
          grade: 2, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          jiantouurl: require('@/images/main/jiantou1.png')
        },
        { // 搞几个三级菜单
          flag1: false,
          title: '维护人员',
          flag3: false,
          url1: require('@/images/main/wurenji.png'),
          url2: require('@/images/main/wurenji1.png'),
          grade: 3, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          baseurl: '用户管理 / 维护人员',
          faindex: 6
        },
        { // 搞几个三级菜单 #1f2d3d #001528
          flag1: false,
          title: '志愿者',
          flag3: false,
          grade: 3, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          baseurl: '用户管理 / 志愿者',
          faindex: 6
        },
        {
          imageUrl: require('@/images/shuju/shujubai.png'),
          description: '这是第一张图片的描述',
          flag1: false,
          title: '数据查看',
          flag3: false,
          url1: require('@/images/shuju/shujubai.png'),
          url2: require('@/images/shuju/shujuhui.png'),
          grade: 2, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          jiantouurl: require('@/images/main/jiantou1.png')
        },
        { // 搞几个三级菜单
          flag1: false,
          title: '任务历史',
          flag3: false,
          url1: require('@/images/main/wurenji.png'),
          url2: require('@/images/main/wurenji1.png'),
          grade: 3, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          baseurl: '首页 / 任务历史',
          faindex: 9
        },
        { // 搞几个三级菜单 #1f2d3d #001528
          flag1: false,
          title: '井盖状态',
          flag3: false,
          grade: 3, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          baseurl: '首页 / 井盖状态',
          faindex: 9
        },
        { // 搞几个三级菜单 #1f2d3d #001528
          flag1: false,
          title: '识别结果',
          flag3: false,
          grade: 3, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          flag5: false,
          baseurl: '首页 / 识别结果',
          faindex: 9
        },
        {
          imageUrl: require('@/images/paifa/paifalan.png'),
          description: '这是第一张图片的描述',
          flag1: false,
          title: '智能派发',
          flag3: false,
          url1: require('@/images/paifa/paifalan.png'),
          url2: require('@/images/paifa/paifahui.png'),
          grade: 1, // 用于识别是否是一级页面 还是二级页面
          paopaoflag: false,
          baseurl: '智能派发'
        }
      ]
    }
  },
  components: {
    MainBoxbc1,
    MainBoxbc2,
    WeiHu,
    ZhiYuan,
    PaiFa,
    JingGaiCom,
    SystemSet,
    statusSet,
    FeiJi,
    RenWuLiShi,
    ShiBieResult
  },
  mounted () {
    this.onePageClick(0)
  },
  methods: { // 一级页面和三级页面的baseUrl一旦点击,就应该更新首页baseUrl
    pageClear () {
      this.page.forEach(item => {
        item.flag1 = false
      })
    },
    deletePage (pindex) {
      if (this.page[pindex].flag1 === true) {
        this.page[pindex - 1].flag1 = true
      }
      this.page.splice(pindex, 1)
      event.stopPropagation()
    },
    togreen (index) {
      this.pageClear()
      this.page[index].flag1 = true
      const fdx = this.page[index].pindex
      if (this.bigpages[fdx].grade === 1) {
        // 属于一级页面调用oneclick
        this.onePageClick(fdx)
      } else if (this.bigpages[fdx].grade === 3) {
        // 属于三级页面
        this.threePageClick(this.bigpages[fdx].faindex, fdx)
      }
    },
    shrinkWidth () {
      if (this.flag4) {
        // 展开状态
        this.boxWidth = '56px' // 设置宽度为56px
        this.shousuourl = require('@/images/main/shouqi1.png')
        this.flag4 = false
        this.boxLeft = '56px'
        // 这里应该将所有展开的二级菜单全部收起
        this.bigpages.filter(item => {
          return item.grade === 2 && item.flag5 === true
        }).forEach(item => {
          item.flag5 = false
          item.jiantouurl = this.jiantouurl2
        })
      } else {
        this.boxWidth = '210px' // 设置宽度为56px
        this.shousuourl = require('@/images/main/shouqi.png')
        this.flag4 = true
        this.boxLeft = '210px'
      }
    },
    onePageClick (index) {
      // 对于一级菜单flag3就已经控制该菜单是否被选中右边是否有页面展出
      if (this.bigpages[index].flag3) {
        // 待写
      } else {
        this.bigPageFlag3Clear()
        this.oneTwoPageIconHuifu()
        this.bigpages[index].imageUrl = this.bigpages[index].url1
        this.bigpages[index].flag3 = true
        // 那实际这里就缺少了一段功能 被点中的一级页面应该展示出来
        this.perUrl = this.bigpages[index].baseurl
        this.pageClear()
        const pindexToCheck = index
        const duplicateIndex = this.page.findIndex(item => item.pindex === pindexToCheck)
        if (duplicateIndex !== -1) {
          this.togreen(duplicateIndex)
        } else {
          this.page.push({ pageName: this.bigpages[index].title, flag1: true, pindex: index })
        }
      }
    },
    twoPageClick (index) {
      // 对于二级页面flag3只是控制其是否变白,但这个点击不会让其变白,只会让其展开,因此我们操作flag5,并且不会影响其它页面
      if (this.bigpages[index].flag5) {
        // 收起
        this.bigpages[index].flag5 = false
        this.bigpages[index].jiantouurl = this.jiantouurl2
      } else {
        // 展开
        this.bigpages[index].flag5 = true
        this.bigpages[index].jiantouurl = this.jiantouurl1
      }
    },
    threePageClick (faindex, index) {
      this.bigPageFlag3Clear()
      this.oneTwoPageIconHuifu()
      // 注意将父亲菜单的flag3调真, 将自己的调蓝.
      this.bigpages[faindex].imageUrl = this.bigpages[faindex].url1
      this.bigpages[faindex].flag3 = true
      this.bigpages[index].flag3 = true
      this.perUrl = this.bigpages[index].baseurl
      this.pageClear()
      const pindexToCheck = index
      const duplicateIndex = this.page.findIndex(item => item.pindex === pindexToCheck)
      if (duplicateIndex !== -1) {
        this.togreen(duplicateIndex)
      } else {
        this.page.push({ pageName: this.bigpages[index].title, flag1: true, pindex: index })
      }
    },
    oneTwopageMouseIn (index) {
      this.bigpages[index].flag1 = true
    },
    oneTwopageMouseOut (index) {
      this.bigpages[index].flag1 = false
    },
    threepageMouseIn (index) {
      this.bigpages[index].flag1 = true
    },
    threepageMouseOut (index) {
      this.bigpages[index].flag1 = false
    },
    bigPageFlag3Clear () {
      this.bigpages.forEach(item => {
        item.flag3 = false
      })
    },
    oneTwoPageIconHuifu () {
      this.bigpages.filter(item => {
        return item.grade === 1 || 2
      }).forEach(item => {
        item.imageUrl = item.url2
      })
    }
    // toBlue (index) {
    //   if (this.items[index].flag3) {
    //     // 已经被选中了其实也要做选择回到一级菜单但我们先不写
    //   } else { // 未被选中就要重新加了
    //     this.items.forEach(item => {
    //       item.flag3 = false
    //       item.imageUrl = item.url2
    //     })
    //     this.items[index].imageUrl = this.items[index].url1
    //     this.items[index].flag3 = true
    //     PageUtils.pageClear(this.page)
    //     const newIndex = index
    //     const isDuplicate = this.page.some(item => item.pindex === newIndex)
    //     if (!isDuplicate) {
    //       this.page.push({ pageName: this.items[index].title, flag1: true, flag2: false, pindex: newIndex })
    //     } else {
    //       const existingPage = this.page.find(item => item.pindex === newIndex)
    //       existingPage.flag1 = true
    //       existingPage.flag2 = false
    //     }
    //   }
    // },
    // changeBackgroundColor (index, isHover) {
    //   if (isHover) {
    //     this.items[index].flag2 = true // 鼠标进入时改变背景颜色
    //     this.items[index].flag1 = false
    //     // 我希望鼠标进入时可以判断是否为展开状态并显示泡泡
    //     if (this.items[index].grade === 1 && this.boxWidth === '56px') {
    //       this.items[index].paopaoflag = true
    //     }
    //   } else {
    //     this.items[index].flag1 = true // 鼠标进入时改变背景颜色
    //     this.items[index].flag2 = false
    //     if (this.items[index].grade === 1 && this.boxWidth === '56px') {
    //       this.items[index].paopaoflag = false
    //     }
    //   }
    // }
  }
}
</script>
<style scoped>
.boxbab {
  position: absolute;
  top: 0px;
  left: 70px;
  font-size: 14px;
  height: 50px;
  line-height: 50px;
}

.boxx13 {
  width: 100px;
  height: 30px;
  position: absolute;
  right: -20px;
  background-color: black;
}

.threeonehover {
  max-height: 168px !important;
}

.threeone {
  position: relative;
  width: 100%;
  max-height: 0px;
  transition: max-height 0.6s;
  overflow: hidden;
}

.box {
  height: 200px;
  width: 200px;
  background-color: black;
}

.draw-enter-active,
.draw-leave-active {
  transition: all 1s ease;
}

.draw-enter,
.draw-leave-to

/* .fade-leave-active below version 2.1.8 */
  {
  height: 0;
}

.to001528 {
  background-color: #001528 !important;
}

.boxs1s {
  background-color: #1f2d3d;
}

.jiantou {
  position: absolute;
  width: 20px;
  top: 21px;
  right: 10px;
}

.toWhiteFont {
  color: white
}

@import url(@/style/main/css/main.css);

.boxbba11 {
  position: relative;
  top: -1px;
  left: 2px;
  display: inline-block;
  background-color: transparent;
  text-align: center;
  width: 13px;
  height: 13px;
  line-height: 8px;
  font-size: 12px;
  border-radius: 6px;
  transition: background-color 0.5s;
}

.boxbba11:hover {
  background-color: #b4bccc;
}

.boxbc {
  position: relative;
  width: 100%;
}
</style>
