<template>
  <div class="boxbc1">
    imageUrl: require('@/images/main/shouye1.png')这里用来写每个导航栏一级菜单的图标<br>
    description: '这是第一张图片的描述'没啥用暂时先留着<br>
    flag1: true, flag2: false 有点冗余但咱们不要碰就是用来控制鼠标进入离开改一级菜单背景颜色的<br>
    title: '首页'一级菜单标题, flag3: false,一级菜单字体颜色是否选中 <br>
    url1: require('@/images/main/shouye.png'), url2: require('@/images/main/shouye1.png')两个一级菜单的图标1为未选中白色<br>
    , grade: 1, paopaoflag: false grade控制一级菜单, paopaoflag控制泡泡是否展示.

    { pageName: '首页', flag1: false, flag2: true, pindex: 0 }, { pageName: '文档', flag1: false, flag2: true, pindex: 1 }

    现在的做法是，访问路径写死在左边每一次按动一级菜单或二级菜单，这里我们先不写，但问题是要给page加个小x

    我现在要实现一种功能，当page只剩一个就不让他删除了实现了，选中的被删除的话自动回退到上一个，

    现在我们改了，其实items是可以遍历所有页面的，
  </div>
</template>

<script>
export default {
  // 在这里可以添加组件的逻辑
}
</script>

<style scoped>
</style>
