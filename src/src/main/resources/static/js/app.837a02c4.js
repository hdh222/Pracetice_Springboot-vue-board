(function(e){function t(t){for(var r,a,l=t[0],s=t[1],i=t[2],p=0,d=[];p<l.length;p++)a=l[p],Object.prototype.hasOwnProperty.call(o,a)&&o[a]&&d.push(o[a][0]),o[a]=0;for(r in s)Object.prototype.hasOwnProperty.call(s,r)&&(e[r]=s[r]);c&&c(t);while(d.length)d.shift()();return u.push.apply(u,i||[]),n()}function n(){for(var e,t=0;t<u.length;t++){for(var n=u[t],r=!0,l=1;l<n.length;l++){var s=n[l];0!==o[s]&&(r=!1)}r&&(u.splice(t--,1),e=a(a.s=n[0]))}return e}var r={},o={app:0},u=[];function a(t){if(r[t])return r[t].exports;var n=r[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,a),n.l=!0,n.exports}a.m=e,a.c=r,a.d=function(e,t,n){a.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},a.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},a.t=function(e,t){if(1&t&&(e=a(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(a.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var r in e)a.d(n,r,function(t){return e[t]}.bind(null,r));return n},a.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return a.d(t,"a",t),t},a.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},a.p="/";var l=window["webpackJsonp"]=window["webpackJsonp"]||[],s=l.push.bind(l);l.push=t,l=l.slice();for(var i=0;i<l.length;i++)t(l[i]);var c=s;u.push([0,"chunk-vendors"]),n()})({0:function(e,t,n){e.exports=n("56d7")},"56d7":function(e,t,n){"use strict";n.r(t);n("e260"),n("e6cf"),n("cca6"),n("a79d");var r=n("2b0e"),o=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{attrs:{id:"app"}},[n("Header"),n("router-link",{attrs:{to:"/"}},[e._v("/")]),n("br"),n("router-link",{attrs:{to:"/about"}},[e._v("/About")]),n("div",{staticClass:"content",attrs:{id:"content"}},[n("router-view")],1)],1)},u=[],a=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("h1",[e._v("하이하이")])},l=[],s={name:"Header"},i=s,c=n("2877"),p=Object(c["a"])(i,a,l,!1,null,null,null),d=p.exports,f={name:"App",components:{Header:d}},v=f,m=Object(c["a"])(v,o,u,!1,null,null,null),b=m.exports,h=n("8c4f"),g=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("form",{on:{submit:e.submitForm}},[n("div",[n("label",{attrs:{for:"userId"}},[e._v("id: ")]),n("input",{directives:[{name:"model",rawName:"v-model",value:e.userId,expression:"userId"}],attrs:{type:"text",id:"userId"},domProps:{value:e.userId},on:{input:function(t){t.target.composing||(e.userId=t.target.value)}}}),n("label",{attrs:{for:"userPw"}},[e._v("pw: ")]),n("input",{directives:[{name:"model",rawName:"v-model",value:e.userPw,expression:"userPw"}],attrs:{type:"password",id:"userPw"},domProps:{value:e.userPw},on:{input:function(t){t.target.composing||(e.userPw=t.target.value)}}}),n("button",{attrs:{type:"submit"}},[e._v("로그인")])])])},w=[],_=n("bc3a"),y=n.n(_),P={name:"home",data:function(){return{userId:"",userPw:""}},methods:{submitForm:function(){var e={userId:this.userId,userPw:this.userPw},t="/api/login";y.a.post(t,e).then((function(e){console.log(e)})).catch((function(e){console.log(e)}))}}},O=P,j=Object(c["a"])(O,g,w,!1,null,null,null),x=j.exports,I=function(){var e=this,t=e.$createElement;e._self._c;return e._m(0)},$=[function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("table")])}],k=void 0,E={name:"about",data:function(){return{list:{}}}};y.a.get("/api/board").then((function(e){console.log(e),console.log(e.data),console.log(e.data[1]),k.list.lists=e.data,console.log(k.list)})).catch((function(e){console.log(e)}));var S=E,M=Object(c["a"])(S,I,$,!1,null,null,null),H=M.exports;r["a"].use(h["a"]);var T=[{path:"/",component:x},{path:"/about",component:H}],A=new h["a"]({mode:"history",routes:T}),F=A;r["a"].config.productionTip=!1,new r["a"]({router:F,render:function(e){return e(b)}}).$mount("#app")}});
//# sourceMappingURL=app.837a02c4.js.map