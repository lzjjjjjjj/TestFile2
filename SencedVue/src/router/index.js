import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Main from '@/components/Main'
import China from '@/components/list/China'
import USA from '@/components/list/USA'
import Canada from '@/components/list/Canada'
import Japan from '@/components/list/Japan'
import guanli from '@/components/list/guanli'
import gongying from '@/components/list/gongying'
import rencai from '@/components/list/rencai'
import ElementUi from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.use(Router)
Vue.use(ElementUi)

export default new Router({
  routes: [
    {
      path: '/China',
      name: 'China',
      component: China
    },
    {
      path: '/guanli',
      name: 'guanli',
      component: guanli
    },
    {
      path: '/gongying',
      name: 'gongying',
      component: gongying
    },
    {
      path: '/rencai',
      name: 'rencai',
      component: rencai
    },
    {
      path: '/Canada',
      name: 'Canada',
      component: Canada
    },
    {
      path: '/USA',
      name: 'USA',
      component: USA
    },
    {
      path: '/Japan',
      name: 'Japan',
      component: Japan
    },
  ]
})
