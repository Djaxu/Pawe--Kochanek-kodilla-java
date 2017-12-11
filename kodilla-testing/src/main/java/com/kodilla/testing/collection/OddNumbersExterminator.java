package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> list) {
        ArrayList<Integer> oddList = new ArrayList<>();
        for(Integer item: list) {
            if (item % 2 == 0) {
                oddList.add(item);
            }
        }
        return oddList;
    }
}