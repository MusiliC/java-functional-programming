package javagenerics;

public class Main {

    //They don't use primitive data types like int, double
    //They use - wrapper classes Integer, Double

    public static void main(String[] args) {

        GenericClass<Integer> genericClass = new GenericClass<>(5);
        System.out.println(genericClass.getData()) ;

        GenericClass<String> genericClassTwo = new GenericClass<>("Musili");
        System.out.println(genericClassTwo.getData()) ;

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.<String>genericsMethod("All");
    }


}
