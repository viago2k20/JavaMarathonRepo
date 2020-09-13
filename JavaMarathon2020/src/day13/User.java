package day13;
/*
Класс User должен иметь следующую структуру:
Поля:
Строковое поле “имя пользователя” (англ. username)
Список, параметризованный классом User, с названием “подписки” (англ. subscriptions).
 В этом списке должны храниться те пользователи, на которых подписан пользователь.

Конструктор:
Должен принимать в качестве аргумента только имя пользователя. Также, должен
 инициализировать поле “подписки” пустым списком.

Методы:
Геттеры на все поля

public void subscribe(User user) - подписывает пользователя на пользователя user

public boolean isSubscribed(User user) - возвращает True, если пользователь подписан
 на пользователя user и False, если не подписан.

public boolean isFriend(User user) - возвращает True, если пользователь user является
 другом и False, если пользователь user не является другом. Подумайте, что такое дружба
  в контексте соц. сетей.

public void sendMessage(User user, String text) - отправляет сообщение с текстом text
 пользователю user. Здесь должен использоваться статический метод из MessageDatabase.

public String toString() - возвращает строковое представление пользователя
 (имя пользователя).
 */

import java.util.ArrayList;
import java.util.List;

import static day13.MessageDatabase.sendMessage;

public class User {
    private String username;
    private List<User> subscriptions;

    //constructor
    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();//инициализируем пустой список
    }

    //getters
    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    //methods
    //подписывает пользователя на пользователя user
    public void subscribe(User user) {
        subscriptions.add(user);
    }

    //возвращает True, если пользователь подписан
    // на пользователя user и False, если не подписан.
    public boolean isSubscribed(User user) {
        if (subscriptions.contains(user)) {
            System.out.println(this.username + " подписан на пользователя " + user.getUsername());
            return true;
        } else {
            System.out.println(this.username + " не подписан на пользователя " + user.getUsername());
        }
        return false;
    }

    //private  boolean stat;
    public boolean isFriend(User user) {

        if (user.subscriptions.contains(this) && subscriptions.contains(user)) {
        //if (user.isSubscribed(this) && this.isSubscribed(user)) {// вариант через метод isSubscribed

            System.out.println(this.username + " и " + user.getUsername() + " Друзья");
            return true;
        } else
            System.out.println(this.username + " и " + user.getUsername() + " Не друзья");
        return false;
    }

    //отправляет сообщение с текстом text
    // пользователю user. Здесь должен использоваться статический метод из MessageDatabase.
    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(new User(this.username), user, text);
    }

    public void printSubscriptions() {
        System.out.print("Список пользователей, на кого подписан " + getUsername() + ": \n");
        if (subscriptions.size() == 0) {
            System.out.println("Список пуст, пользователь ни на кого не подписан!");
        } else
            for (User Subs : subscriptions) {
                System.out.println(Subs);
            }
    }

    //переопределям toString возвращает строковое представление пользователя
    @Override
    public String toString() {
        return username + ": ";
    }
}
