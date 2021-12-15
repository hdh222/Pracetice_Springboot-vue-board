import Vue from "vue";
import VueRouter from "vue-router";
import Home from "./components/view/home";
import About from "./components/view/about";


Vue.use(VueRouter);

const route = [
    {path : "/", component : Home},
    {path : "/about", component: About},
];

const router = new VueRouter({
    mode : "history",
    routes : route
});

export default router;