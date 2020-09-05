package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private final String name;
    private int year;
    private List<MusicArtist> bandMember = new ArrayList<>();// Изначально пустой список

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public List<MusicArtist> getBandMember() {
        return bandMember;
    }

    public void setBandMember(List<MusicArtist> bandMember) {
        this.bandMember = bandMember;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addSomeoneToBand(MusicArtist musicArtist) {
        bandMember.add(musicArtist);
    }

    public void acceptNewMembers(MusicBand band){
        bandMember.addAll(band.bandMember);
        band.bandMember.clear();
    }

    public String printBandMember(){
        String st ="";
        for (MusicArtist out : bandMember)
            st +=out.getName() + ". ";
        return st;
    }

    public String toString() {
        return "Название группы: " + name
                + "\nГод основания: " + year
                + "\nУчастники группы: " + printBandMember();
    }
}
