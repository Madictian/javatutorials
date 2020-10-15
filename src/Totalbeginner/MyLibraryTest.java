package Totalbeginner;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyLibraryTest {

    private Bog b1;
    private Bog b2;
    private Person p1;
    private Person p2;
    private MyLibrary m1;

    // test constructor
    @Test
    public void testMyLibrary(){
        MyLibrary m1 = new MyLibrary("test");

        assertEquals("test", m1.name);

        assertTrue(m1.bog instanceof ArrayList);
        assertTrue(m1.people instanceof ArrayList);

    }
    public void setup(){
        b1 = new Bog("book1");
        b2 = new Bog("book2");
        p1 = new Person();
        p2 = new Person();
        p1.setName("Fred");
        p2.setName("Johnny");

        m1 = new MyLibrary("test");
    }
    @Test
    public void testAddBook(){
        setup();

        assertEquals(0, m1.getBog().size());

        m1.addBog(b1);
        m1.addBog(b2);

        assertEquals(2, m1.getBog().size());
        assertEquals(0, m1.getBog().indexOf(b1));
        assertEquals(1, m1.getBog().indexOf(b2));

        m1.removeBog(b1);
        assertEquals(1, m1.getBog().size());
        assertEquals(0, m1.getBog().indexOf(b2));

        m1.removeBog(b2);
        assertEquals(0, m1.getBog().size());

    }
    private void additems() {
        m1.addBog(b1);
        m1.addBog(b2);
        m1.addPerson(p1);
        m1.addPerson(p2);
    }

    @Test
    public void testCheckout(){
        setup();
        additems();

        assertTrue(m1.checkOut(b1,p1),
                "Book did not check out correctly");

        assertEquals("Fred", b1.getPerson().getName());

        assertFalse(m1.checkOut(b1, p2), "Book was already checked out");

        assertTrue(m1.checkIn(b1), "Book check in failed");

        assertFalse(m1.checkIn(b1), "book was already checked in");

        assertFalse(m1.checkIn(b2), "book was never checked out");

        setup();
        p1.setMax_books(1);
        additems();

        assertTrue(m1.checkOut(b2,p1), "First book did not check out");
        assertFalse(m1.checkOut(b1,p1), "second book should not have checked out");




    }



    @Test
    public void testGetBookForPerson() {
        setup();
        additems();
        assertEquals(0, m1.getBooksforperson(p1).size());

        m1.checkOut(b1,p1);
        ArrayList<Bog> testBooks = m1.getBooksforperson(p1);
        assertEquals(1, testBooks.size());
        assertEquals(0, testBooks.indexOf(b1));

        m1.checkOut(b2,p1);
        testBooks = m1.getBooksforperson(p1);
        assertEquals(2, testBooks.size());
        assertEquals(1, testBooks.indexOf(b2));


    }
}