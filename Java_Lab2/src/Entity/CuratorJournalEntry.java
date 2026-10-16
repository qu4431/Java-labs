package Entity;

public class CuratorJournalEntry {
    private String lastName;
    private String firstName;
    private String birthDate;
    private String phoneNumber;
    private Address address;

    public CuratorJournalEntry(String lastName, String firstName, String birthDate, String phoneNumber, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String toString() {
        return  "lastName= " + lastName + '\n' +
                "firstName= " + firstName + '\n' +
                "birthDate= " + birthDate + '\n' +
                "phoneNumber= " + phoneNumber + '\n' +
                "address= " + "street: " + address.getStreet() +
                    ", house: " + address.getHouseNumber() +
                    ", apartment: " + address.getApartmentNumber();
    }
}
