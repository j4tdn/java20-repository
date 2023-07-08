package Bai05;

public class Customer {
    private String customerID;
    private String fullName;
    private String phoneNumber;
    private String address;

    public Customer(String customerID, String fullName, String phoneNumber, String address) {
        this.customerID = customerID;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getters and setters

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}