package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Book;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King", "Animation", "Alter", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Lucas", 87, 19.95f);
        cart.addMedia(dvd2);

        Book book1 = new Book("Harry Potter", "Fantasy", 29.99f);
        cart.addMedia(book1);

        cart.printCart();
    }
}
