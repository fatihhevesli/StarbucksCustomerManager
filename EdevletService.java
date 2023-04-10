package com.turkcellCamp;

import java.util.ArrayList;
import java.util.List;

public class EdevletService {
    List<Ciziten> cizitensList  = new ArrayList<Ciziten>();


    public EdevletService() {
        cizitensList.add(new Ciziten("Emrah", "Yılmaz", "4446576886",1995));
        cizitensList.add(new Ciziten("İsmet", "Deneme", "44465456886",2000));
        cizitensList.add(new Ciziten("Kadir", "Kaya", "44467646886",1950));
        cizitensList.add(new Ciziten("Ayşe", "Test", "4446576886",1998));
    }

    public boolean dogrula(final Ciziten ciziten){
        return cizitensList.stream().anyMatch(i -> i.equals(ciziten));
    }
}

    