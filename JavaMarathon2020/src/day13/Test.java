package day13;

public class Test {
    public static void main(String[] args) {
        User userTom = new User("Tom");
        User userKate = new User("Kate");
        User userDuke = new User("Duke");

        userTom.subscribe(userKate);
        userTom.subscribe(userDuke);

        userDuke.subscribe(userTom);
        userDuke.subscribe(userKate);

        System.out.println(userTom.isSubscribed(userKate));
        System.out.println("");

        System.out.println(userKate.isSubscribed(userTom));
        System.out.println("");

        System.out.println(userKate.toString());
        userKate.printSubscriptions();
        System.out.println("");

        System.out.println(userTom.toString());
        userTom.printSubscriptions();
        System.out.println("");

        System.out.println(userDuke.toString());
        userDuke.printSubscriptions();
        System.out.println("");

        System.out.println(userTom.isFriend(userDuke));
        System.out.println("");

        System.out.println(userKate.isFriend(userTom));
        System.out.println("");

        System.out.println(userTom.isFriend(userKate));
        System.out.println("");

        userTom.sendMessage(userKate, "Привет, Kate!");
        userTom.sendMessage(userKate, "Как дела?");
        userKate.sendMessage(userTom, "Привет Том!");
        userKate.sendMessage(userTom, "Дела норм!");
        userKate.sendMessage(userTom, "Участвую в марафоне по JAVA! :) ");

        userDuke.sendMessage(userTom, "Том, привет!");
        userDuke.sendMessage(userTom, "Как поживаешь чувак?");
        userDuke.sendMessage(userTom, "Я тут узнал такое!");
        userDuke.sendMessage(userTom, "Kate занялась кодингом на Java, представляешь! ");
        userTom.sendMessage(userDuke, "Привет, Duke! Спасибо, у меня все ок! Как сам?");
        userTom.sendMessage(userDuke, "Ага, я в курсе этой новости!");
        userTom.sendMessage(userDuke, "Теперь у нас еще один Java программист! :) ");

        MessageDatabase.showDialog(userTom, userKate);
        System.out.println("");
        MessageDatabase.showDialog(userDuke, userTom);










    }
}
