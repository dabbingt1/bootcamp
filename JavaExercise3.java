public class JavaExercise3 {
  public static void main(String[] args) {
    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant (the othor 21 letters)
    // 3. Not an alphabet
    char ch = 'I';
    if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
      System.out.println("The character is a vowel");
    } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
      System.out.println("The character is not a vowel");
    } else {
      System.out.println("The character is not an alphabet");
    }

    // Take salary and years of experience, then calculate and print bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    int exp = 12;
    int salary = 110_000;
    if (exp >= 10){
      System.out.println("Amount of bonus is " + salary*0.2);
    } else if ( exp >= 5 && exp <= 9 ){
      System.out.println("Amount of bonus is " + salary*0.1);
    } else {
      System.out.println("Amount of bonus is " + salary*0.05);
    }
  }
}
