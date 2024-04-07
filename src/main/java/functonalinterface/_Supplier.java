package functonalinterface;

import java.util.function.Supplier;

public class _Supplier {

    //Supplier does not take any arguments but returns any type of value
    public static void main(String[] args) {
        System.out.println(getConnectionUrl());
        System.out.println(getConnectionUrlSUpplier.get());
    }

    static  String getConnectionUrl(){
        return  "Its a prank!";
    }
    static Supplier<String> getConnectionUrlSUpplier = () ->  "Another prank - Supplier!";
}
