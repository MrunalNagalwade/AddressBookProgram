package addressbook;
public class AddressBookList {
    public String addressBookName;

    public AddressBookList(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    @Override
    public String toString() {
        return "AddressBookList{" +
                "addressBookName='" + addressBookName + '\'' +
                '}';
    }
}
