import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ContactListTest {
    @Test
    void addingTaskItemsIncreasesSize() {
        ContactList test = new ContactList();
        test.addContact("test","testLastName","111-222-3333", "a@b.c");
        assertEquals(1,test.size());
    }

    @Test
    void editingItemsFailsWithAllBlankValues(){
        ContactList test = new ContactList();
        test.addContact("test","testLastName","111-222-3333", "a@b.c");
        test.editContact(0,"","","", "");
        assertEquals("test", test.get(0).getFirstName());
        assertEquals("testLastName",test.get(0).getLastname());
        assertEquals("111-222-3333",test.get(0).getPhoneNumber());
        assertEquals("a@b.c",test.get(0).getEmail());
        assertEquals(1,test.size());
    }

    @Test
    void editingItemsFailsWithInvalidIndex(){
        ContactList test = new ContactList();
        test.addContact("test","testLastName","111-222-3333", "a@b.c");
        boolean t = test.editContact(2,"fail","failTest","111-222-3333", "a@b.c");
        assertFalse(t);
    }

    @Test
    void editingSucceedsWithBlankFirstName(){
        ContactList test = new ContactList();
        test.addContact("Test","testLastName","111-222-3333", "a@b.c");
        test.editContact(0,"","no","111-222-3333", "a@b.d");
        assertEquals("", test.get(0).getFirstName());
        assertEquals("no",test.get(0).getLastname());
        assertEquals("111-222-3333",test.get(0).getPhoneNumber());
        assertEquals("a@b.d",test.get(0).getEmail());
    }

    @Test
    void editingSucceedsWithBlankLastName(){
        ContactList test = new ContactList();
        test.addContact("test","testLastName","111-222-3333", "a@b.c");
        test.editContact(0,"Juan","","444-555-6666", "a@b.d");
        assertEquals("Juan", test.get(0).getFirstName());
        assertEquals("",test.get(0).getLastname());
        assertEquals("444-555-6666",test.get(0).getPhoneNumber());
        assertEquals("a@b.d",test.get(0).getEmail());
    }

    @Test
    void editingSucceedsWithBlankPhone(){
        ContactList test = new ContactList();
        test.addContact("test","testLastName","111-222-3333", "a@b.c");
        test.editContact(0,"Juan","Salas","", "a@b.d");
        assertEquals("Juan", test.get(0).getFirstName());
        assertEquals("Salas",test.get(0).getLastname());
        assertEquals("",test.get(0).getPhoneNumber());
        assertEquals("a@b.d",test.get(0).getEmail());
    }

    @Test
    void editingSucceedsWithNonBlankValues(){
        ContactList test = new ContactList();
        test.addContact("test","testLastName","111-222-3333", "a@b.c");
        test.editContact(0,"Juan","Salas","444-555-6666", "a@b.d");
        assertEquals("Juan", test.get(0).getFirstName());
        assertEquals("Salas",test.get(0).getLastname());
        assertEquals("444-555-6666",test.get(0).getPhoneNumber());
        assertEquals("a@b.d",test.get(0).getEmail());
    }

    @Test
    void newListIsEmpty() {
        ContactList test = new ContactList();
        assertEquals(0,test.size());
    }

    @Test
    void removingItemsDecreasesSize(){
        ContactList test = new ContactList();
        test.addContact("Juan","Salas","111-222-3333", "a@b.c");
        assertEquals(1,test.size());
        test.removeContact(0);
        assertEquals(0,test.size());
    }

    @Test
    void removingItemsFailsWithInvalidIndex() {
        ContactList test = new ContactList();
        test.addContact("Juan","Salas","111-222-3333", "a@b.c");
        assertFalse(test.removeContact(3));
        assertEquals(1,test.size());
    }

    @Test
    void savedContactListCanBeLoaded(){
    }

}
