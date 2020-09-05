package day12.task5;

public class Task5 {
    public static void main(String[] args) {
        MusicBand bandA = new MusicBand("CoolBoys", 1937);
        MusicArtist musicArtist = new MusicArtist("Duke", 1899);
        MusicArtist musicArtist1 = new MusicArtist("Count Basie", 1904);
        MusicArtist musicArtist2 = new MusicArtist("Chick Webb", 1905);
        MusicArtist musicArtist3 = new MusicArtist("Ella Fitzgerald", 1917);
        bandA.addSomeoneToBand(musicArtist);
        bandA.addSomeoneToBand(musicArtist1);
        bandA.addSomeoneToBand(musicArtist2);
        bandA.addSomeoneToBand(musicArtist3);
        System.out.println(bandA);
        System.out.println("");

        MusicBand bandB = new MusicBand("JazzBoys", 1945);
        MusicArtist musicArtist4 = new MusicArtist("Oscar Peterson", 1925);
        bandB.addSomeoneToBand(musicArtist4);
        System.out.println(bandA);
        System.out.println("");

        System.out.println("Участники группы А: " + bandA.printBandMember());
        System.out.println("Участники группы Б: " + bandB.printBandMember());

        bandB.acceptNewMembers(bandA);

        System.out.println("Участники группы А: " + bandA.printBandMember());
        System.out.println("Участники группы Б: " + bandB.printBandMember());


    }
}
