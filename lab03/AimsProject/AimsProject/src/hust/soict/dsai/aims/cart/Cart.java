package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    // Maximum number of items that can be ordered
    public static final int MAX_NUMBERS_ORDER = 20;

    // Array to store the digital video discs in the order
    private DigitalVideoDisc itemsOrder[] = new DigitalVideoDisc[MAX_NUMBERS_ORDER];

    // Variable to keep track of the quantity of items ordered
    private int qtyOrdered = 0;

    // Method to add a digital video disc to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // Check if the cart is not full
        if (qtyOrdered < MAX_NUMBERS_ORDER) {
            // Add the disc to the cart
            itemsOrder[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    // Method to remove a digital video disc from the cart
    public void removeDigitalVideoDisc(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrder[i] != null && itemsOrder[i].getTitle().equals(title)) {//search the title name in the list
                // Shift items in the array to remove the specified disc
                while (i < qtyOrdered - 1) {
                    itemsOrder[i] = itemsOrder[i + 1];
                    i++;
                }
                itemsOrder[qtyOrdered - 1] = null; // Set the last element to null
                qtyOrdered--; // Decrement the quantity ordered
                System.out.println("The disc with title '" + title + "' has been removed.");
                return;
            }
        }
        System.out.println("Disc with title '" + title + "' not found in the cart.");
    }

    // Method to calculate the total cost of the items in the cart
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            // Accumulate the cost of each item in the cart
            total += itemsOrder[i].getCost();
        }
        return total;
    }

    public void printOrder() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrder[i].toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    public void searchByTitle (String title) {
        int match = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrder[i] != null && itemsOrder[i].getTitle().equals(title)) {
                System.out.println((i + 1) + ". " + itemsOrder[i].toString());
                match = 1;
            }
        }
        if (match == 0) {
            System.out.println("Not found");
        }
    }

    public void searchByID (int id){
        int match = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrder[i] != null && i +1 == id) {
                System.out.println((i + 1) + ". " + itemsOrder[i].toString());
                match = 1;
            }
        }
        if (match == 0) {
            System.out.println("Not found");
        }
    }
}