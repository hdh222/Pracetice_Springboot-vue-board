<template>
  <div id="app">
    <Header />
    <router-link to="/">/</router-link><br>
    <router-link to="/about">/About</router-link>
    <div class="content" id="content">
      <router-view></router-view>
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
