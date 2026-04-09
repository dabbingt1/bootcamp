
import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dob;
    // ! array ( custom class)
    private Order[] orders;

    //isVip(), total amount for all orders > 100,000
    //true/false
    public boolean isVip() { 
        return this.totalOrderAmount() > 100_000;
    }

    public double totalOrderAmount() {
        BigDecimal sum = BigDecimal.ZERO;
        for ( int i = 0; i < this.orders.length; i++ ){
             sum = sum.add(BigDecimal.valueOf(this.orders[i].totalAmount()));

      }
      return sum.doubleValue();
    }
    //constructor
    // ! implicitly empty constructor 
    public Customer(){
        System.out.println("Creating customer");
    }

    // ! more than one constructor
    public Customer(String firstName, String lastName, char gender, LocalDate dob) {
        //creating...
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
    }

    //Methods:
    //birthYear
    public int  getBirthYear() {
        return this.dob.getYear();
    }


    //get set

    public String getFirstName(){
        return this.firstName;
    }

    public static void main(String[] args) {
        // "new" -> produce object ( call constructor)
        Customer c1 = new Customer();

        Customer c2 = new Customer("John", "Chan", 'M', LocalDate.of(1990, 1, 1));
        System.out.println(c2.getFirstName());
        System.out.println(c2.getBirthYear());
        //System.out.println(c2.getDob().getYear());
    }
}
