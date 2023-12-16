package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    // ArrayList to store the media items in the cart
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        // Add the media to the ArrayList
        itemsOrdered.add(media);
        System.out.println("The item has been added to the cart.");
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The item has been removed from the cart.");
        } else {
            System.out.println("Item not found in the cart.");
        }
    }

    // Method to calculate the total cost of all items in the cart
    public float totalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Method to print the contents of the cart
    public void printOrder() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void searchByTitle(String title) {
        int match = 0;
        for (Media media : itemsOrdered) {
            if (media != null && media.getTitle().equals(title)) {
                System.out.println((itemsOrdered.indexOf(media) + 1) + ". " + media.toString());
                match = 1;
            }
        }
        if (match == 0) {
            System.out.println("Not found");
        }
    }

    public void searchByID(int id) {
        int match = 0;
        for (Media media : itemsOrdered) {
            if (media != null && itemsOrdered.indexOf(media) + 1 == id) {
                System.out.println((itemsOrdered.indexOf(media) + 1) + ". " + media.toString());
                match = 1;
            }
        }
        if (match == 0) {
            System.out.println("Not found");
        }
    }
    // Method to sort items by title first, then cost
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    // Method to sort items by cost first, then title
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
}
