<template>
<div>
<div class="d1">
  <img src="@/assets/logo.345cb47.jpg" />
  <div class="nav">
  <el-menu mode="horizontal" default-active="this.$router.path" background-color="#e6212a" text-color="white" router="true" class="photo1">
    <el-menu-item index="/China">主页</el-menu-item>
    <el-menu-item index="/USA">招商加盟</el-menu-item>
    <el-menu-item index="/Canada">会员专区</el-menu-item>
    <el-menu-item index="/Japan">新闻资讯</el-menu-item>
    <el-menu-item index="/rencai">人才招聘</el-menu-item>
    <el-menu-item index="/guanli">管理学院</el-menu-item>
    <el-menu-item index="/gongying">供应商合作</el-menu-item>
  </el-menu>
  </div>
</div>
</div>
</template>
<script>
  export default {
  
  }
</script>

<style>
.el-menu--horizontal>.el-menu-item {
  padding-top: 12px;
    padding:1 35px;
    font-size: 22px;
    float: left;
    height: 90px;
    line-height: 60px;
    margin: 0;
    border-bottom: 2px solid transparent;
    color: #909399;
}

     img{
        width: 450px;
       }
       .photo1{
         width: 100%;
         height: 90px;
       }
       .nav{
         width: 100%;
         height: 150px;
       }
    .text{
        font-size: small;
        color: gray;
    }
    .d1{
        background-color:lightgrey;
        width: 100%;
        height: 90px;
        display: flex;
        
    }
    .d2{
        background-color:lightgrey;
        width: 120px;
        height: 80px;
        margin: 0 45px;
    }
    .t1{
        color: red;
        font-weight:600;
        padding: 20px;
        font-size: larger;
        width: 100px;
        height: 10px;
    }
    .t2{
        color: gray;
        width: 80px;
        font-size: small;
        padding-left: 33px;
           }
    .t3{
        color:slategrey;
    }
    .t4{
        color:teal;
    }
    .row{
        display: flex;
        height: 30px;
        width: 100%;
        background-color: lightgrey;
        border-radius: 12px;
        justify-content: space-around;
    }
    .clounm{
        height: 30px;
        width: 50px;
    }
    img{
  width: 450px;
}
</style>