package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        MusicBand bandA = new MusicBand("BadBoys", 1999);
        bandA.addSomeoneToBand("Bob");
        bandA.addSomeoneToBand("Sting");
        bandA.addSomeoneToBand("Bono");
        bandA.addSomeoneToBand("Rod");

        for (String bandList : bandA.getBandMember()) {
            System.out.println(bandList);
        }
        System.out.println(bandA.toString());
        System.out.println("");
        System.out.println("Группа А: " + bandA.printBandMember());
        MusicBand bandB = new MusicBand("GoodBoys", 2000);
        bandB.addSomeoneToBand("Bob");
        bandB.addSomeoneToBand("Mitchel");
        System.out.println("Группа Б: " + bandB.printBandMember());

        bandB.acceptNewMembers(bandA);

        System.out.println("Группа Б: " + bandB.printBandMember());
        System.out.println("Группа А: " + bandA.printBandMember());


    }

}
