package com.example.eli.vouchersapplication.model.entities;

/**
 * Created by eli on 07/08/2019.
 */

public class Voucher {
    int catId;
    String title;
    String sTitle;
    String imag;
    int id;
    Address dataListAddr;





    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public String getImag() {
        return imag;
    }

    public void setImag(String imag) {
        this.imag = imag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getDataListAddr() {
        return dataListAddr;
    }

    public void setDataListAddr(Address dataListAddr) {
        this.dataListAddr = dataListAddr;
    }
}
