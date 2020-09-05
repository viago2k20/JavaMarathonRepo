package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bandList = new ArrayList<>();
        bandList.add(new MusicBand("Queen", 1970));
        bandList.add(new MusicBand("Pink Floyd", 1965));
        bandList.add(new MusicBand("The Beatles", 1960));
        bandList.add(new MusicBand("Aerosmith", 1970));
        bandList.add(new MusicBand("Radiohead", 1985));
        bandList.add(new MusicBand("The Killers", 2001));
        bandList.add(new MusicBand("Звери", 2001));
        bandList.add(new MusicBand("Пающие трусы", 2008));
        bandList.add(new MusicBand("Ласковые Усы", 2010));
        bandList.add(new MusicBand("ВИА Зигмунд Фрейд", 2014));

        Collections.shuffle(bandList);

        List<MusicBand> bandListOneMore = new ArrayList<>();

        for (MusicBand musicBand : bandList) {
            System.out.println(musicBand.toString());
            if(musicBand.getYear() > 2000){
                bandListOneMore.add(musicBand);
            }
        }
        System.out.println("\n\n");
        for (MusicBand musicBand : bandListOneMore) {
            System.out.println(musicBand.toString());

        }



    }
}
