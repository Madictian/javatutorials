package Totalbeginner;

import org.junit.jupiter.api.Test;

import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {



    @Test
    void testToString() {
        Person p1 = new Person();
        p1.setName("fred flintstone");
        p1.setMax_books(7);
        String testString = "fred flintstone(7books)";
        assertEquals(p1.testToString(), testString );
    }
    @Test
    void testBook() {
        Bog b1 = new Bog("Great expectations");
        assertEquals("Great expectations", b1.title);
        assertEquals("Unknown author", b1.author);
    }

    @Test
    void main() {
    }
}
