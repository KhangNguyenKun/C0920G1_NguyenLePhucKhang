package com.example.study.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class  CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerTypeId;
    private String customerTypeName;


    @OneToMany(mappedBy = "customerType" , cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Customer> customerList;

    public CustomerType() {
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public List<com.example.study.model.Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<com.example.study.model.Customer> customerList) {
        this.customerList = customerList;
    }
}
