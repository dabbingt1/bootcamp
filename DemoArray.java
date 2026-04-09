import java.util.Arrays;

public class DemoArray{
    public static void main(String[] args) {
        // int type
        int age = 10;
        int johnAge = 18;
        int maryAge = 17;
        int [] ages = new int[3];
        //1st box
        ages[0] = age;
        //2nd
        ages[1] = johnAge;
        //3rd
        ages[2] = maryAge;
        // swap jphn and marys age[array]
        int temp = ages[1];
        ages[1] = ages[2];
        ages[2] = temp;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        for (int i = 0; i < ages.length; i++){ //0,1,2
            System.out.println(i);

        }
        //System.out.println(ages[0]);
        //System.out.println(ages[1]);
        //System.out.println(ages[2]);

        //System.out.println(ages[-1]); // runtime error

        //declare length 100 array
        int[]dogs = new int[100];// default value 0
        for (int i = 0; i<dogs.length; i++){
            //System.out.println(dogs[i]);
        }
        // assign 100 - 199 into the array
        for (int i = 0; i<dogs.length ; i++){
            dogs[i] = i + 100;
        }

        // two ways to declare an array
        char [] cats = new char[4];
        cats[0] = 'a';
        cats[1] = 'b';
        cats[2] = 'c';
        cats[3] = 'd';

        double[] prices = new double[] {23.21, 2.53, 75.35};
        for (int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
        }
        // sum all price
        System.out.println(prices[0] + prices[1] + prices[2]);

        double totalPrice = 0;
        for ( int i=0; i<prices.length; i++){
            totalPrice += prices[i];
        }
        System.out.println(totalPrice);
        //find min value 
        double minPrice = prices[0];
        for ( int i = 0; i < prices.length; i++){
             if (prices[i] < minPrice) {
                minPrice = prices[i];
                break;
             } 
             System.out.println(minPrice);
        }
        // find max value


        //int[], double[], String[], char[]
        char[] chr = new char[]{'a', 'e', 'i', 'o', 'u'};
        String name = "Mary";
        //loop: check if name contains  char value from chr
        boolean contains = false;
        for (int i = 0 ; i < name.length(); i++){
            if ( name.charAt(i) == chr[0] ||name.charAt(i) == chr[1] ||name.charAt(i) == chr[2] ||name.charAt(i) == chr[3] ||name.charAt(i) == chr[4] ){
                contains = true;
                break; // break loop
            }
        }
        System.out.println(contains);

        //outer loop and innter loop
        for (int i = 0 ; i < name.length(); i++){// outer loop ( every char in name)
            for ( int j = 0; j < chr.length; j++){// inner loop (every char in chr)
                if ( name.charAt(i) == chr[j]){
                    contains = true;
                    break; //break inner loop
                }    
            }
            if (contains) {
                break; // break outer loop
            }
        }
       System.out.println(contains);//true

      //
      int[] arr2 = new int[] {100,4,99,55,17};
      //  move the first no. to tail ->4,99,55,17,100
      //brute force
      /*int move = arr2[0];
      arr2[0] = arr2[1];
      arr2[1] = arr2[2];
      arr2[2] = arr2[3];
      arr2[3] = arr2[4];
      arr2[4] = move; 
      System.out.println(arr2[0]);
      System.out.println(arr2[1]);
      System.out.println(arr2[2]);
      System.out.println(arr2[3]);
      System.out.println(arr2[4]);*/

      for (int i = 0;i < arr2.length -1 ; i++){
        int backup = arr2[i];
        arr2[i] = arr2[i+1];
        arr2[i+1] = backup;
        
      }
      System.out.println(Arrays.toString(arr2));

      int[] arr3 = new int[] {100, 4, 200, 55, 17};
      // Move the max number to the tail (100,4,55,17,200)

      for (int i = 0; i < arr3.length -1; i++){
        if (arr3[i] > arr3[i+1]) {
             int backup2 = arr3[i];
             arr3[i] = arr3[i+1];
            arr3[i+1] = backup2;
        }
      }
      System.out.println(Arrays.toString(arr3));

      //sorting
      //4, 55, 17, 100, 200
      int[] arr4 = new int[] {100,4,200,55,17};
      for ( int i = 0; i < arr4.length-1; i++){
        int backup = arr4[i];
        arr4[i] = arr4[i+1];
        arr4[i+1] = backup;
      }
      for (int i = 0; i < arr4.length -1; i++){
        if (arr4[i] > arr4[i+1]) {
             int backup2 = arr4[i];
             arr4[i] = arr4[i+1];
            arr4[i+1] = backup2;
        }
      }
      System.out.println(Arrays.toString(arr4));

      //sorting
      //4,17,55,100,200
      int[] arr5 = new int[] {100,4,200,55,17};
      for ( int i = 0; i < arr5.length-1; i++){ //how many times you move the max no.
        for ( int j = 0; j < arr5.length-1-i; j++){ //how many moves you need for max no.
        if (arr5[j] > arr5[j+1]) {
        int backup = arr5[j];
        arr5[j] = arr5[j+1];
        arr5[j+1] = backup;
      }
    }
}   
System.out.println(Arrays.toString(arr5));

String str ="abcdefg";
//reverse the string - > gfedcba
/*String reverseString = "";
for ( int i = str.length(); i < 0; i --) {
    reverseString += str.charAt(i);
    
}
System.out.println(str);

*/
    }
 } 