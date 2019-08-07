package com.example.eli.vouchersapplication.model.entities;

/**
 * Created by eli on 07/08/2019.
 */

public class Address {
    String addr;
    String dad;

    public Address(String addr,String dad) {
        this.addr = addr;
        this.dad=dad;
    }

    public String getAddr() {
        return addr;
    }

    public String getDad() {
        return dad;
    }

    public void setDad(String dad) {
        this.dad = dad;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
