package functonalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    //Takes parameter and return boolean
    public static void main(String[] args) {

        System.out.println(isNumberValid("07000000"));
        System.out.println(isNumberValid("071234"));

        System.out.println(isNumberValidPredicate.test("071234"));

        //chaining predicates
        System.out.println(
                "is phone number valid and contains number 3 " +
                        isNumberValidPredicate.or(containsNumber3).test("071244")
        );

        System.out.println(
                "BiPredicate example -> is name equal to nick name " +
                isNameEqual.test("Musili", "Cee"));
    }

    static boolean isNumberValid(String number) {
        return number.startsWith("07") && number.length() == 6;
    }

    //using predicate
    static Predicate<String> isNumberValidPredicate = number ->
            number.startsWith("07") && number.length() == 6;
    static Predicate<String> containsNumber3 = number -> number.contains("3");

    //using bipredicate

   static BiPredicate<String, String> isNameEqual = (name, n_name) -> {
        return name.equals(n_name);
    };

}
