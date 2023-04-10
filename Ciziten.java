package com.turkcellCamp;

import java.util.Objects;

public class Ciziten {


    private String ad;
    private String soyad;
    private String tcNo;
    private int dogumYili;

    public Ciziten(String ad, String soyad, String tcNo, int dogumYili) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.dogumYili = dogumYili;
    }

    public Ciziten() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciziten ciziten = (Ciziten) o;
        return dogumYili == ciziten.dogumYili && Objects.equals(ad, ciziten.ad) && Objects.equals(soyad, ciziten.soyad) && Objects.equals(tcNo, ciziten.tcNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ad, soyad, tcNo, dogumYili);
    }
}

    