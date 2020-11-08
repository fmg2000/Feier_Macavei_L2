package com.company.Lab2_map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class test{
    /*
        Clasa de teste
     */
    public static Benutzer ben;
    public static Fussball fussball = new Fussball();
    public static Basketball basketball = new Basketball();
    public static Hindernislauf hindernislauf = new Hindernislauf();
    public static Hochsprung hochsprung = new Hochsprung();

    @BeforeEach
    void setUp() {

        ArrayList<Sport> ListaSport = new ArrayList<Sport>();
        ListaSport.add(fussball);
        ListaSport.add(hindernislauf);
        ListaSport.add(hochsprung);
        ben = new Benutzer("Maria", "Elena", ListaSport);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void Test_kalkulierezeit_favorite_sport()
    {
        assertTrue(ben.kalkulierezeit_favorite_sport(hindernislauf) == 30);
    }
    @Test
    void Test_KalkuliereZeit() {
        assertTrue(ben.kalkulierezeit() == 115.0);
    }

    @Test
    void Test_kalkulieredurschnittzeit(){
        assertTrue(ben.kalkulieredurschnittzeit() == 38.333333333333336);
    }

}