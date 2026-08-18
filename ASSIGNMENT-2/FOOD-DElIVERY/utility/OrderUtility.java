package food.utility;
import food.model.Discountable;
import food.model.FoodOrder;
public class OrderUtility {
    public static boolean validateAmount(double amount) {
        return amount>0;
    }
    public static boolean validateCustomerName(String name) {
        return name != null && !name.trim().isEmpty();
    }
    public static void generateSummary(FoodOrder order) {
        double bill=order.getAmount();
        double discount=0;
        if (order instanceof Discountable) {
            discount=((Discountable) order).applyDiscount();
        }
        double deliveryCharge = order.calculateDeliveryCharge();
        double finalAmount = bill-discount+deliveryCharge;
        System.out.println("Order ID       : " +order.getOrderId());
        System.out.println("Customer Name  : " +order.getCustomerName());
        System.out.println("Bill Amount    : Rs. "+bill);
        System.out.println("Discount       : Rs. "+discount);
        System.out.println("Delivery Charge: Rs. "+deliveryCharge);
        System.out.println("Final Payable  : Rs. "+finalAmount);
        System.out.println("-------------------------------");
    }
}