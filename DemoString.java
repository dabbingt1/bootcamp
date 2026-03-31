public class DemoString {
    public static void main(String[] args) {
        // ! String is not primitive, but a class 
        //class has method

        //"" define string value
        //'' define char
        String s1 = "f";
        char c1 ='f';

        // String support + operation
        s1 = s1 + "!!!";
        System.out.println(s1);//f!!!

        // String has methods (function)
        // 1.  length() -> return int
        System.out.println(s1.length());

        // 2.    charAt() -> return char
        String s2 ="Forsen";
        //Find the third character in s2 ( start with 0)
        System.out.println(s2.charAt(2));
        // Find the last character in s2
        System.out.println(s2.charAt(s2.length()-1));

        // 3. equals() -> return boolean
        String s3 = "forsen"; // case sensitive
        System.out.println(s2.equals(s3));
        String v5 = "Forsen";
        System.out.println(s2.equals(v5));


    }
}
