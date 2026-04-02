

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


        //swap
        int x = 9;
        int y = 5;
        int temp = x; // x -> backup
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);


        //
        int j = 10;
        int k = 5;
        int max = j;
        if ( j > k ) {
            max = j;
            

        } else { 
            max = k;
           
        }
        System.out.println(max);


        // find min between 3 numbers
        int q = 10;
        int u = 2;
        int t = 8;
        int min =u;
        if (u < q && u < t) {
            min = u;
        } else if (q < u && q < t) {
            min = q;
        } else {
            min = t;
        }
        System.out.println(min);

        //string -> methods
        int score = 78;
        // >= 90 =grade A
        // > 80 grade b
        //>= 70 grade c
        char grade = 'F';
        if (score >= 90){
            grade = 'A';

        } else if (score >= 80 ) {
            grade = 'B';    
        } else if( score >= 70){
            grade ='C';
        }

        if (grade == 'A' || grade == 'B'){
            System.out.println("Excellent");
        } else if ( grade == 'C'){
            System.out.println("pass");
        }

        String s1 = "Java";
        if( s1.length() > 5 || s1.charAt(0) == 'J'){
            System.out.println("Hello");
        } else {
            System.out.println("byebye");
        }
        
        int year = 2200;
        // it is a leap year
        // it is not a leap year
        
         
         boolean isLeapYear = false;
         if( year % 4 == 0){
            if (year % 100 == 0){
                if( year % 400 == 0){
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
                } else {
                    isLeapYear = true;
                }
                 } else {
            isLeapYear = false;
            }

            if (isLeapYear){
                System.out.println("Yes");
             } else {
                    System.out.println("No");
            }

      
        if( year % 400 == 0 ) {
            System.out.println(year +" is a leap year");
        } else if ( year % 100 == 0){
                    System.out.println(year +" is not a leap year");
                }
                else if ( year % 4 == 0){
                    System.out.println(year +" is a leap year");
                }
                else {
                    System.out.println(year +" is not a leap year");
                }
                    
            

              //  boolean isLeapYear1 = ( year % 400 == 0 ) || ( year % 4 == 0 && year % 100 != 0);
         //isLeapYear1 = true;








        
        
    }
}
