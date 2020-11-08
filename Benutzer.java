package com.company.Lab2_map;

import java.util.List;
import java.util.Scanner;

public class Benutzer{

    /*
    Atributele clasei
     */
    String vorname;
    String nachname;
    List<Sport> sport;
    //private List<Sport> sport;

    public double kalkulierezeit()
    {
        /// Calculam timpul total facnd sport
        double sum=0;
        for (Sport i: sport)
        {
            sum=sum+i.kalkulierezeit();
        }
        System.out.println("Timpul total petrecut facand sport:");
        return sum;
    }
    public double kalkulierezeit_favorite_sport(Sport s)
    {
        /// Calculam timpul sportului preferat,
        for(Sport i: sport)
        {
            if(i==s) {
                System.out.println("Timpul sportului preferat:");
                return s.kalkulierezeit();
            }
        }
        return 0;
    }

    public double kalkulierezeit_fur_art_sport()
    {
        /*
            Calculam timpul pentru sporturile de echipe sau individoale
            Folosim un switch pentru cele 2 categori de sporturi
            Verificam daca in ce categorie se incadreaza sportul
         */
        double sum=0;
        System.out.println("Doresti sa calculezi timpul pentru sporturile de echipa sau cele individuale?");
        System.out.println("Tasta 1-sporturi de echipa");
        System.out.println("Tasta 2-sporturi individuale");
        Scanner scanner=new Scanner(System.in);
        int varianta=scanner.nextInt();
        switch(varianta)
        {
            case 1:{
                for (Sport i : sport) {
                    if (i instanceof Mannschaftssport)
                        sum = sum + i.kalkulierezeit();
                }
                break;

            }
            case 2:
            {
                for (Sport i : sport) {
                    if (i instanceof Leichtathletik)
                        sum = sum + i.kalkulierezeit();
                }
                break;

            }
            default:System.out.println("Tasta invalida!");
        }
        return sum;
    }
    public double kalkulieredurschnittzeit()
    {
        /// Calculam media
        double sum=0;
        for (Sport i: sport)
        {
            sum=sum+i.kalkulierezeit();
        }
        System.out.println("Media timpului folosit in sporturi:");
        return sum/sport.size();
    }
    public Benutzer(String vorname, String nachname,List<Sport> sport)
    {
        /// constructor
        this.vorname=vorname;
        this.nachname=nachname;
        this.sport=sport;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }
    public String print()
    {
        return this.vorname+" "+this.nachname+" "+this.sport;
    }
}
