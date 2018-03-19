/**
 * home
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: static.js.pages.index
 * Created by Lazy on 2018/3/13 22:43
 * Version: 0.1
 * Info: @TODO:...
 */
$(function () {
    // console.log("aa");
    // cpu();
    // $(top.window).resize(function (e) {
    //     console.log("aaaaaaaaaaaaaaaaaa");
    //     // myChart.setOption(option,true);
    //     // $(".content-wrapper").find('.mainContent').height($(window).height() - 91);
    //     cpu();
    // });
    // console.log("bb");
});


//demo

var myChart = echarts.init(document.getElementById('interactive'));
option = {
    xAxis: {
        type: 'category',
        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
    },
    yAxis: {
        type: 'value'
    },
    series: [{
        data: [820, 932, 901, 934, 1290, 1330, 1320],
        type: 'line'
    }]
};

function cpu() {

    myChart.setOption(option, true);
}