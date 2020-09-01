<template>
<div>
<div>
        <img :src="indexCenter1" @mouseover="changeIndex(1)" @mouseout="changeIndexBack(1)" class="s1"/>
        <img :src="indexCenter2" @mouseover="changeIndex(2)" @mouseout="changeIndexBack(2)"/>
      </div>
<h1></h1>
</div>
</template>
<script>
export default {
    data(){
        return{
            indexCenter1: require('@/assets/1.jpg'),
            indexCenter2: require('@/assets/2.jpg'),
            
        }
    }
}
</script>
<style scoped>
    .s1{
        position: relative;
        right: -100px;
        z-index: 2;
    }
</style>>