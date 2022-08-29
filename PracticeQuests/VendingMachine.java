package PracticeQuests;

import java.util.ArrayList;
import java.util.Scanner;

class OrderDetails{
    ArrayList<Integer> orderNumbers = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void load(int orderNumber, int quantity, Double price){
        orderNumbers.add(orderNumber);
        quantities.add(quantity);
        prices.add(price);
    }

    public void order_operation(int orderNumber, String operation){
        String op = operation.toLowerCase();
        if(op.equals("new")){
            if(orderNumbers.contains(orderNumber)){
                System.out.println(orderNumber + " already exists");
            }else{
                System.out.println("Enter Quantiy and Price of: " + orderNumber + " to create ");
                orderNumbers.add(orderNumber);
                quantities.add(sc.nextInt());
                prices.add(sc.nextDouble());
            }
        }

        if(op.equals("modify")){
            if(!(orderNumbers.contains(orderNumber))){
                System.out.println(orderNumber + " does not exists");
            }else{
                System.out.println("Enter Quantiy and Price of " + orderNumber + " to update: ");
                quantities.set(orderNumbers.indexOf(orderNumber), sc.nextInt());
                prices.set(orderNumbers.indexOf(orderNumber), sc.nextDouble());
            }
        }

        if(op.equals("delete")){
            if(!(orderNumbers.contains(orderNumber))){
                System.out.println(orderNumber + " does not exists");
            }else{
                quantities.remove(orderNumbers.indexOf(orderNumber));
                prices.remove(orderNumbers.indexOf(orderNumber));
                orderNumbers.remove(orderNumbers.indexOf(orderNumber));
            }
        }
    }

    public void display(){
        for(int i=0; i<orderNumbers.size(); i++){
            System.out.println("Order Number : "+orderNumbers.get(i) + " Quantity: " + quantities.get(i) + " Price:  " + prices.get(i));
        }
    }
}

public class VendingMachine {
    public static void main(String[] args) {
        OrderDetails o1 = new OrderDetails();

        o1.load(1234, 50, 52.5);
        o1.load(1587, 28, 55.0);
        o1.load(4521, 100, 49.0);
        o1.load(1427, 25, 55.0);
        o1.load(1587, 50, 48.80);

        System.out.println("Values Before Operations");
        o1.display();

        o1.order_operation(1427, "MODIFY");
        // 35, 55
        o1.order_operation(5821, "NEW");
        // 45, 48.80
        o1.order_operation(1234, "DELETE");
        o1.order_operation(5861, "NEW");
        // 45, 48.80

        System.out.println("Values after operaions");
        o1.display();
    }
}
