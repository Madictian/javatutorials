package Totalbeginner;

public class Bog {
    public String author;
    private Person person;
    public String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
//
    public Bog(String string) {
        this.title = string;
        this.author = "Unknown author";
    }

    public void setPerson( Person p1) {
        this.person  = p1;
    }

    public Person getPerson() {
        return  this.person;
    }
}
