<template>
  <div>
<!--    <table>
       <tr v-for="item in list" :key="item.seq">
        <router-link :to="`/board/detail/${item.seq}`"><td>{{item.seq}}</td></router-link>
        <td>{{item.title}}</td>
        <td>{{item.content}}</td>
        <td>{{item.writer}}</td>
        <td>{{item.date}}</td>
      </tr>
    </table>-->
<!--    <b-table :items="list" @row-clicked="detail"/>-->
    <div class="text">
      <router-link class="right" to="/board/write">새글작성</router-link>
    </div>
    <table class="table table-light text-center">
      <thead>
        <tr>
          <td>seq</td>
          <td>title</td>
          <td>content</td>
          <td>writer</td>
          <td>regdate</td>
        </tr>
      </thead>
      <tbody>
        <tr  v-for="item in list" :key="item.seq">
          <td><router-link :to="`/board/detail/${item.seq}`">{{item.seq}}</router-link></td>
          <td>{{item.title}}</td>
          <td>{{item.content}}</td>
          <td>{{item.writer}}</td>
          <td>{{item.date}}</td>
        </tr>

      </tbody>
    </table>
    <Pagination />
  </div>
</template>

<script>
import axios from "axios";
import Pagination from "@/components/view/Board/Pagination"

export default {
  name: "about",
  components: {Pagination},
  component : Pagination,
  data(){
    return{
      fields  : ['Seq', 'Title', 'Content', 'Writer', 'regdate'],
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
    },

  },
  created(){
    this.getList();
  }
}

</script>

<style>

</style>