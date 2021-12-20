<template>
  <div id="app">
    <div class="container">
      <Header />
      <b-link :to="{path : '/'}">Home</b-link>
      <b-link :to="{path : '/board/list'}">Board</b-link>
<!--      <router-link to="/">/</router-link>
      <router-link to="/board/list">/board</router-link>-->
      <div class="content" id="content">
        <router-view></router-view>
      </div>
    </div>
  </div>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'
import Header from './components/layout/Header.vue'

export default {
  name: 'App',
  components: {
    Header
  }
}
</script>

<style>

</style>
