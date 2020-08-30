/**
 * Дворовый футбол.
 * Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player),
 * содержит следующие поля:
 * поле “выносливость” (англ. stamina), разное для каждого экземпляра
 * константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и
 * “минимальная выносливость” (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров
 * статическое поле countPlayers, которое считает кол-во игроков на футбольном поле (изначально
 * их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
 *
 * и следующие методы:
 * run() - Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость на 1 при
 * однократном вызове. Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
 * info() -  выводит сообщение в зависимости от кол-ва игроков на поле, если игроков менее 6,
 * то выводит фразу “Команды неполные, еще есть ... свободных мест”, иначе “Мест в командах
 * больше нет”. Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
 * Задание: Создать класс Player по вышеописанному шаблону. Экземпляр класса при создании должен
 * иметь значение выносливости от 90 до 100. Создать 6 игроков, вызвать метод info().
 * При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
 * Примените к игроку метод run(), пока он полностью не выдохнется (отрицательное значение
 * выносливости не допускается). Вывести количество игроков на поле.
 *
 * По желанию: доработать метод info(), так, чтобы при выводе в консоль грамматика русского
 * языка учитывалась.
 */

package day7;

public class Task2 {
    public static void main(String[] args) {
        Player.info();

        Player player1 = new Player();
        Player.info();
        System.out.println("Количество игроков на поле: " + Player.countPlayers);

        Player player2 = new Player();
        Player player3 = new Player();
        Player.info();
        System.out.println("Количество игроков на поле: " + Player.countPlayers);

        Player player4 = new Player();
        Player.info();
        System.out.println("Количество игроков на поле: " + Player.countPlayers);

        Player player5 = new Player();
        Player player6 = new Player();
        Player.info();
        System.out.println("Количество игроков на поле: " + Player.countPlayers);

        Player player7 = new Player();
        Player player8 = new Player();

        System.out.println("Количество игроков на поле: " + Player.countPlayers);

        System.out.println("Выносливость ПЕРВОГО игрока " + player1.stamina);
        System.out.println("Выносливость втрого игрока " + player2.stamina);
        System.out.println("Выносливость третьего игрока " + player3.stamina);
        System.out.println("Выносливость четвертого игрока " + player4.stamina);
        System.out.println("Выносливость пятого игрока " + player5.stamina);
        System.out.println("Выносливость шестого игрока " + player6.stamina);

        player1.run();
        System.out.println("\nВыносливость ПЕРВОГО игрока " + player1.stamina);

        while (player1.stamina > 0){
            player1.run();
        }

        player1.run();
        player1.run();
        System.out.println("\nВыносливость ПЕРВОГО игрока " + player1.stamina);


        System.out.println("Количество игроков на поле: " + Player.countPlayers);
        Player.info();

        //Новый игрок на поле
        Player player9 = new Player();
        System.out.println("Выносливость нового игрока " + player9.stamina);
        Player.info();

        System.out.println("Количество игроков на поле: " + Player.countPlayers);

    }
}
