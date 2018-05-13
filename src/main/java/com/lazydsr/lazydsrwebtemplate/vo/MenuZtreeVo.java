package com.lazydsr.lazydsrwebtemplate.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * MenuVo
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.vo
 * Created by Lazy on 2018/5/12 18:16
 * Version: 0.1
 * Info: 用于menu的ztree 中使用的json数据
 */

public class MenuZtreeVo {
    private String id;
    @JsonProperty(value = "pId")
    private String pId;
    private String name;
    private boolean open;
    private String icon;
    @JsonProperty(value = "iconSkin")
    private String iconSkin;
    private String target;
    private String url;

    @JsonProperty(value = "showRenameBtn")
    private boolean showRenameBtn = true;
    @JsonProperty(value = "showRemoveBtn")
    private boolean showRemoveBtn = true;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonIgnore
    public String getpId() {
        return pId;
    }

    @JsonIgnore
    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonIgnore
    public String getIconSkin() {
        return iconSkin;
    }

    @JsonIgnore
    public void setIconSkin(String iconSkin) {
        this.iconSkin = iconSkin;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonIgnore
    public boolean isShowRenameBtn() {
        return showRenameBtn;
    }

    @JsonIgnore
    public void setShowRenameBtn(boolean showRenameBtn) {
        this.showRenameBtn = showRenameBtn;
    }

    public boolean isShowRemoveBtn() {
        return showRemoveBtn;
    }

    public void setShowRemoveBtn(boolean showRemoveBtn) {
        this.showRemoveBtn = showRemoveBtn;
    }
}
