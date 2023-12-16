package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private int id;
    private String tittle;
    private  String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();
    private int nbBook;

    public Book(String title, String category, float cost, List<String> authors) {
        super();
        id = ++nbBook;
        setTitle(title);
        setCategory(category);
        setCost(cost);
        this.authors = authors;
    }

    public String toString() {
        return "Book " + title + " - " + category + " - " +  " price: " + cost + " $";
    }

    public void addAuthor(String authorName) {
        // make sure the author is not already in the ArrayList before adding
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author added: " + authorName);
        } else {
            System.out.println("Author already exists: " + authorName);
        }
    }
    public void removeAuthor(String authorName) {
        // make sure the author is present in the ArrayList before removing
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        } else {
            System.out.println("Author not found: " + authorName);
        }
    }
}
