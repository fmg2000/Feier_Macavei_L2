package com.company.Lab2_map;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
            List<Sport> sport_benutzer_1=new ArrayList<Sport>();
            Mannschaftssport mannschaftssport;
            Basketball basketball=new Basketball();
            Fussball fussball=new Fussball();
            Hindernislauf hindernislauf=new Hindernislauf();
            Hochsprung hochsprung=new Hochsprung();
            sport_benutzer_1.add(basketball);
            sport_benutzer_1.add(fussball);
            sport_benutzer_1.add(hindernislauf);
            Benutzer b=new Benutzer("Macavei","Darius",sport_benutzer_1);
            System.out.println(b.kalkulierezeit());
            System.out.println(b.kalkulierezeit_favorite_sport(basketball));
            System.out.println(b.kalkulierezeit_fur_art_sport());
            System.out.println(b.kalkulieredurschnittzeit());


    }
}
