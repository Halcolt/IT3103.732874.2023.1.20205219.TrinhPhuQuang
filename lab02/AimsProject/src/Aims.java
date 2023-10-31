public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitlVideoDisc dvd1 = new DigitlVideoDisc("The Lion King", "Animation", "Roger Allers", 87,19.95f); // need to add value in first
        anOrder.addDigitalVideoDisc(dvd1);

        DigitlVideoDisc dvd2 = new DigitlVideoDisc("Star Wars" ,"Science Fiction" , "George Lucas" ,87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitlVideoDisc dvd3 = new DigitlVideoDisc("Aladin" ,"Animation" , 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);



        System.out.println("Total cost is: " + anOrder.totalCost());
    }
}