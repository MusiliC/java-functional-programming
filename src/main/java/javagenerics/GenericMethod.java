package javagenerics;

public class GenericMethod {
    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
        System.out.println(data.getClass().getSimpleName());
    }
}
