/**
 *
 */
// Make sure jQuery has been loaded
// if (typeof jQuery === 'undefined') {
//     throw new Error('LazyUtil.js requires jQuery')
// }
(function ($) {
    $.lazyutil = {
        getObjectHeight: function (obj) {
            return $(obj).height();
        },
        ajaxLoaderShow: function () {
            if ($("#ajax-loader") == undefined) {
                var str = '<div id="ajax-loader" style="cursor: progress; position: fixed; top: -50%; left: -50%; width: 200%; height: 200%; background: #fff; z-index: 10000; overflow: hidden;">' +
                    '    <img src="../static/img/ajax-loader.gif" style="position: absolute; top: 0; left: 0; right: 0; bottom: 0; margin: auto;" />\n' +
                    '</div>';
                $('body').append(str);
            }
            $('#ajax-loader').fadeIn(1000);
            return false;
        },
        ajaxLoaderHide: function () {
            if ($("#ajax-loader") != undefined) {
                $('#ajax-loader').fadeOut(1000);
            }
            return false;
        }
    }
});

function getIsOrNo(v) {

    if (v == "0") {
        return "是";
    } else {
        return "否";
    }
}

function getIsOrNoCus(v, str) {

    if (v == 0) {
        return str.split(",")[0];
    } else {
        return str.split(",")[1];
    }
}


function openViewBig(url, title, callback) {
    if (title == undefined) {
        title = '数据预览';
    }
    if (layer == undefined) {
        console.log("layer.js is require!")
    }
    var index = layer.open({
        type: 2,
        title: '' + title,
        area: ['56%', '96%'],
        fixed: false, //不固定
        maxmin: true,
        content: url,
        cancel: function () {
            return;
        },
        end: function () {
            callback();
        }
    });

    return index;
}

function openView(url, title) {
    if (title == undefined) {
        title = '选择';
    }
    if (layer == undefined) {
        console.log("layer.js is require!")
    }
    var index = layer.open({
        type: 2,
        title: '选择',
        area: ['400px', '500px'],
        fixed: false, //不固定
        maxmin: true,
        content: url
    });
    return index;
}

function openViewSmall(url, title) {
    if (title == undefined) {
        title = '选择';
    }
    if (layer == undefined) {
        console.log("layer.js is require!")
    }
    var index = layer.open({
        type: 2,
        title: '选择',
        area: ['40%', '80%'],
        fixed: false, //不固定
        maxmin: true,
        content: url
    });
    return index;
}