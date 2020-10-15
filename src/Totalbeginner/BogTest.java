package Totalbeginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BogTest {
    @Test
    void testBook() {
        Bog b1 = new Bog("Great expectations");
        assertEquals("Great expectations", b1.title);
        assertEquals("Unknown author", b1.author);
    }

    @Test
    public void testgetperson() {
        Bog b2 = new Bog ("War and peace");
        Person p2 = new Person();
        p2.setName("Elvis");

        b2.setPerson(p2);
/*
        Person testPerson = b2.getPerson();
        String testName = testPerson.getName();
*/
        String testName = b2.getPerson().getName();
        assertEquals("Elvis", testName);

    }


}