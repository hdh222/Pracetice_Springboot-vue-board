<template>
  <div>
    <table>
       <tr v-for="item in list" :key="item.seq">
        <router-link :to="`/board/detail/${item.seq}`"><td>{{item.seq}}</td></router-link>
        <td>{{item.title}}</td>
        <td>{{item.content}}</td>
        <td>{{item.writer}}</td>
        <td>{{item.date}}</td>
      </tr>
    </table>
    <router-link to="/board/write">새글작성</router-link>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "about",
  data(){
    return{
      list : []
    }
  },
  methods: {
    getList : function(){
      axios.get("/api/board")
          .then(response => {
            this.list = response.data;
            console.log(this.list)
          })
          .catch(response => {
            console.log(response);
          });
    }
  },
  created(){
    this.getList();
  }
}

</script>

<style>

</style>