package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    // Array to store DVDs available in the store
    private DigitalVideoDisc itemsInStore[];

    // Constructor to initialize the itemsInStore array
    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        // Check if the store is not full
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == null) {
                // Add the DVD to the store
                itemsInStore[i] = dvd;
                System.out.println("The DVD has been added to the store.");
                return;
            }
        }
        System.out.println("The store is full. Cannot add the DVD.");
    }
    // Method to remove a DVD from the store based on title
    public void removeDVD(String title) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].getTitle().equals(title)) {
                // Remove the DVD from the store
                itemsInStore[i] = null;
                System.out.println("The DVD with title '" + title + "' has been removed from the store.");
                return;
            }
        }
        System.out.println("DVD with title '" + title + "' not found in the store.");
    }

    // Method to print the DVDs currently in the store
    public void displayItemsInStore() {
        System.out.println("DVDs:");
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] != null) {
                System.out.println((i + 1) + ". " + itemsInStore[i].toString());
            }
        }
    }
}
