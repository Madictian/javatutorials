package Totalbeginner;

import java.util.ArrayList;
import java.util.Collection;

public class MyLibrary {
    String name;
    ArrayList<Bog> bog;
    ArrayList<Person> people;



    public MyLibrary(String name) {
        this.name = name;
        bog = new ArrayList<Bog>();
        people = new ArrayList<Person>();
    }
    public String getName() {
        return name;
    }
    public ArrayList<Bog> getBog() {
        return bog;
    }
    public ArrayList<Person> getPeople() {
        return people;
    }
    public void addBog(Bog b1) {
        this.bog.add(b1);
    }
    public void removeBog(Bog b1) {
        this.bog.remove(b1);
    }
    public void addPerson(Person p1){
        this.people.add(p1);
    }
    public void removePerson(Person p1){
        this.people.remove(p1);
    }
    public boolean checkOut(Bog b1, Person p1) {
        int booksOut = this.getBooksforperson(p1).size();
        if ((b1.getPerson() == null) && booksOut < p1.getMax_books()) {
            b1.setPerson(p1);
            return true;
        } else{
            return false;
        }
    }
    public boolean checkIn(Bog b1) {
        if (b1.getPerson() != null){
            b1.setPerson(null);
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Bog> getBooksforperson(Person p1) {
        ArrayList<Bog> result = new ArrayList<>();
        for (Bog aBog : this.getBog()){
            if((aBog.getPerson() != null) && (aBog.getPerson().getName().equals(p1.getName()))){
                result.add(aBog);
            }
        }
        return result;
    }
}







