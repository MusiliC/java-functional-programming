package streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Musili", Gender.MALE),
                new Person("Shan", Gender.FEMALE),
              
                new Person("Mercy", Gender.FEMALE));

                //function
        // people.stream()
        //         .map(person -> person.gender)
        //         .collect(Collectors.toSet()) //to set removed duplicate
        //         .forEach(gender -> System.out.println(gender));

        //predicate

     boolean containsOnlyFemale =   people.stream().allMatch(person -> Gender.FEMALE.equals(person.gender));

     System.out.println(containsOnlyFemale);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
