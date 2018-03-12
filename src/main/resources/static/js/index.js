/**
 * AdminLazy Demo Menu
 * ------------------
 * You should not use this file in production.
 * This file is for demo purposes only.
 */
$(function () {
    'use strict'
    //自定义信息
    // $(".LAZY-main-iframe").height($(window).height() - 120);
    // $(window).resize(function (e) {
    //     $(".LAZY-main-iframe").height($(window).height() - 120);
    // });

    /**
     * Get access to plugins
     */

    $('[data-toggle="control-sidebar"]').controlSidebar();
    $('[data-toggle="push-menu"]').pushMenu();




    var $pushMenu = $('[data-toggle="push-menu"]').data('lte.pushmenu');
    var $controlSidebar = $('[data-toggle="control-sidebar"]').data('lte.controlsidebar');
    //这里不知道为什么初始化失败，需要再次初始化
    var $layout = $('body').data('lte.layout');

    /**
     * List of all the available skins
     *
     * @type Array
     */
    var mySkins = [
        'skin-blue',
        'skin-black',
        'skin-red',
        'skin-yellow',
        'skin-purple',
        'skin-green',
        'skin-blue-light',
        'skin-black-light',
        'skin-red-light',
        'skin-yellow-light',
        'skin-purple-light',
        'skin-green-light'
    ];

    /**
     * Get a prestored setting
     *
     * @param String name Name of of the setting
     * @returns String The value of the setting | null
     */
    function get(name) {
        if (typeof (Storage) !== 'undefined') {
            return localStorage.getItem(name);
        } else {
            window.alert('Please use a modern browser to properly view this template!');
        }
    }

    /**
     * Store a new settings in the browser
     *
     * @param String name Name of the setting
     * @param String val Value of the setting
     * @returns void
     */
    function store(name, val) {
        if (typeof (Storage) !== 'undefined') {
            localStorage.setItem(name, val);
        } else {
            window.alert('Please use a modern browser to properly view this template!');
        }
    }

    /**
     * Toggles layout classes
     *
     * @param String cls the layout class to toggle
     * @returns void
     */
    function changeLayout(cls) {

        // console.log("changeLayout  cls:" + cls);
        $('body').toggleClass(cls);
        if ($layout == undefined) {
            // console.log("$layout is undefined");
            $layout = $('body').data('lte.layout');
        }


        $layout.fixSidebar();
        if ($('body').hasClass('fixed') && cls == 'fixed') {
            $pushMenu.expandOnHover();
            $layout.activate();
        }
        $controlSidebar.fix();
        //改变布局之后修改mainContent的高度
        $.learunindex.changeIframeHeight();
        // $(".control-sidebar").height($(window).height() - 102);
    }

    /**
     * Replaces the old skin with the new skin
     * @param String cls the new skin class
     * @returns Boolean false to prevent link's default action
     */
    function changeSkin(cls) {
        $.each(mySkins, function (i) {
            $('body').removeClass(mySkins[i]);
        });

        $('body').addClass(cls);
        store('skin', cls);
        return false;
    }

    /**
     * Retrieve default settings and apply them to the template
     *
     * @returns void
     */
    function setup() {
        var tmp = get('skin');
        if (tmp && $.inArray(tmp, mySkins)) {
            changeSkin(tmp);
        }

        // Add the change skin listener
        //添加皮肤修改监听
        $('[data-skin]').on('click', function (e) {
            if ($(this).hasClass('knob'))
                return;
            e.preventDefault();
            changeSkin($(this).data('skin'));
        });

        // Add the layout manager
        //添加布局修改监听
        $('[data-layout]').on('click', function () {
            changeLayout($(this).data('layout'));
        });
        //切换右侧边栏幻灯片监听
        $('[data-controlsidebar]').on('click', function () {
            changeLayout($(this).data('controlsidebar'));
            var slide = !$controlSidebar.options.slide;

            $controlSidebar.options.slide = slide;
            if (!slide)
                $('.control-sidebar').removeClass('control-sidebar-open');
        })
        //右边皮肤切换监听   dark和light之间的切换（仅支持这两种）
        $('[data-sidebarskin="toggle"]').on('click', function () {
            var $sidebar = $('.control-sidebar');
            if ($sidebar.hasClass('control-sidebar-dark')) {
                $sidebar.removeClass('control-sidebar-dark');
                $sidebar.addClass('control-sidebar-light');
            } else {
                $sidebar.removeClass('control-sidebar-light');
                $sidebar.addClass('control-sidebar-dark');
            }
        })
        //侧边栏展开悬停监听
        $('[data-enable="expandOnHover"]').on('click', function () {
            $(this).attr('disabled', true);
            $pushMenu.expandOnHover();
            if (!$('body').hasClass('sidebar-collapse'))
                $('[data-layout="sidebar-collapse"]').click();
        });

        //  Reset options
        if ($('body').hasClass('fixed')) {
            $('[data-layout="fixed"]').attr('checked', 'checked')
        }
        if ($('body').hasClass('layout-boxed')) {
            $('[data-layout="layout-boxed"]').attr('checked', 'checked')
        }
        if ($('body').hasClass('sidebar-collapse')) {
            $('[data-layout="sidebar-collapse"]').attr('checked', 'checked')
        }
    }


    setup();

    $('[data-toggle="tooltip"]').tooltip();
    //自定义配置
    // $('[data-layout="fixed"]').attr('checked', 'checked');
    // changeLayout('fixed');

    // $('[data-toggle="control-sidebar"]').on('click',function () {
    //     $(".control-sidebar").height($(window).height() - 102);
    // });
    // $(window).resize(function (e) {
    //     $(".control-sidebar").height($(window).height() - 102);
    // });



});
