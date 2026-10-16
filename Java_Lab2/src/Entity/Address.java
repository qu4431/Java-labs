package Entity;

public class Address {
    private String street;
    private String houseNumber;
    private String apartmentNumber;

    public Address(String street, String houseNumber, String apartmentNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getStreet() {
        return street;
    }
    public String getHouseNumber() {
        return houseNumber;
    }
    public String getApartmentNumber() {
        return apartmentNumber;
    }
}
