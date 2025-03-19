public class Cart {
    public static final int MAX_NUMBERS_ORDER = 20;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDER];

    public void addDigitalvideoDisc(DigitalVideoDisc item) {
        if(qtyOrdered == MAX_NUMBERS_ORDER) {
            System.out.println("The cart is full");
            return;
        }
        else if(qtyOrdered == MAX_NUMBERS_ORDER-1) {
            System.out.println("You can add 1 more item");
        }
        itemsOrdered[qtyOrdered] = item;
        qtyOrdered++;
    }

    public void addDigitalvideoDisc(DigitalVideoDisc[] items) {
        for (DigitalVideoDisc item : items) {
            if (qtyOrdered == MAX_NUMBERS_ORDER) {
                System.out.println("The cart is full, cannot add more DVDs.");
                return;
            }
            itemsOrdered[qtyOrdered] = item;
            qtyOrdered++;
        }
    }

    public void addDigitalvideoDisc(DigitalVideoDisc item1, DigitalVideoDisc item2) {
        if (qtyOrdered == MAX_NUMBERS_ORDER) {
            System.out.println("The cart is full, cannot add more DVDs.");
            return;
        }
        addDigitalvideoDisc(item1);
        if (qtyOrdered < MAX_NUMBERS_ORDER) {
            addDigitalvideoDisc(item2);
        }
    }

    public void removeDigitalvideoDisc(DigitalVideoDisc item) {
        if (qtyOrdered == 0) {
            System.out.println("Nothing to remove!");
        }
        else {
            int index = -1;
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] == item) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("Disc not found in cart!");
            } else {
                for (int i = index; i < qtyOrdered - 1; i++) {
                    itemsOrdered[i] = itemsOrdered[i + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println(item.getTitle() + " has been removed from the cart.");
            }
        }
    }

    public void displayCart(){
        System.out.println("------------------------------------- \n");
        System.out.println("Your cart includes: \n");
        for(int i=0; i<qtyOrdered; i++) {
            if(itemsOrdered[i] != null) {
                System.out.println(itemsOrdered[i].getTitle() + "\n");
            }
        }
        System.out.println("------------------------------------- \n");
    }
    public float totalCost(){
        float cost = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
            cost += itemsOrdered[i].getCost();
        }
        return cost;
    }

}
