public class Cart {
    public static final int MAX_NUMBERS_ORDER = 20;
    private DigitlVideoDisc itemsOrder[] = new DigitlVideoDisc[MAX_NUMBERS_ORDER];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitlVideoDisc disc){
        if (qtyOrdered < MAX_NUMBERS_ORDER){
            itemsOrder[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full. ");
        }
    }

    public void removeDigitalVideoDisc(DigitlVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++){
            if (disc == itemsOrder[i]) {
                while (i < qtyOrdered - 1){
                    itemsOrder[i] = itemsOrder[i+1];
                    i++;
                }
                itemsOrder[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                return;
            }
        }

    }
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrder[i].getCost();
        }
        return total;
    }
}
