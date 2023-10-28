public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitlVideoDisc dvd1 = new DigitlVideoDisc("The Lion King", "Animation", "Roger Allers", 87,19.95f); // need to add value in first

        anOrder.addDigitalVideoDisc(dvd1);
        System.out.println("Total cost is: " + anOrder.totalCost());
    }
}