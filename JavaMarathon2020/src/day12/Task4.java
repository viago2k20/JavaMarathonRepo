package day12;
/*
Доработать класс MusicBand из прошлого задания таким образом, чтобы в группу можно
 было добавлять и удалять участников. Под участником понимается строка (String)
  с именем и фамилией. Реализовать метод слияния групп, т.е. все участники группы А все
   переходят в группу B (участники не могут находиться в двух группах одновременно).
    Реализовать метод, выводящий список участников в консоль. Проверить состав групп
     после слияния.
 */


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
