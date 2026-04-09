

public class DemoWrapperClass {
    public static void main(String[] args) {
        // primitive ( byte, short, int, char, float, double, boolean, long)
        //wrapper class
        byte b1 = 100; //primitive
        Byte b2 = 100; //class

        short s1 = 100;
        Short s2 = 100;
        
        int x1 = 100;
        if (x1 == 100){

        }
        // ! always use method for comparison
        Integer x2 = 100;
        if (x2.compareTo(100) > 0){// check if x2 is larger than 100
            System.out.println("larger");
        }
        if (x2.compareTo(100) < 0){// check if x2 is smaller than 100
            System.out.println("smaller");
        }
        if (x2.equals(100)){// check if x2 equals to 100
            System.out.println("equal");
        }
        if (!x2.equals(100)){// check if x2 not equals to 100
            System.out.println("Not equal");
        }
        long l1 = 100L;
        Long l2 = 100L;

        float f1 = 9.0f;
        Float f2 = 9.0f;

        double d1 = 100.99;
        Double d2 = 100.99;

        char ch1 = 'c';
        Character ch2 = 'c';
        if (ch2.equals('c')){
            System.out.println("equal");
        }
        if (ch2.compareTo('c') > 0){
            System.out.println("AscII left > right");
        }
        if (ch2.compareTo('c') < 0){
            System.out.println("AscII left < right");
        }

        boolean o1 = true;
        Boolean o2 = true;
        //equals and NOT equals

        //Internal Cache
        Integer k1 = 127;
        Integer k2 = 127;
        System.out.println(k1.equals(k2));//true
        System.out.println(k1 == k2);//true

        Integer k3 = 128; // outside of -128 to 127, creat a new object 
        Integer k4 = 128; // outside of -128 to 127, creat a new object 
        System.out.println(k3.equals(k4));//true
        System.out.println(k3 == k4);//false

        // ! - 128 to 127

        // Integer ( class/object ) -> comparison -> compareTo, equals

        // ! Implicit promotion
        float f10 = 1000L;
        double d10 = 10.9f;
        float f12 = 19;
        byte b10 = 127;
        double d11 = b10; // assign byte value into double variable
        int x10 = 'a';
        double d12 = 'a';// ok, ascii 97.0

        //int x11 = d12; // ! potentially risky
        int x11 = (int) d12; // take risk - > overflow
        System.out.println(x11);
        
        // ! Wrapper class vs primitives ( auto-box / un-box )
        // ! auto-box (long -> Long)
        Long l30 = 100L; //long -> Long
        Integer i30 = 100; //int -> Integer
        Character ch30 = 'x';

        // ! un-box (Long -> long)
        long l31 = l30;
        int i31 = 130;
        char ch31 = ch30;

        //long l20 = 100; // int -> long
        // ! java would not auto convert "implicit promotion" and "auto - box" at the same time
        //Long l21 = 100; // int -> long -> Long
        //Double d100 = 10; // int -> double -> Double

    }
}
