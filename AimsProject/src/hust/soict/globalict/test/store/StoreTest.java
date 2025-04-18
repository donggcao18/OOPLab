package hust.soict.globalict.test.store;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class StoreTest {
    public  static void main(String args[]){
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Origin");

        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Origins");
    }
}
