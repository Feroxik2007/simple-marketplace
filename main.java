import java.util.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance;
        String name;
        String items;
        
        int itemss;
        System.out.println("Welcome to best market in the world!");
        System.out.println("Wha do you want to buy?");
        System.out.println("We got: 1. Apple, 2. Banana, 3. Orange, 4. Watermelon, 5. Pineapple, 6. Mango");
        itemss = scanner.nextInt();
        if (itemss == 1) {
            System.out.println("You have selected Apple");
            System.out.println("How many apples do you want?");
            int apple = scanner.nextInt();
            System.out.println("You have selected " + apple + " apples");
            System.out.println("The price of one apple is 5.00");
            double price = 5.00;
            double total = apple * price;
            System.out.println("The total price is " + total);
            System.out.println("Please enter your name");
            name = scanner.next();
            System.out.println("Please enter your balance");
            balance = scanner.nextDouble();
            if (balance < total) {
                System.out.println("You don't have enough money to buy this");
                }
            else {
                System.out.println("You have enough money to buy this");
                System.out.println("Do you want to buy this? (yes/no)");
                items = scanner.next();
                if (items.equals("yes")) {
                    System.out.println("You have bought " + apple + " apples");
                    System.out.println("You have " + (balance - total) + " left");
                    System.out.println("Thank you for shopping with us");
                    
                }
                else {
                    System.out.println("You have not bought anything");
                    System.out.println("Thank you for shopping with us");
                }
            }
            }
        else if(itemss == 2) {
            System.out.println("You have selected Banana");
            System.out.println("How many bananas do you want?");
            int banana = scanner.nextInt();
            System.out.println("You have selected " + banana + " bananas");
            System.out.println("The price of one banana is 3.00");
            double price = 3.00;
            double total = banana * price;
            System.out.println("The total price is " + total);
            System.out.println("Please enter your name");
            name = scanner.next();
            System.out.println("Please enter your balance");
            balance = scanner.nextDouble();
            if (balance < total) {
                System.out.println("You dont have enought money to buy this");
            }
            else {
                System.out.println("You have enought money to buy this");
                System.out.println("Do you want to buy this? (yes/no)");
                items = scanner.next();
                if (items.equalsIgnoreCase("Yes")) {
                    System.out.println(" You just bought " + banana + " bananas");
                    System.out.println("You have " + (balance - total) + " left");
                }
                else {
                    System.out.println("You have not bought anything");
                    System.out.println("Thank you for shopping with us");
                } 
            }
        }
        else if (itemss == 3) {
            System.out.println("You have selected Orange");
            System.out.println("How many oranges do you want?");
            int orange = scanner.nextInt();
            System.out.println("You have selected " + orange + " oranges");
            System.out.println("The price of one orange is 4.00");
            double price = 4.00;
            double total = orange * price;
            System.out.println("The total price is " + total);
            System.out.println("Please enter your name");
            name = scanner.next();
            System.out.println("Please enter your balance");
            balance = scanner.nextDouble();
            if (balance < total) {
                System.out.println("You don't have enough money to buy this");
            }
            else {
                System.out.println("You have enough money to buy this");
                System.out.println("Do you want to buy this? (yes/no)");
                items = scanner.next();
                if (items.equalsIgnoreCase("yes")) {
                    System.out.println("You have bought " + orange + " oranges");
                    System.out.println("You have " + (balance - total) + " left");
                    System.out.println("Thank you for shopping with us");
                }
                else {
                    System.out.println("You have not bought anything");
                    System.out.println("Thank you for shopping with us");
                }
            }
        }
        else if (itemss == 4) {
            System.out.println("You have colected Watermelon");
            System.out.println("How many watermelons do you want?");
            int watermelon = scanner.nextInt();
            System.out.println("You have selected " + watermelon + " watermelons");
            System.out.println("The price of one watermelon is 10.00");
            double price = 10.00;
            double total = watermelon * price;
            System.out.println("The total price is " + total);
            System.out.println("Please enter your name");
            name = scanner.next();
            System.out.println("Please enter your balance");
            balance = scanner.nextDouble();
            if (balance < total) {
                System.out.println("You don't have enough money to buy this");
            }
            else {
                System.out.println("You have enough money to buy this");
                System.out.println("Do you want to buy this? (yes/no)");
                items = scanner.next();
                if (items.equalsIgnoreCase("yes")) {
                    System.out.println("You have bought " + watermelon + " watermelons");
                    System.out.println("You have " + (balance - total) + " left");
                    System.out.println("Thank you for shopping with us");
                }
                else {
                    System.out.println("You have not bought anything");
                    System.out.println("Thank you for shopping with us");
                }
            }
        }
        else if(itemss == 5){
            System.out.println("You have collected Pineapple");
            System.out.println("How many pineapples do you want?");
            int pineapple = scanner.nextInt();
            System.out.println("You have selected " + pineapple + " pineapples");
            System.out.println("The price of one pineapple is 7.00");
            double price = 7.00;
            double total = pineapple * price;
            System.out.println("The total price is " + total);
            System.out.println("Please enter your name");
            name = scanner.next();
            System.out.println("Please enter your balance");
            balance = scanner.nextDouble();
            if (balance < total) {
                System.out.println("You don't have enough money to buy this");
            }
            else {
                System.out.println("You have enough money to buy this");
                System.out.println("Do you want to buy this? (yes/no)");
                items = scanner.next();
                if (items.equalsIgnoreCase("yes")) {
                    System.out.println("You have bought " + pineapple + " pineapples");
                    System.out.println("You have " + (balance - total) + " left");
                    System.out.println("Thank you for shopping with us");
                }
                else {
                    System.out.println("You have not bought anything");
                    System.out.println("Thank you for shopping with us");
                }
            }
        }
        else if (itemss == 6) {
            System.out.println("You have collected Mango");
            System.out.println("How many mangoes do you want?");
            int mango = scanner.nextInt();
            System.out.println("You have selected " + mango + " mangoes");
            System.out.println("The price of one mango is 6.00");
            double price = 6.00;
            double total = mango * price;
            System.out.println("The total price is " + total);
            System.out.println("Please enter your name");
            name = scanner.next();
            System.out.println("Please enter your balance");
            balance = scanner.nextDouble();
            if (balance < total) {
                System.out.println("You don't have enough money to buy this");
            }
            else {
                System.out.println("You have enough money to buy this");
                System.out.println("Do you want to buy this? (yes/no)");
                items = scanner.next();
                if (items.equalsIgnoreCase("yes")) {
                    System.out.println("You have bought " + mango + " mangoes");
                    System.out.println("You have " + (balance - total) + " left");
                    System.out.println("Thank you for shopping with us");
                }
                else {
                    System.out.println("You have not bought anything");
                    System.out.println("Thank you for shopping with us");
                }
            }
            
        }

    }
}    

