package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87,19.95f);
        // add new disc by title, category,directory,length,cost
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars" ,"Science Fiction" , "George Lucas" ,87, 24.95f);
        // add new disc by title, category,directory,length,cost
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin" ,"Animation" , 18.99f);
        // add new disc by title, category,cost
        cart.addMedia(dvd3);
        cart.printOrder();
}
}
