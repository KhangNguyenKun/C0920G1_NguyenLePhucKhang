package com.example.customer.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class Customer implements Validator {
    @Id
    private String customerId;

    @NotEmpty
    private String customerName;
    private String customerBirthday;
    private String customerGender;
    @NotEmpty
    private String customerIdCard;
    private String customerPhone;
    @Email (message = "your email is wrong format")
    private String customerEmail;

    private String customerAddress;

    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    @JsonBackReference
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Contract> list;
    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;
        if(!customer.customerId.matches("^(KH-)\\d{4}$")){
            errors.rejectValue("customerId", "customer.id.format");
        }
        if(!customer.customerPhone.matches("(090|091|\\(84\\)\\+90|\\(84\\)\\+91)\\d{7}")){
            errors.rejectValue("customerPhone", "customer.phone.format");
        }
        if(!customer.customerIdCard.matches("^\\d{9}|\\d{12}$")){
            errors.rejectValue("customerIdCard", "customer.IdCard.format");
        }
    }
}
