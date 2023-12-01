package hust.soict.dsai.aims;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.cart.Cart;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87,19.95f);
        // add new disc by title, category,directory,length,cost
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars" ,"Science Fiction" , "George Lucas" ,87, 24.95f);
        // add new disc by title, category,directory,length,cost
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin" ,"Animation" , 18.99f);
        // add new disc by title, category,cost
        anOrder.addDigitalVideoDisc(dvd3);

        //anOrder.removeDigitalVideoDisc("Aladin");
        System.out.println("Total cost is: " + anOrder.totalCost());

        anOrder.printOrder();
        anOrder.searchByTitle("Star Wars");
        anOrder.searchByID(1);
    }
}