public class DemoAscII {
    public static void main(String[] args) {
        // char (0 - 65535) --> int (21xxx)
        char c1 = 'a';
        // auto conversion
        int ascii = '0';
        System.out.println(ascii);
        int asci = '?';
        System.out.println(asci);
        System.out.println(c1);

        int ascii5 = '腌';
        System.out.println(ascii5);

        int ascii6 = '예';
        System.out.println(ascii6);

        // convert back to char value
        int ascii7 = 97;
        //char c2 = ascii7; // ! risky
        char c3 = 97;

        byte b1 = 100;
        byte b2 = 110;
        // byte value = - * / -> int
        // byte + byte -> int + int
        int i2 = b1 + b2;
        System.out.println(i2);

        short s1 = 20000;
        short s2 = 21000;
        // ! short + short -> int + int
        int ii2 = s1 + s2;
        System.out.println(ii2);

        double d1 = 999.99;
       // float f1 = d1; //risky

       float f2 = 999.99f;
       double d2 = f2; //ok

       double dd1 = 0.1;
       double dd2 = 0.2;
       System.out.println(dd1 * dd2);






        }    
}
