public class DemoClassObject {
    public static void main(String[] args) {
        //primitives, String, Array, if, loop

        //tutor phone no.
        //tutor email address
        //tutor wechat
        //tutor whatsapp

        String phonenumeber = "+852 xxxxxxxx";
        String email = "xxxxx@gmail.com";
        String wechat = "vincentau";
        String whatsapp = "+852 12345678";

        String[] tutor = new String[] {"+852 xxxxxxxx", "xxxxx@gmail.com", "vincentau","+852 12345678" };
        //disadvantage -> read data from development perspective, have to remember array location for specific data


        //object-oriented programming
        Tutor t1 = new Tutor(); // produce tutor object
        t1.setEmailAddress("sallychan@gmail.com");

        Tutor t2 = new Tutor();
        t2.setEmailAddress("leoLau@gmail.com");

        String t2Email = t2.getEmailAddress();
        System.out.println(t2Email);

        System.out.println(t1.getEmailAddress());
    }
    
}
