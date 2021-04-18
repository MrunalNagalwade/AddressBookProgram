package addressbook;

public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    long mobile_No;
    int zip;

    public Contact(String firstname, String firstName, String lastName, String address, String state, String email, int zip, long mobileNo)
    {
        this.firstName = firstName;
        this.lastName = this.lastName;
        this.address = this.address;
        this.city = city;
        this.state = this.state;
        this.email = this.email;
        this.mobile_No = mobile_No;
        this.zip = this.zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile_No() {
        return mobile_No;
    }

    public void setMobile_No(long mobile_No) {
        this.mobile_No = mobile_No;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", Address="+address+", city=" + city
                + ", state=" + state + ", pincode=" + zip + ", MobileNo=" + mobile_No + "]";
    }
}
