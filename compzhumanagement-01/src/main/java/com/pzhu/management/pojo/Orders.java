package com.pzhu.management.pojo;

public class Orders {
    private Integer oid;

    private String ocode;

    private String merchandisenumber;

    private String orderdata;

    private Customer customerid;

    private Merchandise merchandiseid;

    private Employee employeeid;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOcode() {
        return ocode;
    }

    public void setOcode(String ocode) {
        this.ocode = ocode == null ? null : ocode.trim();
    }

    public String getMerchandisenumber() {
        return merchandisenumber;
    }

    public void setMerchandisenumber(String merchandisenumber) {
        this.merchandisenumber = merchandisenumber == null ? null : merchandisenumber.trim();
    }

    public String getOrderdata() {
        return orderdata;
    }

    public void setOrderdata(String orderdata) {
        this.orderdata = orderdata == null ? null : orderdata.trim();
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

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", ocode='" + ocode + '\'' +
                ", merchandisenumber='" + merchandisenumber + '\'' +
                ", orderdata='" + orderdata + '\'' +
                ", customerid=" + customerid +
                ", merchandiseid=" + merchandiseid +
                ", employeeid=" + employeeid +
                '}';
    }
}
