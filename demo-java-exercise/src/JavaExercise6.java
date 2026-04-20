public class JavaExercise6 {
  // Sum values of an array
  public static void main(String[] args) {
     // Print the numbers fulfill the below criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. First ten numbers
    int numbers = 0;
    for (int i = 0; i < 100 && numbers < 10; i++) {
      // code here ...
      if ( i % 2 == 0 && i % 3 == 0 && i != 0 ){
        numbers++;
        System.out.println(i);

      } 
      
    }
  }
}
