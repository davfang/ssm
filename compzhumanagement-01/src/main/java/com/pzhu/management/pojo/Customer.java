package com.pzhu.management.pojo;

public class Customer {
    private Integer cid;

    private String ccode;

    private String cname;

    private String address;

    private String ctelephone;

    private String cemail;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode == null ? null : ccode.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCtelephone() {
        return ctelephone;
    }

    public void setCtelephone(String ctelephone) {
        this.ctelephone = ctelephone == null ? null : ctelephone.trim();
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail == null ? null : cemail.trim();
    }
}