package com.example.customer.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class RenType {
    @Id
    @Column(name = "rent_type_id")
    private int rentTypeId;
    private String rentTypeName;
    private String rentTypeCost;

    @OneToMany(mappedBy = "renType")
    @JsonManagedReference
    private List<Service> serviceList;

    public RenType() {
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public String getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(String rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }
}
