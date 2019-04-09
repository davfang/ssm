package com.pzhu.management.pojo;

public class Employee {
    private Integer eid;

    private String ecode;

    private String ename;

    private String birthday;

    private String sex;

    private String etelephone;

    private String eemail;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEcode() {
        return ecode;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode == null ? null : ecode.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEtelephone() {
        return etelephone;
    }

    public void setEtelephone(String etelephone) {
        this.etelephone = etelephone == null ? null : etelephone.trim();
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail == null ? null : eemail.trim();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ecode='" + ecode + '\'' +
                ", ename='" + ename + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", etelephone='" + etelephone + '\'' +
                ", eemail='" + eemail + '\'' +
                '}';
    }
}