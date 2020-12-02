public class ContactItem {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String eMail;

    public static ContactItem newContact(String first, String last, String number, String email){
        ContactItem contact = new ContactItem();
        int flag = 0;
        if(first.length() > 0 || last.length() > 0 || number.length() > 0 || email.length() > 0){
            flag = 1;
        }
        if(!contact.validNumber(number)){
            System.out.println("INVALID NUMBER CONTACT WAS NOT CREATED");
            return null;
        }
        if(!contact.validEmail(email)){
            System.out.println("INVALID EMAIL WAS NOT FORMATTED CORRECTLY CONTACT WAS NOT CREATED");
            return null;
        }
        if(flag != 1){
            System.out.println("INVALID THE CONTACT WAS NOT MADE");
            return null;
        }
        contact.firstName = first;
        contact.lastName = last;
        contact.phoneNumber = number;
        contact.eMail = email;
        return contact;
    }

    private boolean validNumber(String number) {
        for(int i = 0; i < number.length();i++){
            if(i < 3 || (i >3 && i <7) || i > 7){
                if(!Character.isDigit(number.charAt(i))){
                    return false;
                }
            }
            if(i == 3 || i == 7) {
                if (number.charAt(i) != '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean validEmail(String email) {
        if(email.isBlank()) return true;
        if(!(email.contains("@")) || !(email.contains("."))) return false;
        if(email.indexOf('@') > email.indexOf('.')) return false;
        return email.indexOf('@') > 0 && email.indexOf('.') < email.length() - 1 && (email.indexOf('.') - email.indexOf('@') > 1);
    }

    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + "\nPhone: " + this.phoneNumber + "\nEmail: " + this.eMail;
    }

    public String getEmail() {
        return eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) throws IllegalArgumentException {
        if(firstName.length() < 1)
            throw new IllegalArgumentException("INVALID FIRST NAME WAS TOO SHORT");
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public void setEmail(String email) {
        this.eMail = email;
    }

    public void editContact(String first , String last, String number, String email ){
        int flag = 0;
        if(!this.validNumber(number)){
            System.out.println("INVALID NUMBER CONTACT WAS NOT CREATED");
            return;
        }
        if(!this.validEmail(email)){
            System.out.println("INVALID EMAIL FORMATTING CONTACT WAS NOT CREATED");
            return;
        }
        if(first.length() > 0 || last.length() > 0 || number.length() > 0 || email.length() > 0){
            flag = 1;
        }
        if(flag != 1){
            System.out.println("INVALID CONTACT WAS NOT CREATED.");
            return;
        }
        this.firstName = first;
        this.lastName = last;
        this.phoneNumber = number;
        this.eMail = email;
    }
}
