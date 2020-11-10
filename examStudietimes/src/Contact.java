public class Contact {
    private final String name;
    private final String email;
    private final String phoneNumber;

    public Contact(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}
