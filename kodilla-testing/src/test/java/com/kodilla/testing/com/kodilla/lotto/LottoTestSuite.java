package com.kodilla.testing.com.kodilla.lotto;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LottoTestSuite {
    @Test
    public void testMiniLotto(){
        //Given
        Database databaseMock = mock(Database.class);
        MaszynaLosujaca maszynaLosujaca = new MaszynaLosujaca(databaseMock);
        ArrayList<Integer> miniLotto = new ArrayList<>();
        miniLotto.add(1);
        miniLotto.add(2);
        miniLotto.add(3);
        miniLotto.add(4);
        miniLotto.add(5);
        ArrayList<Integer> userList = new ArrayList<>();
        userList.add(3);
        userList.add(4);
        userList.add(5);
        userList.add(6);
        userList.add(7);
        when(databaseMock.wylosuj(5)).thenReturn(miniLotto);
        //When
        int result = maszynaLosujaca.miniLotto(userList);
        //Then
        Assert.assertEquals(3, result);




    }
}
