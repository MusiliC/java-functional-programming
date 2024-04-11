package optionals;

import java.util.Optional;

public class OptionalFunctional {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "Default value");

        //using suppliers
//        Object value2  = Optional.ofNullable(null)
//                .orElseThrow(() -> new IllegalStateException("No value"));

        //predicate
        Optional.ofNullable("k")
                .ifPresent(newValue -> {
                    System.out.println("Predicate::::::::::");
                    System.out.println(newValue);
                });
        System.out.println(value);

        //orElseGet
        Optional.ofNullable("k")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> {
                            System.out.println("Cannot send email;");
                        }
                );

    }
}
