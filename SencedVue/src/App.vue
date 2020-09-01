<template>
  <div id="app">
<div class="nav">
    <seader></seader>
    <router-view></router-view>
</div>
  </div>
  
</template>

<script>
import seader from './components/Main'
export default {
  components:{
    seader
  },
  name: 'App'
}
</script>

<style>
</style>