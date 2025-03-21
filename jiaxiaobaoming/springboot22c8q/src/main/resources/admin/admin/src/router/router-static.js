import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yuyuejiaolian from '@/views/modules/yuyuejiaolian/list'
    import discussjiaxiaojiaolian from '@/views/modules/discussjiaxiaojiaolian/list'
    import kechenganpai from '@/views/modules/kechenganpai/list'
    import jiaxiaojiaolian from '@/views/modules/jiaxiaojiaolian/list'
    import cheliangyuyue from '@/views/modules/cheliangyuyue/list'
    import kaoshibaoming from '@/views/modules/kaoshibaoming/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import jiaxiaokaoshi from '@/views/modules/jiaxiaokaoshi/list'
    import jiaxiaobaoming from '@/views/modules/jiaxiaobaoming/list'
    import jiaxiaoxinxi from '@/views/modules/jiaxiaoxinxi/list'
    import jiaxiaocheliang from '@/views/modules/jiaxiaocheliang/list'
    import kechengjindu from '@/views/modules/kechengjindu/list'
    import config from '@/views/modules/config/list'
    import discussjiaxiaoxinxi from '@/views/modules/discussjiaxiaoxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/yuyuejiaolian',
        name: '预约教练',
        component: yuyuejiaolian
      }
      ,{
	path: '/discussjiaxiaojiaolian',
        name: '驾校教练评论',
        component: discussjiaxiaojiaolian
      }
      ,{
	path: '/kechenganpai',
        name: '课程安排',
        component: kechenganpai
      }
      ,{
	path: '/jiaxiaojiaolian',
        name: '驾校教练',
        component: jiaxiaojiaolian
      }
      ,{
	path: '/cheliangyuyue',
        name: '车辆预约',
        component: cheliangyuyue
      }
      ,{
	path: '/kaoshibaoming',
        name: '考试报名',
        component: kaoshibaoming
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/jiaxiaokaoshi',
        name: '驾校考试',
        component: jiaxiaokaoshi
      }
      ,{
	path: '/jiaxiaobaoming',
        name: '驾校报名',
        component: jiaxiaobaoming
      }
      ,{
	path: '/jiaxiaoxinxi',
        name: '驾校信息',
        component: jiaxiaoxinxi
      }
      ,{
	path: '/jiaxiaocheliang',
        name: '驾校车辆',
        component: jiaxiaocheliang
      }
      ,{
	path: '/kechengjindu',
        name: '课程进度',
        component: kechengjindu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discussjiaxiaoxinxi',
        name: '驾校信息评论',
        component: discussjiaxiaoxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
