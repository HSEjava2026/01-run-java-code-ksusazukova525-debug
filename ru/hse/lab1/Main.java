import second.Person;
/**
 * @author Жукова Ксения Александровна
 * @version 1.0
 * @since 2026
 */
public class Main{
    public static void main(String[] args) {
        Person person = new Person("Иван",20);
        System.out.println("Имя: " + person.age);
        System.out.println("Возраст: "+ person.name);
        
    }
}
