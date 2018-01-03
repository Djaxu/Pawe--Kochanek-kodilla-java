package com.kodilla.testing.com.kodilla.lotto;

import java.util.ArrayList;
import java.util.List;

public class MaszynaLosujaca {

    Database database;

    public MaszynaLosujaca(Database database) {
        this.database = database;
    }

    public Integer miniLotto(ArrayList<Integer> numbersList) {
        List<Integer> wyniki = database.wylosuj(5);
        int ileLiczbSieZgadza = 0;
        for(Integer liczba: numbersList){
            if(wyniki.contains(liczba)){
                ileLiczbSieZgadza++;
            }
        }
        return ileLiczbSieZgadza;
    }


}
