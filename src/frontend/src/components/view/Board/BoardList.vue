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
    <div class="text">
      <router-link class="right" to="/board/write">새글작성</router-link>
    </div>
    <table class="table table-light text-center">
      <thead>
      <tr>
        <td>seq</td>
        <td>title</td>
        <td>writer</td>
        <td>regdate</td>
      </tr>
      </thead>
      <tbody>
      <tr  v-for="item in list" :key="item.seq">
        <td>{{item.seq}}</td>
        <td><router-link :to="`/board/detail/${item.seq}`">{{item.title}}</router-link></td>
        <td>{{item.writer}}</td>
        <td>{{item.regdate}}</td>
      </tr>

      </tbody>
    </table>
    <nav aria-label="Page navigation example">
      <ul class="pagination">
        <li class="page-item">
          <a class="page-link" href="#" aria-label="Previous">
            <span aria-hidden="true">&laquo;</span>
          </a>
        </li>
        <li class="page-item" v-for="i in index" :key="i" @click="`${getList(i)}`"><a class="page-link">{{ i }}</a></li>
        <li class="page-item">
          <a class="page-link" href="#" aria-label="Next">
            <span aria-hidden="true">&raquo;</span>
          </a>
        </li>
      </ul>
    </nav>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "about",
  data(){
    return{
      list : [],
      index : 0
    }
  },
  methods: {
    getList : function(i){
      axios.get("/api/board",{
        params : {
          pageNum : i
        }
      })
          .then(response => {
            this.list = response.data.list;
            this.index = response.data.page;
            console.log(response);
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