package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.time.UtilDateTime;

public class User {
    private String id;

    private String name;

    private String username;

    private String password;

    private String workcode;

    private Integer sumPasswordWrong;

    private Integer passwordLock;

    private String oldPassword1;

    private String oldPassword2;

    private String email;

    private String mobile;

    private String telphone;

    private String organization;

    private String company;

    private String department;

    private String idCard;

    private String currentLoginDate;

    private String lastLoginDate;

    private Double orderNum=1000.0;

    private Integer accountType;

    private String creator;

    private String createDate=UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate=UtilDateTime.getCurrDateTime();

    private Integer status=0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getWorkcode() {
        return workcode;
    }

    public void setWorkcode(String workcode) {
        this.workcode = workcode == null ? null : workcode.trim();
    }

    public Integer getSumPasswordWrong() {
        return sumPasswordWrong;
    }

    public void setSumPasswordWrong(Integer sumPasswordWrong) {
        this.sumPasswordWrong = sumPasswordWrong;
    }

    public Integer getPasswordLock() {
        return passwordLock;
    }

    public void setPasswordLock(Integer passwordLock) {
        this.passwordLock = passwordLock;
    }

    public String getOldPassword1() {
        return oldPassword1;
    }

    public void setOldPassword1(String oldPassword1) {
        this.oldPassword1 = oldPassword1 == null ? null : oldPassword1.trim();
    }

    public String getOldPassword2() {
        return oldPassword2;
    }

    public void setOldPassword2(String oldPassword2) {
        this.oldPassword2 = oldPassword2 == null ? null : oldPassword2.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getCurrentLoginDate() {
        return currentLoginDate;
    }

    public void setCurrentLoginDate(String currentLoginDate) {
        this.currentLoginDate = currentLoginDate == null ? null : currentLoginDate.trim();
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate == null ? null : lastLoginDate.trim();
    }

    public Double getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Double orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate == null ? null : modifyDate.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}