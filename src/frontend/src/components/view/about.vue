<template>
  <div>
    <table>
       <tr v-for="item in list" :key="item.seq">
        <td>{{item.seq}}</td>
        <td>{{item.title}}</td>
        <td>{{item.content}}</td>
        <td>{{item.writer}}</td>
        <td>{{item.date}}</td>
      </tr>
    </table>
  </div>
</template>

<script>

/*const testData = [{
  seq : 1,
  title : '11',
  content : '11',
  writer : 'hong',
  date : '2021-12-15'
},{
  seq : 2,
  title : '22',
  content : '22',
  writer : 'hong',
  date : '2021-12-15'
},{
  seq : 3,
  title : '33',
  content : '33',
  writer : 'hong',
  date : '2021-12-15'
},]*/

import axios from "axios";

export default {
  name: "about",
  data(){
    return{
      // list : testData
      list : []
    }
  },
  methods: {
    getData : function(){
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
    this.getData();
  }
}

</script>

<style>

</style>