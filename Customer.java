
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

   // public order order() {}

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

     public String getFirstName() {
    return this.firstName;
  }

  public static void main(String[] args) {
    // "new" -> produce object (call constructor)
    //
    Customer c1 = new Customer();
    Customer c2 = new Customer("John", "Chan", 'M', LocalDate.of(1990, 1, 1));
    System.out.println(c2.getFirstName()); // John

    System.out.println(c1.getFirstName()); // null

    System.out.println(c2.getBirthYear()); // 1990
    //System.out.println(c2.getDob().getYear()); // 1990


    Customer c4 = new Customer();
    Order o1 = new Order();
    
    // 2 orders
    // order 1: 2 items
    // order 2: 1 item


    Item i1 = new Item("iphone19", 21000, 3);
    Item i2 = new Item("ak14", 120000, 1);
    Order or1 = new Order(new Item[]{i1, i2});

    Item i3 = new Item("dog", 120, 15);
    Order or2 = new Order(new Item[]{i3});

    c4.orders = new Order[]{or1};

    System.out.println("Order amount : " + c4.totalOrderAmount());
    System.out.println("Is VIP: " + c4.isVip());

    

    

    
    }
}
