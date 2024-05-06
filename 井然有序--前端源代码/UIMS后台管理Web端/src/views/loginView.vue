<template>
  <div class="boxa">
    <div class="boxb"></div>
    <div class="boxc">
      <div class="boxca">系统登陆</div>
      <div class="boxcb"></div>
      <div class="boxcc">
        <img class="boxcca" src="@/images/login/user.png" alt="" />
        <input class="boxccb" type="text" id="account"/>
      </div>
      <div class="boxcd"></div>
      <div class="boxce">
        <img class="boxcca" src="@/images/login/suo.png" alt="" />
        <input class="boxccb" type="text" id="password"/>
        <img @click="changeInputTypeToPassword" class="boxccc" ref="myImage" :src="imgUrl" alt=""/>
      </div>
      <div class="boxcf"></div>
      <div class="boxcg" @click="goToMain">登录</div>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      isHide: true,
      imgUrl: require('@/images/login/yanjingkai.png')
    }
  },
  methods: {
    changeInputTypeToPassword () {
      const inputElement = document.querySelector('#password')
      if (this.isHide) {
        inputElement.setAttribute('type', 'password')
        this.isHide = false
        this.imgUrl = require('@/images/login/yanjingbi.png')
      } else {
        inputElement.setAttribute('type', 'text')
        this.isHide = true
        this.imgUrl = require('@/images/login/yanjingkai.png')
      }
    },
    goToMain () {
      this.$router.push('/main') // 在Vue Router中将'/main'替换为您要跳转的页面路径
    }
  }
}
</script>

<style scoped>
.boxcg:hover{
  cursor: pointer;
  background-color: #46a6ff;
}
.boxcg{
  border-radius: 5px;
  position: relative;
  margin: 0 auto;
  width: 29.75%;
  height: 35px;
  background-color: #1890ff;
  transition: background-color 0.5s;
  font-size: 14px;
  text-align: center;
  line-height: 35px;
  color: white;
}
.boxcf{
  position: relative;
  margin: 0 auto;
  width: 29.75%;
  height: 28px;
}
.boxccc:hover {
  cursor: pointer;
}
.boxccc {
  position: absolute;
  width: 18px;
  height: 18px;
  top: 14.5px;
  right: 15px;
}
input[type="password"]::-ms-reveal{
 display:none
}
.boxccb {
  all: unset;
  background-color: rgba(0, 0, 0, 0);
  position: absolute;
  left: 48px;
  height: 18px;
  line-height: 18px;
  font-size: 14px;
  color: white;
  top: 14.5px;
  width: 87%;
}

.boxcca {
  position: absolute;
  width: 18px;
  height: 18px;
  top: 14.5px;
  left: 15px;
}

.boxce {
  position: relative;
  margin: 0 auto;
  width: 29.75%;
  height: 47px;
  background-color: #283443;
  border: 1px solid hsla(0, 0%, 100%, .1);
  border-radius: 5px;
}

.boxcd {
  position: relative;
  margin: 0 auto;
  width: 29.75%;
  height: 28px;
}

.boxcc {
  position: relative;
  margin: 0 auto;
  width: 29.75%;
  height: 47px;
  background-color: #283443;
  border: 1px solid hsla(0, 0%, 100%, .1);
  border-radius: 5px;
}

.boxcb {
  position: relative;
  margin: 0 auto;
  width: 29.75%;
  height: 30px;
}

.boxca {
  position: relative;
  width: 100%;
  text-align: center;
  height: 40px;
  line-height: 40px;
  font-size: 26px;
  color: #eee;
  font-weight: 700;
}

.boxa {
  position: relative;
  background-color: #2d3a4b;
  width: 100vw;
  /* 盒子宽度等于视窗宽度 */
  height: 100vh;
  /* 盒子高度等于视窗高度 */
}

.boxb {
  position: relative;
  width: 100%;
  height: 20%;
}

.boxc {
  position: relative;
  width: 100%;
}
</style>
