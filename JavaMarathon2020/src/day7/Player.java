package day7;

import java.util.Random;

public class Player {
    int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    static int countPlayers;

    public Player() {
        Random random = new Random();
        stamina = random.nextInt(11) + 90;
        if (countPlayers < 6) {
            System.out.println("Новый игрок на поле!!!");
            countPlayers++;
        }

    }

    //метод run
    public void run() {
        this.stamina = this.stamina - 1;
        if (this.stamina == MIN_STAMINA){
            System.out.println("Игроку нужен отдых! Игрок уходит с поля");
            countPlayers --;
        }
    }

    //метод info
    public static void info() {
        switch (countPlayers) {
            case 0:
            case 1:
                System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных мест");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных места");
                break;
            case 5:
                System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободное место");
                break;
            case 6:
                System.out.println("Мест в командах больше нет");
                break;
        }


    }

}
