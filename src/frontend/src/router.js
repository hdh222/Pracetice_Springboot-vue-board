import Vue from "vue";
import VueRouter from "vue-router";
import Home from "./components/view/home";
import BoardList from "./components/view/Board/BoardList";
import BoardDetail from "@/components/view/Board/BoardDetail";
import BoardWriteForm from "./components/view/Board/BoardWriteForm";

Vue.use(VueRouter);

const route = [
    {path : "/", component : Home},
    {path : "/board/list", component: BoardList},
    {path : "/board/detail/:seq", component: BoardDetail},
    {path : "/board/write", component: BoardWriteForm}
];

const router = new VueRouter({
    mode : "history",
    routes : route
});

export default router;