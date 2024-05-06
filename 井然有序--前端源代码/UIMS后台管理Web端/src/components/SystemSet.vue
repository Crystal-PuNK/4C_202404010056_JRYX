<template>
    <div class="boxbc1">
        <div class="box1">
            <div class="boxd1">
                <div class="boxd11"></div>
                <div class="boxd12 fontd1">系统数据设置</div>
            </div>
            <div class="boxd2">
                <div class="boxd21">
                    <div class="boxd211">
                        <div class="boxd2111 fonts1 juzhong">无人机参数配置</div>
                    </div>
                    <div class="boxd212">
                        <div class="boxd2121 fonts2">飞行参数设置：</div>
                        <div class="boxd2122 fonts3">最大飞行高度设置 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;line-height: 20px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;">m</span>
                        </div>
                        <div class="boxd2122 fonts3">最大飞行速度设置 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;">km/h</span>
                        </div>
                        <div class="boxd2122 fonts3">飞行模式选择<input type="text"
                                style="position: absolute; width: 40px; padding: 0;height: 20px; right: 20px;top: 5px;">
                        </div>
                        <div class="boxd2121 fonts2">动力系统参数设置：</div>
                        <div class="boxd2122 fonts3">电池电量警报设置 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;line-height: 20px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;">%</span>
                        </div>
                        <div class="boxd2122 fonts3">失联时间报警设置 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;">h</span>
                        </div>
                        <div class="boxd2122 fonts3">定位服务<input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;">
                        </div>
                    </div>
                </div>
                <div class="boxd21" style="margin-left: 100px;">
                    <div class="boxd211">
                        <div class="boxd2111 fonts1 juzhong">井盖参数设置</div>
                    </div>
                    <div class="boxd212">
                        <div class="boxd2121 fonts2">报警装置设置：</div>
                        <div class="boxd2122 fonts3">井盖损坏报警阈值 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;line-height: 20px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;">%</span>
                        </div>
                        <div class="boxd2122 fonts3">损坏个数报警阈值 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;">00</span>
                        </div>
                        <div class="boxd2122 fonts3">报警装置选择<input type="text"
                                style="position: absolute; width: 40px; padding: 0;height: 20px; right: 20px;top: 5px;">
                        </div>
                        <div class="boxd2121 fonts2">井盖管理参数设置：</div>
                        <div class="boxd2122 fonts3">可识别种类 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;line-height: 20px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;">个</span>
                        </div>
                        <div class="boxd2122 fonts3">井盖损坏程度分级 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;">级</span>
                        </div>
                        <div class="boxd2122 fonts3">定位服务<input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;">
                        </div>
                    </div>
                </div>
                <div class="boxd21" style="margin-left: 100px;">
                    <div class="boxd211">
                        <div class="boxd2111 fonts1 juzhong">用户参数设置</div>
                    </div>
                    <div class="boxd212">
                        <div class="boxd2121 fonts2">管理参数设置：</div>
                        <div class="boxd2122 fonts3">最大在线人数设置 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;line-height: 20px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;">个</span>
                        </div>
                        <div class="boxd2122 fonts3">无操作踢出时间 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;">h</span>
                        </div>
                        <div class="boxd2122 fonts3">用户数据库选择<input type="text"
                                style="position: absolute; width: 40px; padding: 0;height: 20px; right: 20px;top: 5px;" placeholder="Redis">
                        </div>
                        <div class="boxd2121 fonts2">管理权限设置：</div>
                        <div class="boxd2122 fonts3">最高权限用户 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;line-height: 20px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;"></span>
                        </div>
                        <div class="boxd2122 fonts3">二级管理员 <input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;"><span
                                style="position: absolute;width: 20px;height: 30px;right: 18px;line-height: 30px;text-align: left;"></span>
                        </div>
                        <div class="boxd2122 fonts3">普通管理员<input type="text"
                                style="position: absolute; width: 20px; padding: 0;height: 20px; right: 40px;top: 5px;">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
        }
    },
    methods: {
    }
}
</script>
<style scoped>
.boxd2122 {
    margin-top: 10px;
    padding-left: 10px;
    width: 100%;
    height: 30px;
    line-height: 30px;
    position: relative;
}

.fonts3 {
    font-size: 11px;
}

.fonts2 {
    font-weight: 700;
}

.box21>* {
    position: relative;
}

.box212>* {
    position: relative;
}

.boxd2121 {
    margin-top: 10px;
    padding-left: 10px;
    width: 100%;
    height: 30px;
    line-height: 30px;
    border-bottom: 1px solid #bebebe;
}

.boxd212 {
    width: 100%;
    position: relative;
    height: calc(100% - 60px);
}

.boxd2111 {
    width: 100%;
    height: 60px;
    line-height: 60px;
}

.fonts1 {
    color: white;
    font-weight: 700;
}

.juzhong {
    text-align: center;
}

.boxd211 {
    width: 100%;
    height: 60px;
    /* border-bottom: 1px solid #cbcbcb; */
    position: relative;
    background-color: #409df4;
}

.boxd2>div {
    float: left;
}

.boxd21 {
    position: relative;
    border-radius: 15px;
    width: 24%;
    height: 100%;
    box-shadow: 3px 3px 5px rgba(0, 0, 0, 0.3);
    overflow: hidden;
}

.boxd2 {
    width: 96%;
    margin-left: 2%;
    position: relative;
    height: calc(100vh - 208px);
}

.fontd1 {
    font-size: 16px;
    font-weight: 600;
}

.boxd12 {
    position: absolute;
    left: 1%;
    top: 0px;
    height: 60px;
    line-height: 60px;
}

.boxd11 {
    position: absolute;
    background-color: #409eff;
    width: 5px;
    height: 26px;
    top: 17px;
    border-radius: 5px;
}

.boxd1 {
    position: relative;
    width: 96%;
    height: 60px;
    margin-left: 2%;
}

.box1 {
    position: absolute;
    width: 90%;
    min-height: calc(100vh - 128px);
    left: 5%;
    top: 30px;
    background-color: #fff;
}

.boxbc1 {
    position: relative;
    width: 100%;
    min-height: calc(100vh - 78px);
    background-color: #eef0f3;
}
</style>