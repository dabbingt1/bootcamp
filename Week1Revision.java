

public class Week1Revision {
    public static void main(String[] args) {
        System.out.println("hello");
        // 8 primitive + String
        byte b1 = 5; // -128 to 127
        short s1 = -30000; // -3xxxx to 3xxxx
        int i1 = 2_100_000_000; // -2_100_000_000 to 2_100_000_000
        // 2_200_000_000invalid int value
        long l1 = 2_200_000_000L;//long value
        //10.99 and 10.99d are double values 
        double d1 = 10.99;
        float f1 = 10.99f;
        boolean b01 = true; // true/false
        char ch1 = 'a'; // 97 -> Ascii
        //0 - 6xxxx
        
        // Math ( + - * /)
        // overflow
        // casting (down casting int -> byte)
        // divide 0
        // double + double (0.1 + 0.2) 
        //int + long -> long

        int number = 2100000000;
        int number2 = 100000000;
        System.out.println(number + number2); //-2094967296

        //downcasting (take risk)(could overflow)
        //byte + byte -> int + int -> int
        //short + short -> int + int -> intc

        byte by1 = 100;
        short sh1 = 32767;
        short sh2 = (short)(by1 + sh1);//or int
        System.out.println(sh2);//-32669

        //double + double
        System.out.println(0.1 + 0.2);

        // String
        String st1 = "Hello";
        System.out.println(st1.length());
        System.out.println(st1.charAt(4));
        System.out.println(st1.charAt(st1.length()-1));
        String st2 = "Hello";
        System.out.println(st2.equals(st1));

        //   tr
        //length (return int)
        //charAt (return int)
        //equals (return boolean)
        //indexOf (return int)
        //contains (return boolean)
        //substring (return String)
        //replace (return String)
        //startsWith (return boolean)
        //endsWith (return boolean)
        //equalsIgnoreCase (return boolean)
        System.out.println("hello".equalsIgnoreCase("Hello"));

        //compareTo (return int)
        System.out.println("ho".compareTo("gg")); //h - g

        //trim (return String)

        //isEmpty (return boolean)
        System.out.println("".isEmpty());

        //isBlank (return boolean)
        System.out.println("    ".isBlank());

        //lastIndexOf(return int)
        //concat (return String)
        //System.out.println(.concat());
        //toLowerCase (return String)
        //toUpperCase (return String)

        // ASCII
        char ch2 = 'a';
        //char + int -> int + int -> int
        int ascii = ch2 + 1;
        System.out.println(ascii);
       
        //operator
        //Math : + - * / % ++ -- += -= *= /=

        //comparison 
        // primitive comparison
        int age = 19;
        boolean isAdult = age >=18;
        if (!isAdult) {}
        //String comparison 
        String s10 = "Hello";
        String s11 = new String("Hello");
        System.out.println(s10 == s11);
        System.out.println(s10.equals(s11));


        // If + Switch (Conditional)
        double price = 99.99;
        int quantity = 10;
        double amount = price * quantity;

        //switch
        // need break
        // check single variable only ( Not range checking)
        char grade = 'A';
        switch (grade) {
            case 'A':
                //System.out
        }



        //For Loop
        for (int i=0; i<3; i++){

        }

        String s = "hello";
        boolean champ = false;
        for (int i = 0; i < s.length() ; i++) {
            System.out.println(s.charAt(i));

        }

        //hlo
        //el
        String t1 ="";
        String t2= "";
        for (int i=0; i<s.length(); i++) {
            if ( i % 2 == 0) {
                t1 += s.charAt(i);
                } else{
                    t2 += s.charAt(i);               
            }
        }
        System.out.println(t1);
        System.out.println(t2);

        //counting -> target
        //how many 'l' in the string
        int countL = 0;
        for ( int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'l'){
                countL++;
            }
        }
        System.out.println(countL);

        //Name Convension
        

    }
}
