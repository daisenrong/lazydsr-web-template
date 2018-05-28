/**
 *AdminLazy  indexTab  js
 */
(function ($) {
    $.learuntab = {
        requestFullScreen: function () {
            var de = document.documentElement;
            if (de.requestFullscreen) {
                de.requestFullscreen();
            } else if (de.mozRequestFullScreen) {
                de.mozRequestFullScreen();
            } else if (de.webkitRequestFullScreen) {
                de.webkitRequestFullScreen();
            }
        },
        exitFullscreen: function () {
            var de = document;
            if (de.exitFullscreen) {
                de.exitFullscreen();
            } else if (de.mozCancelFullScreen) {
                de.mozCancelFullScreen();
            } else if (de.webkitCancelFullScreen) {
                de.webkitCancelFullScreen();
            }
        },
        refreshTab: function () {
            // $("#ajax-loader-iframe").fadeIn(500);
            var currentId = $('.page-tabs-content').find('.active').attr('data-id');
            var target = $('.LAZY-main-iframe[data-id="' + currentId + '"]');
            var url = target.attr('src');
            // console.log("currentId:"+currentId);
            // console.log("target:"+target);
            // console.log("url:"+url);
            // $('#ajax-loader-iframe').show(100);

            target.attr('src', url).load(function () {
                $.learunindex.changeIframeHeight();
                // $("#ajax-loader-iframe").fadeOut(500);
            });
            // target.attr('src', url);

        },
        activeTab: function () {
            var currentId = $(this).data('id');
            if (!$(this).hasClass('active')) {
                $('.mainContent .LAZY-main-iframe').each(function () {
                    if ($(this).data('id') == currentId) {
                        $(this).show().siblings('.LAZY-main-iframe').hide();
                        return false;
                    }
                });
                $(this).addClass('active').siblings('.menuTab').removeClass('active');
                $.learuntab.scrollToTab(this);
                $.learunindex.changeIframeHeight();
            }
        },
        closeOtherTabs: function () {
            $('.page-tabs-content').children("[data-id]").find('.fa-remove').parents('a').not(".active").each(function () {
                $('.LAZY-main-iframe[data-id="' + $(this).data('id') + '"]').remove();
                $(this).remove();
            });
            $('.page-tabs-content').css("margin-left", "0");
        },
        closeAllTab: function () {
            $('.page-tabs-content').children("[data-id]").find('.fa-remove').each(function () {
                $('.LAZY-main-iframe[data-id="' + $(this).parent().data('id') + '"]').remove();
                $(this).parents('a').remove();
            });
            $('.page-tabs-content').children("[data-id]:first").each(function () {
                $('.LAZY-main-iframe[data-id="' + $(this).data('id') + '"]').show();
                $(this).addClass("active");
            });
            $('.page-tabs-content').css("margin-left", "0");
            $.learunindex.changeIframeHeight();
        },
        closeTab: function () {
            var closeTabId = $(this).parents('.menuTab').data('id');
            var currentWidth = $(this).parents('.menuTab').width();
            if ($(this).parents('.menuTab').hasClass('active')) {
                if ($(this).parents('.menuTab').next('.menuTab').length) {
                    var activeId = $(this).parents('.menuTab').next('.menuTab:eq(0)').data('id');
                    $(this).parents('.menuTab').next('.menuTab:eq(0)').addClass('active');

                    $('.mainContent .LAZY-main-iframe').each(function () {
                        if ($(this).data('id') == activeId) {
                            $(this).show().siblings('.LAZY-main-iframe').hide();
                            return false;
                        }
                    });
                    var marginLeftVal = parseInt($('.page-tabs-content').css('margin-left'));
                    if (marginLeftVal < 0) {
                        $('.page-tabs-content').animate({
                            marginLeft: (marginLeftVal + currentWidth) + 'px'
                        }, "fast");
                    }
                    $(this).parents('.menuTab').remove();
                    $('.mainContent .LAZY-main-iframe').each(function () {
                        if ($(this).data('id') == closeTabId) {
                            $(this).remove();
                            return false;
                        }
                    });
                }
                if ($(this).parents('.menuTab').prev('.menuTab').length) {
                    var activeId = $(this).parents('.menuTab').prev('.menuTab:last').data('id');
                    $(this).parents('.menuTab').prev('.menuTab:last').addClass('active');
                    $('.mainContent .LAZY-main-iframe').each(function () {
                        if ($(this).data('id') == activeId) {
                            $(this).show().siblings('.LAZY-main-iframe').hide();
                            return false;
                        }
                    });
                    $(this).parents('.menuTab').remove();
                    $('.mainContent .LAZY-main-iframe').each(function () {
                        if ($(this).data('id') == closeTabId) {
                            $(this).remove();
                            return false;
                        }
                    });
                }
            } else {
                $(this).parents('.menuTab').remove();
                $('.mainContent .LAZY-main-iframe').each(function () {
                    if ($(this).data('id') == closeTabId) {
                        $(this).remove();
                        return false;
                    }
                });
                $.learuntab.scrollToTab($('.menuTab.active'));
            }
            // $.learunindex.changeIframeHeight();
            return false;
        },
        addTab: function () {
            $(".navbar-custom-menu>ul>li.open").removeClass("open");
            var dataId = $(this).attr('data-id');
            if (dataId != "") {
                //top.$.cookie('nfine_currentmoduleid', dataId, { path: "/" });
            }
            var dataUrl = $(this).attr('href');
            var menuName = $.trim($(this).text());
            var flag = true;
            if (dataUrl == undefined || $.trim(dataUrl).length == 0) {
                return false;
            }
            $('.menuTab').each(function () {
                if ($(this).data('id') == dataUrl) {
                    if (!$(this).hasClass('active')) {
                        $(this).addClass('active').siblings('.menuTab').removeClass('active');
                        $.learuntab.scrollToTab(this);
                        $('.mainContent .LAZY-main-iframe').each(function () {
                            if ($(this).data('id') == dataUrl) {
                                $(this).show().siblings('.LAZY-main-iframe').hide();
                                $.learunindex.changeIframeHeight();
                                return false;
                            }
                        });
                    }
                    flag = false;
                    return false;
                }
            });
            if (flag) {
                // $("#ajax-loader-iframe").fadeIn(500);
                var str = '<a href="javascript:;" class="active menuTab" data-id="' + dataUrl + '">' + menuName + ' <i class="fa fa-remove"></i></a>';
                $('.menuTab').removeClass('active');
                var str1 = '<iframe class="LAZY-main-iframe" id="iframe' + dataId + '" name="iframe' + dataId + '"  width="100%" height="100%" src="' + dataUrl + '" frameborder="0" data-id="' + dataUrl + '" seamless></iframe>';
                $('.mainContent').find('iframe.LAZY-main-iframe').hide();
                $('.mainContent').append(str1);
                //$.loading(true);
                // $.lazyutil.ajaxLoaderShow();

                $('.mainContent iframe:visible').load(function () {
                    $.learunindex.changeIframeHeight();
                    // $.lazyutil.ajaxLoaderHide();
                    //使用了layer的组件
                    // $("#ajax-loader-iframe").fadeOut(500);
                });
                $('.menuTabs .page-tabs-content').append(str);
                $.learuntab.scrollToTab($('.menuTab.active'));
            }

            return false;
        },
        scrollTabRight: function () {
            var marginLeftVal = Math.abs(parseInt($('.page-tabs-content').css('margin-left')));
            var tabOuterWidth = $.learuntab.calSumWidth($(".content-tabs").children().not(".menuTabs"));
            var visibleWidth = $(".content-tabs").outerWidth(true) - tabOuterWidth;
            var scrollVal = 0;
            if ($(".page-tabs-content").width() < visibleWidth) {
                return false;
            } else {
                var tabElement = $(".menuTab:first");
                var offsetVal = 0;
                while ((offsetVal + $(tabElement).outerWidth(true)) <= marginLeftVal) {
                    offsetVal += $(tabElement).outerWidth(true);
                    tabElement = $(tabElement).next();
                }
                offsetVal = 0;
                while ((offsetVal + $(tabElement).outerWidth(true)) < (visibleWidth) && tabElement.length > 0) {
                    offsetVal += $(tabElement).outerWidth(true);
                    tabElement = $(tabElement).next();
                }
                scrollVal = $.learuntab.calSumWidth($(tabElement).prevAll());
                if (scrollVal > 0) {
                    $('.page-tabs-content').animate({
                        marginLeft: 0 - scrollVal + 'px'
                    }, "fast");
                }
            }
        },
        scrollTabLeft: function () {
            var marginLeftVal = Math.abs(parseInt($('.page-tabs-content').css('margin-left')));
            var tabOuterWidth = $.learuntab.calSumWidth($(".content-tabs").children().not(".menuTabs"));
            var visibleWidth = $(".content-tabs").outerWidth(true) - tabOuterWidth;
            var scrollVal = 0;
            if ($(".page-tabs-content").width() < visibleWidth) {
                return false;
            } else {
                var tabElement = $(".menuTab:first");
                var offsetVal = 0;
                while ((offsetVal + $(tabElement).outerWidth(true)) <= marginLeftVal) {
                    offsetVal += $(tabElement).outerWidth(true);
                    tabElement = $(tabElement).next();
                }
                offsetVal = 0;
                if ($.learuntab.calSumWidth($(tabElement).prevAll()) > visibleWidth) {
                    while ((offsetVal + $(tabElement).outerWidth(true)) < (visibleWidth) && tabElement.length > 0) {
                        offsetVal += $(tabElement).outerWidth(true);
                        tabElement = $(tabElement).prev();
                    }
                    scrollVal = $.learuntab.calSumWidth($(tabElement).prevAll());
                }
            }
            $('.page-tabs-content').animate({
                marginLeft: 0 - scrollVal + 'px'
            }, "fast");
        },
        scrollToTab: function (element) {
            var marginLeftVal = $.learuntab.calSumWidth($(element).prevAll()),
                marginRightVal = $.learuntab.calSumWidth($(element).nextAll());
            var tabOuterWidth = $.learuntab.calSumWidth($(".content-tabs").children().not(".menuTabs"));
            var visibleWidth = $(".content-tabs").outerWidth(true) - tabOuterWidth;
            var scrollVal = 0;
            if ($(".page-tabs-content").outerWidth() < visibleWidth) {
                scrollVal = 0;
            } else if (marginRightVal <= (visibleWidth - $(element).outerWidth(true) - $(element).next().outerWidth(true))) {
                if ((visibleWidth - $(element).next().outerWidth(true)) > marginRightVal) {
                    scrollVal = marginLeftVal;
                    var tabElement = element;
                    while ((scrollVal - $(tabElement).outerWidth()) > ($(".page-tabs-content").outerWidth() - visibleWidth)) {
                        scrollVal -= $(tabElement).prev().outerWidth();
                        tabElement = $(tabElement).prev();
                    }
                }
            } else if (marginLeftVal > (visibleWidth - $(element).outerWidth(true) - $(element).prev().outerWidth(true))) {
                scrollVal = marginLeftVal - $(element).prev().outerWidth(true);
            }
            $('.page-tabs-content').animate({
                marginLeft: 0 - scrollVal + 'px'
            }, "fast");
        },
        calSumWidth: function (element) {
            var width = 0;
            $(element).each(function () {
                width += $(this).outerWidth(true);
            });
            return width;
        },
        init: function () {
            $('.menuItem').on('click', $.learuntab.addTab);
            $('.menuTabs').on('click', '.menuTab i', $.learuntab.closeTab);
            $('.menuTabs').on('click', '.menuTab', $.learuntab.activeTab);
            $('.tabLeft').on('click', $.learuntab.scrollTabLeft);
            $('.tabRight').on('click', $.learuntab.scrollTabRight);
            $('.tabReload').on('click', $.learuntab.refreshTab);
            $('.tabCloseCurrent').on('click', function () {
                $('.page-tabs-content').find('.active i').trigger("click");
            });
            $('.tabCloseAll').on('click', $.learuntab.closeAllTab);
            $('.tabCloseOther').on('click', $.learuntab.closeOtherTabs);
            $('.fullscreen').on('click', function () {
                if (!$(this).attr('fullscreen')) {
                    $(this).attr('fullscreen', 'true');
                    $.learuntab.requestFullScreen();
                } else {
                    $(this).removeAttr('fullscreen')
                    $.learuntab.exitFullscreen();
                }
            });
        }
    };
    $.learunindex = {
        //修改iframe高度
        changeIframeHeight: function () {
            //修改iframe的高度
            if ($("body").hasClass("fixed")) {
                $(".LAZY-main-iframe:visible").height($(window).height() - $('.main-header').height() - $('.content-tabs').height() - 5);
                // $("#ajax-loader-iframe").height($(window).height() - $('.main-header').height() - $('.content-tabs').height() - 7);
                // $("#ajax-loader-iframe").width($(".content-iframe").width());

                // console.log($('.main-header').height()+"ssssss"+$('.content-tabs').height());
            } else {
                var con_height = $(".control-sidebar").height();
                // var h_temp = $(".LAZY-main-iframe:visible").contents().find("body").height();
                var h_temp = $(".LAZY-main-iframe:visible")[0].contentWindow.document.body.scrollHeight;
                // console.log(con_height + "_____" + h_temp);
                var height = 0;
                if (con_height > h_temp) {
                    height = con_height;
                } else {
                    height = h_temp;
                }
                // console.error("height:" + height);
                $(".LAZY-main-iframe:visible").height(height);
                // console.log($(".LAZY-main-iframe:visible").height());
            }
        },
        load: function () {
            $.learunindex.changeIframeHeight();
            // console.log("mainContent height:"+($(".content-wrapper").find('.mainContent').height()));
            // console.log("window height:"+($(window).height() - 100));
            $(window).resize(function (e) {
                $.learunindex.changeIframeHeight();
                // $(".content-wrapper").find('.mainContent').height($(window).height() - 91);
            });
            //针对菜单的收起按钮放到了index。js中进行处理
            // $(".sidebar-toggle").click(function () {
            //     if (!$("body").hasClass("sidebar-collapse")) {
            //         $("body").addClass("sidebar-collapse");
            //     } else {
            //         $("body").removeClass("sidebar-collapse");
            //     }
            // });

            //TODO：暂时注释，等待寻找load的替代方案
            $(window).load(function () {
                window.setTimeout(function () {
                    $('#ajax-loader').fadeOut();
                }, 200);
            });
        },
        jsonWhere: function (data, action) {
            if (action == null) return;
            var reval = new Array();
            $(data).each(function (i, v) {
                if (action(v)) {
                    reval.push(v);
                }
            });
            return reval;
        },
        loadMenu: function () {
            //菜单数据获取与加载
            var data = loadMenuJson();

            var _html = "";
            $.each(data, function (i) {
                //console.log(data);
                var row = data[i];
                //针对pid为空的进行处理
                if (row.parentId == "0" || row.parentId == "") {
                    if (i == 0) {
                        _html += '<li class="treeview active">';
                    } else {
                        _html += '<li class="treeview">';
                    }
                    var childNodes = $.learunindex.jsonWhere(data, function (v) {
                        return v.parentId == row.id
                    });
                    //若无子菜单，那么不显示下拉的图标
                    _html += '<a href="#">';
                    _html += '<i class="' + row.icon + '"></i><span>' + row.name + '</span>';
                    if (childNodes.length>0){
                        _html+='<i class="fa fa-angle-left pull-right"></i>';
                    }

                    _html += '</a>';

                    if (childNodes.length > 0) {
                        _html += '<ul class="treeview-menu">';
                        $.each(childNodes, function (i) {
                            var subrow = childNodes[i];
                            var subchildNodes = $.learunindex.jsonWhere(data, function (v) {
                                return v.parentId == subrow.id
                            });
                            _html += '<li>';
                            if (subchildNodes.length > 0) {
                                _html += '<a href="#"><i class="' + subrow.icon + '"></i><span>' + subrow.name + '</span>';
                                _html += '<i class="fa fa-angle-left pull-right"></i></a>';
                                _html += '<ul class="treeview-menu">';
                                $.each(subchildNodes, function (i) {
                                    var subchildNodesrow = subchildNodes[i];
                                    // _html += '<li><a class="menuItem" data-id="'+ctx + subrow.F_ModuleId + '" href="'+ctx + subrow.F_UrlAddress + '"><i class="' + subchildNodesrow.F_Icon + '"></i>' + subchildNodesrow.F_FullName + '</a></li>';
                                    _html += '<li><a class="menuItem" data-id="' + subrow.id + '" href="' + ctx + subrow.url + '"><i class="' + subchildNodesrow.icon + '"></i><span>' + subchildNodesrow.name + '</span></a></li>';
                                });
                                _html += '</ul>';

                            } else {
                                // _html += '<a class="menuItem" data-id="'+ctx + subrow.F_ModuleId + '" href="'+ctx + subrow.F_UrlAddress + '"><i class="' + subrow.F_Icon + '"></i>' + subrow.F_FullName + '</a>';
                                //添加判断条件，若包含http或者https，那么就不添加根路径
                                if(subrow.url.indexOf("http://")==0||subrow.url.indexOf("https://")==0){
                                    _html += '<a class="menuItem" data-id="' + subrow.id + '" href="' + subrow.url + '"><i class="' + subrow.icon + '"></i><span>' + subrow.name + '</span></a>';
                                }else {
                                    _html += '<a class="menuItem" data-id="' + subrow.id + '" href="' + ctx + subrow.url + '"><i class="' + subrow.icon + '"></i><span>' + subrow.name + '</span></a>';
                                }
                            }
                            _html += '</li>';
                        });
                        _html += '</ul>';
                    }
                    _html += '</li>'
                }
            });
            $("#sidebar-menu").append(_html);
            $("#sidebar-menu li a").click(function () {
                var d = $(this), e = d.next();
                if (e.is(".treeview-menu") && e.is(":visible")) {
                    e.slideUp(300, function () {
                        e.removeClass("menu-open")
                    })
                    //这个地方存在bug，第一次点击收起时没有效果，等待以后解决
                    // e.parent("li").removeClass("active")
                } else if (e.is(".treeview-menu") && !e.is(":visible")) {
                    var f = d.parents("ul").first(),
                        g = f.find("ul:visible").slideUp(300);
                    g.removeClass("menu-open");
                    var h = d.parent("li");
                    e.slideDown(300, function () {
                        e.addClass("menu-open"),
                            f.find("li.active").removeClass("active"),
                            h.addClass("active");

                        var _height1 = $(window).height() - $("#sidebar-menu >li.active").position().top - 41;
                        var _height2 = $("#sidebar-menu li > ul.menu-open").height() + 10
                        if (_height2 > _height1) {
                            $("#sidebar-menu >li > ul.menu-open").css({
                                overflow: "auto",
                                height: _height1
                            })
                        }
                    })
                }
                e.is(".treeview-menu");
            });
        }
    };
    $(function () {
        $.learunindex.load();
        $.learunindex.loadMenu();
        $.learuntab.init();
    });

    function loadMenuJson() {
        var url = ctx + "/menu/json";
        var data;
        $.ajax({
            type: 'get',
            dataType: 'json',
            url: url,
            data: {},
            cache: false,
            async: false,
            success: function (menus) {
                data = menus;
            }
        });
        return data;
    }
})(jQuery);