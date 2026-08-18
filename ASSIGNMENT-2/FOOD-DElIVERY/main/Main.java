package food.main;
import food.model.FoodOrder;
import food.model.PremiumOrder;
import food.model.RegularOrder;
import food.service.OrderService;
public class Main {
    public static void main(String[] args) {
        FoodOrder[] orders = new FoodOrder[6];
        orders[0] = new RegularOrder(101, "Vandit", 5000);
        orders[1] = new PremiumOrder(102, "Sujal", 2000);
        orders[2] = new RegularOrder(103, "Harshit", 750);
        orders[3] = new PremiumOrder(104, "Sunidhi", 1200);
        orders[4] = new RegularOrder(105, "Yatharth", 900);
        orders[5] = new PremiumOrder(106, "Yash", 1500);
        System.out.println("Restaurant: " + FoodOrder.getRestaurantName());
        FoodOrder.displayTotalOrders();
        System.out.println("ORDER DETAILS : \n");
        OrderService.displayBills(orders);
    }
}