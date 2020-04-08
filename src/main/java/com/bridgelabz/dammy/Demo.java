package com.bridgelabz.dammy;

public class Demo <X, Y, Z>{
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;

    public Demo(X[] myXArray, Y[] myYArray, Z[] myZArray) {
        this.myXArray = myXArray;
        this.myYArray = myYArray;
        this.myZArray = myZArray;
    }

    public static void main(String[] args) {
        Integer a[]={1,2,3};
        Double b[]={1.1,2.2,3.3};
        Character c[]={'a','b','c'};
        toPrint( a );
        toPrint( b );
        toPrint( c );
        new Demo<Integer,Double,Character>(a,b,c).toPrint(  );



    }
    private void toPrint(){
        toPrint( myXArray );
        toPrint( myYArray );
        toPrint( myZArray );

    }

    private static <E> void toPrint(E[] type)
    {
        for(E value: type)
        {
            System.out.println(value);
        }
    }
}
