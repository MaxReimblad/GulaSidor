public class ContactInfo {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final String city;
    private final int zipCode;
    private final String streetName;
    private final int streetNumber;
    private final String phoneNumber;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public int getZipCode() {
        return zipCode;
    }
    public String getStreetName() {
        return streetName;
    }
    public int getStreetNumber() {
        return streetNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public ContactInfo(String firstName, String lastName, int age,
                       String phoneNumber, String streetName, int streetNumber, int zipCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.phoneNumber = phoneNumber;
        this.address = ", Address: " + streetName + " "
                + streetNumber + ", Apartment number: "
                + ", ZipCode: " + zipCode + ", City: " + city;
    }
}
