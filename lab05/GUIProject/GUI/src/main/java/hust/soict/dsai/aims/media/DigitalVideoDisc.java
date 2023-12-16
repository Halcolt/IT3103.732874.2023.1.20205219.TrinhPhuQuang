package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;
    private int id;

    public DigitalVideoDisc(String title) {
        super(title);
        this.title = getTitle();
        this.id = ++nbDigitalVideoDisc;
    }

    // Constructor for creating a digital video disc with a title, category, and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title); // Call the constructor with a title to initialize it
        this.category = category;
        this.cost = cost;
    }

    // Constructor for creating a digital video disc with a title, category, directory, and cost
    public DigitalVideoDisc(String title, String category, String directory, float cost) {
        this(title, category, cost); // Call the constructor with title, category, and cost
        this.directory = directory;
    }

    // Constructor for creating a digital video disc with title, category, directory, length, and cost
    public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
        this(title, category, directory, cost); // Call the constructor with title, category, directory, and cost
        this.length = length;
    }

    public String getDirectory() {
        return directory;
    }
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public static int nbDigitalVideoDisc =  0;
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + directory + " - " + length + " minutes: " + cost + " $";
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength() + " minutes");
    }
}
