(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/yonghu/add-or-update"],{"393c":function(e,n,t){"use strict";t.r(n);var r=t("d640"),a=t.n(r);for(var i in r)"default"!==i&&function(e){t.d(n,e,(function(){return r[e]}))}(i);n["default"]=a.a},"5ecd":function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return a})),t.d(n,"c",(function(){return i})),t.d(n,"a",(function(){return r}));var a=function(){var e=this,n=e.$createElement;e._self._c},i=[]},"7b7c":function(e,n,t){"use strict";t.r(n);var r=t("5ecd"),a=t("393c");for(var i in a)"default"!==i&&function(e){t.d(n,e,(function(){return a[e]}))}(i);t("d416");var u,o=t("f0c5"),c=Object(o["a"])(a["default"],r["b"],r["c"],!1,null,"b14a9734",null,!1,r["a"],u);n["default"]=c.exports},d416:function(e,n,t){"use strict";var r=t("de51"),a=t.n(r);a.a},d640:function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=a(t("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function i(e,n,t,r,a,i,u){try{var o=e[i](u),c=o.value}catch(s){return void t(s)}o.done?n(c):Promise.resolve(c).then(r,a)}function u(e){return function(){var n=this,t=arguments;return new Promise((function(r,a){var u=e.apply(n,t);function o(e){i(u,r,a,o,c,"next",e)}function c(e){i(u,r,a,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("5f99"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{cross:"",ruleForm:{yonghuzhanghao:"",yonghuxingming:"",mima:"",xingbie:"",nianling:"",dianhua:""},xingbieOptions:[],xingbieIndex:0,user:{},ro:{yonghuzhanghao:!1,yonghuxingming:!1,mima:!1,xingbie:!1,nianling:!1,dianhua:!1}}},components:{wPicker:o},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var t=this;return u(r.default.mark((function a(){var i,u,o,c;return r.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return i=e.getStorageSync("nowTable"),a.next=3,t.$api.session(i);case 3:if(u=a.sent,t.user=u.data,t.xingbieOptions="男,女".split(","),t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=14;break}return t.ruleForm.id=n.id,a.next=12,t.$api.info("yonghu",t.ruleForm.id);case 12:u=a.sent,t.ruleForm=u.data;case 14:if(t.cross=n.cross,!n.cross){a.next=46;break}o=e.getStorageSync("crossObj"),a.t0=r.default.keys(o);case 18:if((a.t1=a.t0()).done){a.next=46;break}if(c=a.t1.value,"yonghuzhanghao"!=c){a.next=24;break}return t.ruleForm.yonghuzhanghao=o[c],t.ro.yonghuzhanghao=!0,a.abrupt("continue",18);case 24:if("yonghuxingming"!=c){a.next=28;break}return t.ruleForm.yonghuxingming=o[c],t.ro.yonghuxingming=!0,a.abrupt("continue",18);case 28:if("mima"!=c){a.next=32;break}return t.ruleForm.mima=o[c],t.ro.mima=!0,a.abrupt("continue",18);case 32:if("xingbie"!=c){a.next=36;break}return t.ruleForm.xingbie=o[c],t.ro.xingbie=!0,a.abrupt("continue",18);case 36:if("nianling"!=c){a.next=40;break}return t.ruleForm.nianling=o[c],t.ro.nianling=!0,a.abrupt("continue",18);case 40:if("dianhua"!=c){a.next=44;break}return t.ruleForm.dianhua=o[c],t.ro.dianhua=!0,a.abrupt("continue",18);case 44:a.next=18;break;case 46:t.styleChange();case 47:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(e){this.xingbieIndex=e.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(r.default.mark((function t(){var a,i,u,o,c,s,l,g,d,f;return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(n.ruleForm.yonghuzhanghao){t.next=3;break}return n.$utils.msg("用户账号不能为空"),t.abrupt("return");case 3:if(n.ruleForm.yonghuxingming){t.next=6;break}return n.$utils.msg("用户姓名不能为空"),t.abrupt("return");case 6:if(n.ruleForm.mima){t.next=9;break}return n.$utils.msg("密码不能为空"),t.abrupt("return");case 9:if(!n.ruleForm.nianling||n.$validate.isIntNumer(n.ruleForm.nianling)){t.next=12;break}return n.$utils.msg("年龄应输入整数"),t.abrupt("return");case 12:if(!n.ruleForm.dianhua||n.$validate.isMobile(n.ruleForm.dianhua)){t.next=15;break}return n.$utils.msg("电话应输入手机格式"),t.abrupt("return");case 15:if(!n.cross){t.next=31;break}if(o=e.getStorageSync("statusColumnName"),c=e.getStorageSync("statusColumnValue"),""==o){t.next=31;break}if(s=e.getStorageSync("crossObj"),o.startsWith("[")){t.next=27;break}for(l in s)l==o&&(s[l]=c);return g=e.getStorageSync("crossTable"),t.next=25,n.$api.update("".concat(g),s);case 25:t.next=31;break;case 27:a=Number(e.getStorageSync("userid")),i=s["id"],u=e.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 31:if(!i||!a){t.next=53;break}return n.ruleForm.crossuserid=a,n.ruleForm.crossrefid=i,d={page:1,limit:10,crossuserid:a,crossrefid:i},t.next=37,n.$api.list("yonghu",d);case 37:if(f=t.sent,!(f.data.total>=u)){t.next=43;break}return n.$utils.msg(e.getStorageSync("tips")),t.abrupt("return",!1);case 43:if(!n.ruleForm.id){t.next=48;break}return t.next=46,n.$api.update("yonghu",n.ruleForm);case 46:t.next=50;break;case 48:return t.next=50,n.$api.add("yonghu",n.ruleForm);case 50:n.$utils.msgBack("提交成功");case 51:t.next=61;break;case 53:if(!n.ruleForm.id){t.next=58;break}return t.next=56,n.$api.update("yonghu",n.ruleForm);case 56:t.next=60;break;case 58:return t.next=60,n.$api.add("yonghu",n.ruleForm);case 60:n.$utils.msgBack("提交成功");case 61:case"end":return t.stop()}}),t)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,a=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,a=a>9?a:"0"+a,"".concat(t,"-").concat(r,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,t("543d")["default"])},de51:function(e,n,t){},edbc:function(e,n,t){"use strict";(function(e){t("82b6");r(t("66fd"));var n=r(t("7b7c"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])}},[["edbc","common/runtime","common/vendor"]]]);