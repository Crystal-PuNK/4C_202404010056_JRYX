import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginView from '@/views/loginView.vue'
import MainView from '@/views/mainView.vue'
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'login',
    component: LoginView
  },
  {
    path: '/main',
    name: 'main',
    component: MainView
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
