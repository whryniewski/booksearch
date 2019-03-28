import Vue from 'vue'
import Router from 'vue-router'
import BookSearch from '@/components/BookSearch'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'BookSearch',
      component: BookSearch
    }
  ]
})
