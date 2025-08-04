import java.util.ArrayList;

public class Pizza {
    // java กำหนดค่าคงที่ keyword = final
    final private int maxtopping = 10;
    private ArrayList<String> toppings = new ArrayList<String>();
    private int totalToppings = 0;

    public Pizza() {
        // ไม่มีอะไรใน constructor
    }

    public int gettotalToppings() {
        return totalToppings;
    }

    // Add Topping
    public void addToppings(String topping) {
        if (totalToppings < maxtopping) {
            toppings.add(topping);
            totalToppings++;
        } else {
            System.out.println("ไม่สามารถเพิ่มเครื่องปรุงได้เกิน = " + maxtopping + " อย่าง");
        }
    }

    // Return ค่าเครื่องปรุง
    public int getTotalToppings(){
        return totalToppings;
    }

    // Calculate price
    public double getPrice() {
        if (totalToppings == 0) {
            return 100;
        } else {
            return 100 + (totalToppings * 10);
        }
    }

    // Show
    public void printAllTopping() {
        System.out.println("เครื่องปรุงทั้งหมด : ");
        for (String topping : toppings) {
            System.out.println("- " + topping);
        }
    }
}