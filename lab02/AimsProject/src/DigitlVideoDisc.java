public class DigitlVideoDisc{
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;

    public DigitlVideoDisc(String title) {
        super();
        this.title = title;
    }

    public DigitlVideoDisc(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public DigitlVideoDisc(String title, String category, String directory, float cost) {
        this(title, category, cost);
        this.directory = directory;
    }

    public DigitlVideoDisc(String title, String category, String directory, int length, float cost) {
        this(title, category, directory, cost);
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public void setCost(float cost) {
        this.cost = cost;
    }
}