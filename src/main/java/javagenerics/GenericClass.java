package javagenerics;

public class GenericClass<T> {
    private final T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
