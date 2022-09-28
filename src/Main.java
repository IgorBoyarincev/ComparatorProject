import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> comparator = (Person p1, Person p2) -> {
            int len1 = p1.getSurname().split(" ").length;
            int len2 = p2.getSurname().split(" ").length;
            if (len1 != len2) {
                return Integer.compare(len1, len2);
            }
            return Integer.compare(p1.getAge(), p2.getAge());
        };
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ivan", "Sergeev Ivanov", 15));
        people.add(new Person("Pit", "Petrov Ivanov Alexsandrjv", 27));
        people.add(new Person("David", "de Alt", 10));
        people.add(new Person("Alex", "baranessa fon Tyutina Mashatova", 20));
        people.add(new Person("Piter", "Petrov", 21));
        System.out.println(people);
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
