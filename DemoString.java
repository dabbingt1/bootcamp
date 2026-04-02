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

        //4. isEmpty()
        String s5 = "";
        System.out.println(s5.isEmpty());//true
        System.out.println(s2.isEmpty());

        //5.isBlank()
        String s6 = "    ";
        System.out.println(s6.isEmpty());
        System.out.println(s6.isBlank());

        //6.toLowerCase/ toUpperCase
        String lowercase = s2.toLowerCase();
        String uppercase = s2.toUpperCase();
        System.out.println("I love" + lowercase + uppercase);

        //7. contains
        if (s2.contains("For")){// case sensitive
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        //8.starts with / ends with
        if (s2.startsWith("For")){
            System.out.println("alright");
        } 
        if (s2.endsWith("sen"));
           System.out.println("okay");
        
        //9. replace - > return String
        String s7 = "Mordius";
        String s8 = s7.replace ('M', 'F');
        System.out.println(s8);

        String s9 = s7.replace ("ius", "erkaiser");
        System.out.println(s9); 

        //10. substring(startIndex, endIndex)
        String s10 = "steam";
        String ss = s10.substring(1, 5);// 5-1
        System.out.println(ss);

        System.out.println(s10.substring(4));

        //11. indexOf
        String s11 = "photosynthesis";
        System.out.println(s11.indexOf("ed"));
        System.out.println(s11.indexOf("to"));

        //12.lastIndexOf
        System.out.println(s11.lastIndexOf("t"));

        //13.trim (remove leading & tail space)
        String s12 = "   hello world   ";
        String afterTrim = s12.trim();
        System.out.println(afterTrim);
        System.out.println(s12);
        System.out.println(s12.replace(" ",""));

        // 14. concat
        String s121 = "hello";
        String s122 = " world";
        // string + string -> string
        System.out.println(s121 + s122);

        String combined = s121.concat(s122);
        System.out.println(combined);

        //15. compareTo
        String s13 = "abc";
        String s14 = "def";
        System.out.println(s13.compareTo(s14)); //-3('a' - 'd')

        if (s13.compareTo(s14)>0){
            System.out.println("s13 ASCII > s14 ASCII");
        } else {}

        //16. equalsIgnoreCase()
        String s15 = "Cedric Tsum";
        String s16 = "CEDRIC TSUM";
        if(s15.equalsIgnoreCase(s16)) {
            System.out.println("names are the same");
        }

        // Switch (AND OR, no Range Checking(x>y), need break)
        char gender = 'M';
        switch (gender) {
            case 'M':
             System.out.println("This is a men");
             break;
            case 'F':
                System.out.println("This is a Female");
                break;
            default:
                System.out.println("Invalid");
        }




        



    }
}
