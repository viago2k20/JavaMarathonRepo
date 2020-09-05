package day12.task5;
/*
Требования поменялись - теперь у участника музыкальной группы есть не только имя, но и возраст.
 Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
  Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса,
   с новым именем) таким образом, чтобы участники были - объекты класса MusicArtist.
    После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы
     и проверить состав групп после слияния. Методы для слияния и для вывода участников в
      консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.

* В пакете day12 должно в результате быть 2 класса MusicBand - один для использования
 в Task4, другой для использования в Task5.
 */

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
