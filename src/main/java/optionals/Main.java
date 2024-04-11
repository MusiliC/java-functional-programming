package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        Optional<Cat> myCat = findCatByName("Fred");

        //method one
        if (myCat.isPresent()) {
            System.out.println(myCat.get().getAge());
        } else {
            System.out.println(0);
        }

        //method two - default value when the value is not present
        Cat optionalCat = myCat.orElse(new Cat("Unknown", 0));

        //method three -> lambdas
        Cat optionalNewCat = myCat.orElseGet(() -> new Cat("unknown", 10));

        //method four - map allows to do a transformation if the value is present
        System.out.println("Map::::::::with or else");
        System.out.println( myCat.map(Cat::getAge).orElse(0));

    }

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }

    //optional.of - sure there is value
    //optional.empty - sure the value is empty
    //optional.ofNullable - not sure value is present or nullable
}
