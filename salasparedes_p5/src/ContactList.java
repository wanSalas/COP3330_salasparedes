import java.util.ArrayList;

public class ContactList extends ArrayList<ContactItem> {
    private ArrayList<ContactItem> test;
    public void addContact(String firstName, String lastName, String phoneNumber, String email) {
        ContactItem currentContact = ContactItem.newContact(firstName,lastName,phoneNumber,email);
        if(currentContact == null){
            return;
        }
        this.add(currentContact);
    }
    public void contactListDisplay(){
        int i = 0;
        System.out.println("\nCurrent Tasks\n--------------\n");
        for(ContactItem contact : this){
            System.out.println(i + " ) Name: "+contact.getFirstName()+" "+contact.getLastname()+"\nPhone: "+contact.getPhoneNumber()+"\nEmail: "+contact.getEmail()+"\n" );
            i++;
        }
    }

    public boolean editContact(int choice, String first, String last, String number, String email) {
        if (choice >= this.size()){
            System.out.println("INVALID THAT'S NOT A CONTACT THAT EXIST\n");
            return false;
        }
        this.get(0).editContact(first,last,number,email);
        return true;
    }

    public boolean removeContact(int choice) {
        if (choice >= this.size()){
            System.out.println("INVALID THAT'S NOT A CONTACT THAT EXIST\n");
            return false;
        }
        this.remove(choice);
        return true;
    }

    public ArrayList<ContactItem> GetContactItem() {
        return test;
    }
}
