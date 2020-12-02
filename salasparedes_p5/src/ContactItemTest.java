import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ContactItemTest {
    @Test
    public void creationFailsWithAllBlankValues(){
        ContactItem test = ContactItem.newContact("","","","");
        assertNull(test);
    }
    @Test
    public void creationSucceedsWithBlankEmail(){
        ContactItem test = ContactItem.newContact("test","testLastName","123-123-1234","");
        assertNotNull(test);
        assertEquals("test", test.getFirstName());
        assertEquals("testLastName",test.getLastname());
        assertEquals("123-123-1234",test.getPhoneNumber());
        assertEquals("",test.getEmail());
    }
    @Test
    public void creationSucceedsWithBlankFirstName(){
        ContactItem test = ContactItem.newContact("","testLastName","123-123-1234","a@b.c");
        assertNotNull(test);
        assertEquals("", test.getFirstName());
        assertEquals("testLastName",test.getLastname());
        assertEquals("123-123-1234",test.getPhoneNumber());
        assertEquals("a@b.c",test.getEmail());
    }
    @Test
    public void creationSucceedsWithBlankLastName(){
        ContactItem test = ContactItem.newContact("test","","123-123-1234","d@e.f");
        assertNotNull(test);
        assertEquals("test", test.getFirstName());
        assertEquals("",test.getLastname());
        assertEquals("123-123-1234",test.getPhoneNumber());
        assertEquals("d@e.f",test.getEmail());
    }
    @Test
    void creationSucceedsWithBlankPhone(){
        ContactItem test = ContactItem.newContact("test","testLastName","","g@h.i");
        assertNotNull(test);
        assertEquals("test", test.getFirstName());
        assertEquals("testLastName",test.getLastname());
        assertEquals("",test.getPhoneNumber());
        assertEquals("g@h.i",test.getEmail());
    }

    @Test
    void creationSucceedsWithNonBlankValues(){
        ContactItem test = ContactItem.newContact("test","testLastName","123-123-1234","j@k.l");
        assertNotNull(test);
        assertEquals("test", test.getFirstName());
        assertEquals("testLastName",test.getLastname());
        assertEquals("123-123-1234",test.getPhoneNumber());
        assertEquals("j@k.l",test.getEmail());
    }

    @Test
    void editingFailsWithAllBlankValues(){
        ContactItem test = ContactItem.newContact("test","testLastName","123-123-1234","m@n.o");
        test.editContact("","","","");
        assertNotNull(test);
        assertEquals("test", test.getFirstName());
        assertEquals("testLastName",test.getLastname());
        assertEquals("123-123-1234",test.getPhoneNumber());
        assertEquals("m@n.o",test.getEmail());
    }

    @Test
    void editingSucceedsWithBlankEmail(){
        ContactItem test = ContactItem.newContact("test","testLastName","123-123-1234","p@q.r");
        test.editContact("Juan","Salas","321-321-4321","");
        assertNotNull(test);
        assertEquals("Juan", test.getFirstName());
        assertEquals("Salas",test.getLastname());
        assertEquals("321-321-4321",test.getPhoneNumber());
        assertEquals("",test.getEmail());
    }

    @Test
    void editingSucceedsWithBlankFirstName(){
        ContactItem test = ContactItem.newContact("test","testLastName","123-123-1234","s@t.u");
        test.editContact("","Salas","321-321-4321","a@b.c");
        assertNotNull(test);
        assertEquals("", test.getFirstName());
        assertEquals("Salas",test.getLastname());
        assertEquals("321-321-4321",test.getPhoneNumber());
        assertEquals("a@b.c",test.getEmail());
    }

    @Test
    void editingSucceedsWithBlankLastName(){
        ContactItem test = ContactItem.newContact("test","testLastName","123-123-1234","v@w.x");
        test.editContact("Juan","","321-321-4321","a@b.c");
        assertNotNull(test);
        assertEquals("Juan", test.getFirstName());
        assertEquals("",test.getLastname());
        assertEquals("321-321-4321",test.getPhoneNumber());
        assertEquals("a@b.c",test.getEmail());
    }

    @Test
    void editingSucceedsWithBlankPhone(){
        ContactItem test = ContactItem.newContact("test","testLastName", "123-123-1234","y@z.a");
        test.editContact("Juan","Salas","","a@b.c");
        assertNotNull(test);
        assertEquals("Juan", test.getFirstName());
        assertEquals("Salas",test.getLastname());
        assertEquals("",test.getPhoneNumber());
        assertEquals("a@b.c",test.getEmail());
    }

    @Test
    void editingSucceedsWithNonBlankValues(){
        ContactItem test = ContactItem.newContact("test","testLastName","123-123-1234","b@c.d");
        test.editContact("Juan","Salas","321-321-4321","e@f.g");
        assertNotNull(test);
        assertEquals("Juan", test.getFirstName());
        assertEquals("Salas",test.getLastname());
        assertEquals("321-321-4321",test.getPhoneNumber());
        assertEquals("e@f.g",test.getEmail());
    }

    @Test
    void testToString(){
        ContactItem test = ContactItem.newContact("test","testLastName","123-123-1234","a@b.c");
        String str = test.toString();
        assertEquals("Name: test testLastName\nPhone: 123-123-1234\nEmail: a@b.c",str);
    }

}
