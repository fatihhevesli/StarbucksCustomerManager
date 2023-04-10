package com.turkcellCamp;

public class Customer {
    private String ad;
    private String soyad;
    private String tcNo;
    private int dogumYili;

    public Customer(String ad, String soyad, String tcNo, int dogumYili) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.dogumYili = dogumYili;
    }
    public Customer() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }





}

    