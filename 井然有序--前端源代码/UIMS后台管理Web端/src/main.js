import Vue from 'vue'
import App from './App.vue'
import router from './router'
import * as echarts from "echarts";
Vue.config.productionTip = false

new Vue({
  router,
  echarts,
  render: h => h(App)
}).$mount('#app')
