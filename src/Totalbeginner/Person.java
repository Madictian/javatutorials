package Totalbeginner;

public class Person {
    //felter
     private String name; // name of the person
     private int max_books; // number of books that can be borrowed
    //constructor
    public Person() {
        name = "unknown name";
        max_books = 3;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax_books() {
        return max_books;
    }

    public void setMax_books(int max_books) {
        this.max_books = max_books;
    }

    public String testToString(){
        return this.getName() + "(" + this.getMax_books() + "books)";
    }

   /* public static void main(String[] args) {
    }
        Person p = new Person();
        p.setName("john");
        p.testToString();
        System.out.println(p.getName());
    }*/

}
