public class Demoif {
    public static void main(String[] args) {
        //if
        int age = 15;
        if (age >= 18) {
            System.out.println("yes");           
        } else {
        System.out.println("no");
        }

        double cash = 16.45;
        if (cash == 16.45) {
            System.out.println("ye");
            System.out.println("s");

         } else {
        System.out.println("no");
       }
    
        age = 70;

        boolean isElderly = age > 65;
        if (isElderly)
            System.out.println("Free entry");


        // && \\
        int a = 10;
        if (a >= 5 && a<= 20) {
            System.out.println("a is between 5 and 20");
        }

        if (a >= 5 || a<=20) {
            System.out.println("a is either >= 5 or <= 20");// all no. care
        }

        int b = 10;
        if ( a>= 7 || b>6 && a<5)
            System.out.println("ok");


        
        
    }
}
