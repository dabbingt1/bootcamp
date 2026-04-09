public class DemoStringII {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));

        //string is a class
        // ! new - > produce object
        String s3 = new String("hello");
        String s4 = new String("hello");
        // ! dont use == for comparison
        // ! for class object (non-primitive) always use equals for comparison
        // == -> checking if they are from same address ( same object)
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        // equals - > check if they are with same value
        if (s1.equals(s4)) {
            System.out.println("hello");
        }

        //all primitive still uses == for comparison
        int x = 3;
        if (x == 3) {
            System.out.println("yes");
        }

        Person p2 = new Person();
        Person p3 = new Person();
        

    }
    
}
