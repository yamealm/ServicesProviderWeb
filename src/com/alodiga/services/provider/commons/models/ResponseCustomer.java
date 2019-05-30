package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "customer")
public class ResponseCustomer implements Serializable {

    private static final long serialVersionUID = -427663612976477547L;
    @Element(name = "login", required = false)
    private String login;
    @Element(name = "password", required = false)
    private String password;
    @Element(name = "enterprideId", required = false)
    private String enterprideId;
    @Element(name = "firstName", required = false)
    private String firstName;
    @Element(name = "lastName", required = false)
    private String lastName;
    @Element(name = "email", required = false)
    private String email;
    @Element(name = "phoneNumber", required = false)
    private String phoneNumber;
    @Element(name = "birthDate", required = false)
    private Date birthDate;
    @Element(name = "civilState", required = false)
    private String civilState;
    @Element(name = "gender", required = false)
    private String gender;
    @Element(name = "address", required = false)
    private ResponseAddress address;
    @Element(name = "pin", required = false)
    private String pin;
    @Element(name = "balance", required = false)
    private String balance;
    @ElementList(entry = "pinFree", name = "pinFrees", required = false)
    private List<PinFreeResponse> pinFrees;

    public ResponseCustomer() {
        super();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnterprideId() {
        return enterprideId;
    }

    public void setEnterprideId(String enterprideId) {
        this.enterprideId = enterprideId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCivilState() {
        return civilState;
    }

    public void setCivilState(String civilState) {
        this.civilState = civilState;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public List<PinFreeResponse> getPinFrees() {
        return pinFrees;
    }

    public void setPinFrees(List<PinFreeResponse> pinFrees) {
        this.pinFrees = pinFrees;
    }

    public ResponseAddress getAddress() {
        return address;
    }

    public void setAddress(ResponseAddress address) {
        this.address = address;
    }

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
    
    
}
