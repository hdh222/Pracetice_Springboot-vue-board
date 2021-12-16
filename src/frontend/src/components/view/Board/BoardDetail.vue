<template>
<!--  <h1>{{$route.params.seq}}</h1>-->
  <div>
    <h1>글 번호 : {{dataObj.seq}}</h1>
    <div>
      <form v-on:submit="update">
        <label for="title">글 제목 : </label>
        <input type="text" id="title" v-model="dataObj.title">
        <p><textarea v-model="dataObj.content"></textarea></p>
        <button type="submit">수정</button>
      </form><br>
      <button v-on:click="list">목록</button>
      <button @click="deleteData">삭제</button>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "BoardDetail",
  data(){
    return{
      seq:this.$route.params.seq,
      dataObj : {}
    }
  },methods : {
    getData : function(){
      axios.get("/api/board/detail/" + this.seq,{
        title : this.dataObj.title,
        content : this.dataObj.content
      })
      .then(response=>{
        console.log(response);
        this.dataObj = response.data.data;
      }).catch(response=>{
        console.log(response);
      });
    },
    update : function(){
      axios.put("/api/board/update/" + this.seq,{
        title:this.dataObj.title,
        content : this.dataObj.content
      })
      .then(response=>{
        console.log(response);
      })
      .catch(response=>{
        console.log(response);
      });
      this.$router.push({path : "/board/list"});
    },
    deleteData : function(){
      axios.delete("/api/board/delete/" + this.seq)
      .then(response=>{
        console.log(response);
      })
      .catch(response=>{
        console.log(response);
      });
      this.$router.push({path : "/board/list"});
    },
    list : function(){
      this.$router.push({path : "/board/list"});
    }
  },mounted(){
    this.getData();
  }
}
</script>

<style scoped>
textarea{
  width : 238px;
  height : 82px;
}
</style>