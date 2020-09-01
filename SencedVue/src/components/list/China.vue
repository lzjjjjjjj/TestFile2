<template>
<div>

    <div>
  <el-carousel initial-index="0" trigge="hover" interval="3000" class="d4">
    <el-carousel-item v-for="item in image" :key="item" class="rightImg">
      <img :src="item">
    </el-carousel-item>
  </el-carousel>
    </div>

<div style="height: 650px;width:100%" class="d3">
    <div class="d1">
        <div class="d2" ><img :src="img.url1" @click="tiaozhuan" @mouseover="mouseover" @mouseleave="mouseleave"></div>
        <div class="d2"><img :src="img.url2"></div>
        <div class="d2"><img :src="img.url3"></div>
    </div>
    <div class="d1">
        <div class="d2"><img src="@/assets/5-1.png" @click="tiaozhuan"></div>
        <div class="d2"><img src="@/assets/5-1.png"></div>
        <div class="d2"><img src="@/assets/7-1.png"></div>
    </div>
</div>


</div>
</template>
<script>
export default {
     data() {
      return {
        img:{
         url1: require('@/assets/5-1.png'),
         url2: require('@/assets/6.png'),
         url3: require('@/assets/7-1.png'),
        },
       image:[
     require("@/assets/1.jpg"),
      require( "@/assets/2.jpg"),
       require( "@/assets/3.jpg"),
      require(  "@/assets/4.jpg")],
      };
    },
    methods:{
        tiaozhuan:function(){
                this.$router.replace("/Japan")
        },
        mouseover:function(){
          this.img.url1=require('@/assets/5.png')
        },
        mouseleave:function(){
          this.img.url1=require('@/assets/5-1.png')
        }
    }
}
</script>
<style scoped>
.rightImg {
  width: 100%;
  height: 300px;
}
.d1{
    width: 100%;
    height: 325px;
    background-color: white;
    display: flex;
    justify-content: center;
    margin-top: 5px;
}
.d2{
     width: 370px;
        height: 172px;
        margin: 14px;
        
        
}
.d3{
    position: relative;
    top:-60px;
    z-index: 2;
}
.d4{
  z-index: 1;
}
img{
    width: 100%;
    height: 300px;
}

</style>>
