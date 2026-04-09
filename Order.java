import java.math.BigDecimal;

public class Order {
    private Item[] items;
    private String address;

    public Order() {

    }

    public Order(Item[] items){

    }

    public double totalAmount() {
        //sum
        BigDecimal sum = BigDecimal.ZERO;
        for ( int i = 0; i < this.items.length; i++){
            Item item = items [i];
            double subTotal = item.subTotal();
            sum = sum.add(BigDecimal.valueOf(subTotal));
        }
        return sum.doubleValue();
    }
    public static void main(String[] args) {
        
    }
}
