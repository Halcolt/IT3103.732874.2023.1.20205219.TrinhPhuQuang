public class DigitalVideoDisc {
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;

    // Constructor for creating a digital video disc with a title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
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

    // Getter method for retrieving the title of the digital video disc
    public String getTitle() {
        return title;
    }

    // Setter method for setting the title of the digital video disc
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for retrieving the category of the digital video disc
    public String getCategory() {
        return category;
    }

    // Setter method for setting the category of the digital video disc
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter method for retrieving the directory of the digital video disc
    public String getDirectory() {
        return directory;
    }

    // Setter method for setting the directory of the digital video disc
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    // Getter method for retrieving the length of the digital video disc
    public int getLength() {
        return length;
    }

    // Setter method for setting the length of the digital video disc
    public void setLength(int length) {
        this.length = length;
    }

    // Getter method for retrieving the cost of the digital video disc
    public float getCost() {
        return cost;
    }

    // Setter method for setting the cost of the digital video disc
    public void setCost(float cost) {
        this.cost = cost;
    }
}