import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ivan", "Sergeev Ivanov", 15));
        people.add(new Person("Pit", "Petrov Ivanov Alexsandrjv", 27));
        people.add(new Person("David", "de Alt", 10));
        people.add(new Person("Alex", "baranessa fon Tyutina Mashatova", 20));
        people.add(new Person("Piter", "Petrov", 21));
        System.out.println(people);
        Collections.sort(people, new PersonComparator());
        System.out.println(people);
    }
}
