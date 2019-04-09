package com.pzhu.management.pojo;

public class Stockin {
    private Integer sid;

    private String scode;

    private String amount;

    private String sprice;

    private String stockindate;

    private Customer customerid;

    private Merchandise merchandiseid;

    private Employee employeeid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode == null ? null : scode.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getSprice() {
        return sprice;
    }

    public void setSprice(String sprice) {
        this.sprice = sprice == null ? null : sprice.trim();
    }

    public String getStockindate() {
        return stockindate;
    }

    public void setStockindate(String stockindate) {
        this.stockindate = stockindate == null ? null : stockindate.trim();
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public Merchandise getMerchandiseid() {
        return merchandiseid;
    }

    public void setMerchandiseid(Merchandise merchandiseid) {
        this.merchandiseid = merchandiseid;
    }

    public Employee getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Employee employeeid) {
        this.employeeid = employeeid;
    }
}