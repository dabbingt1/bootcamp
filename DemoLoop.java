public class DemoLoop {
    public static void main(String[] args) {
        //print x3
        System.out.println("bye");
        System.out.println("bye");
        System.out.println("bye");

        // For loop
        //initialization -> int i = 0;
        //continue criteria -> i < 3
        //Each iteration end -> i++
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
        }

        //step 1 : int i=0
        //step 2 : check if < 3
        //step 3 : print hello
        //step 4 : i++
        //step 5 : check if < 3
        //step 6 : print hello
        //step 7 : i++
        //step 8 : check if < 3
        //step 9 : print hello
        //step 10 : i++
        //step 11 : check if i < 3 (i = 3)
        //step 12 : exit loop

        //print even number
        for (int i = 0; i < 10; i++) {
            if ( i % 2 == 0 ) {
            System.out.println(i);
        }
    }

    for (int i = 0; i < 100; i++) {
        if ( i > 50 && i % 3 == 0 ) {//i % 3 == 0 && i > 50  - > slower, left runs first
            System.out.println(i);
        }
    }
            


    // hello
    // Find if character 'l' exist
    String s = "hello";
    boolean isTargetExists = false;
    for (int i =0; i < s.length(); i++){
        System.out.println(s.charAt(i));
        if (s.charAt(i) == 'l') {
            isTargetExists = true;
            break; //break nearest loop
        }
    }
    System.out.println(isTargetExists);
    int max = Integer.MIN_VALUE;
    String s2 = "947852106"; // Find the largest even digit
    for ( int i = 0; i < s2.length(); i++ ) {
        int digit = s2.charAt(i) - '0';
        if (digit % 2 == 0 && digit > max) {
            max = digit;
          }  
        }
        System.out.println(max);


        String s3 = "8A3ahs0nd3";

        //ahsnd
        String output = "";
        for ( int i = 0; i < s3.length(); i++) {
            boolean isAlphabet = s3.charAt(i) >= 97 && s3.charAt(i) <= 122;
            if (isAlphabet) {
                output += s3.charAt(i);
            }
        }
        System.out.println(output);

        //"725094849"
        // Find the largest index of the largest digit
        //8
        String s4 = "725094849";
       
            
      

    }
}

