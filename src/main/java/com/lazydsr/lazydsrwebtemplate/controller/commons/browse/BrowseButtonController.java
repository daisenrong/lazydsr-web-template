package com.lazydsr.lazydsrwebtemplate.controller.commons.browse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SingleBrowseController
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.controller.commons.browse
 * Created by Lazy on 2018/3/30 16:32
 * Version: 0.1
 * Info: 通用浏览框按钮Controller
 */
@Controller
@RequestMapping("commons/browse")
public class BrowseButtonController {
    @GetMapping
    public String singleBrowse() {
        return "commons/browse/single";
    }

    @GetMapping("multiple")
    public String multipleBrowse() {
        return "commons/browse/multiple";
    }
}
