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