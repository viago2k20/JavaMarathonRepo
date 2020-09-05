package day12;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private final String name;
    private int year;
    private List<String> bandMember = new ArrayList<>();// Изначально пустой список

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public List<String> getBandMember() {
        return bandMember;
    }

    public void setBandMember(List<String> bandMember) {
        this.bandMember = bandMember;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //метод добавления участника группы
    public void addSomeoneToBand(String name) {
        bandMember.add(name);
    }

    //метод перехода участников из одной группы в другую
    public void acceptNewMembers(MusicBand band) {
        bandMember.addAll(band.bandMember);
        band.bandMember.clear();
    }

    //вывести список учестников
    public String printBandMember() {
        String st = "";
        for (String s : bandMember)
            st += s + " ";
        return st;
    }

    @Override
    public String toString() {
        return "\nНазвание группы: " + name
                + "\nГод основания: " + year
                + "\nУчастники группы: " + printBandMember();
    }
}
