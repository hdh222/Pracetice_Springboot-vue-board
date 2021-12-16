<template>
  <div>
    <form v-on:submit="add">
      <label for="title">글 제목 : </label>
      <input type="text" id="title" v-model="title">
      <p><textarea v-model="content"></textarea></p>
      <button type="submit">추가</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "BoardWriteForm",
  data(){
    return{
      title : '',
      content : ''
    }
  },methods : {
    add : function(){
      axios.post("/api/board/write",{
        title : this.title,
        content : this.content,
        writer : 'hong'
      })
      .then(response=>{
        console.log(response);
      })
      .catch(response=>{
        console.log(response);
      });
      this.$router.push({path : "/board/list"});
    }
  }
}
</script>

<style scoped>
textarea{
  width : 238px;
  height : 82px;
}
</style>