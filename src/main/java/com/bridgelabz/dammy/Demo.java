package com.bridgelabz.dammy;

public class Demo <T>{
    T[] myArray;

    public Demo(T[] myArray) {
        this.myArray = myArray;
    }

    public static void main(String[] args) {
        Integer a[]={1,2,3};
        Double b[]={1.1,2.2,3.3};
        Character c[]={'a','b','c'};
        toPrint( a );
        toPrint( b );
        toPrint( c );
        new Demo<Integer>(a).toPrint(  );
        new Demo<Double>(b).toPrint(  );
        new Demo<Character>(c).toPrint(  );


    }
    private void toPrint(){
        toPrint( myArray );
    }

    private static <E> void toPrint(E[] type)
    {
        for(E value: type)
        {
            System.out.println(value);
        }
    }
}
