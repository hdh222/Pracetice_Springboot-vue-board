<template>
  <b-form @submit="submitForm" class="mt-5">
    <b-form-group id="input-group-1" label="아이디" label-for="userId" >
      <b-form-input id="userId" v-model="userId"></b-form-input>
    </b-form-group>
    <b-form-group id="input-group-2" label="비밀번호" label-for="userPw" >
      <b-form-input id="userPw" v-model="userPw"></b-form-input>
    </b-form-group>
    <b-button class="mt-2" type="submit" variant="primary">로그인</b-button>
  </b-form>
<!--
  <form v-on:submit="submitForm">
    <div class="container">
      <label for="userId">id: </label>
      <input type="text" id="userId" v-model="userId">
      <label for="userPw">pw: </label>
      <input type="password" id="userPw" v-model="userPw">
      <button type="submit">로그인</button>
    </div>
  </form>-->

</template>

<script>

import axios from 'axios';

export default {
  name: "home",
  data(){
    return{
      userId : '',
      userPw : ''
    }
  },
  methods:{
    submitForm : function() {
      const data = {userId : this.userId, userPw : this.userPw};
      const url = "/api/login";
      axios.post(url, data)
          .then(function(response){
            console.log(response);
      })
          .catch(function(response){
            console.log(response);
      })
    }
  }
}
</script>

<style>

</style>