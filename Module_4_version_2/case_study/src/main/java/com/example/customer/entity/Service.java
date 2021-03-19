package com.example.customer.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;


@Entity
@Table(name = "service")
public class Service  {
    @Id
//    @NotEmpty
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Pattern(regexp = "^(DV-)\\d{4}$", message = "wrong type of id")
    private int serviceId;
    @Pattern(regexp = "^(DV-)\\d{4}$", message = "wrong type of id")
    private String serviceCode;
    private String serviceName;
    private String serviceArea;
    private String serviceCost;

    @Min(value = 0, message = "You have to choose the amount")
    private String serviceMaxPeople;

    private String standardRoom;
    private String descriptionOtherConvenience;

   @Min(value = 0, message = "The pool must be above 0")
    private String poolArea;

    @Min(value = 0, message = "The floor must be above 0")
    private String numberOfFloors;
    private String freeService;

    @OneToMany(mappedBy = "service")
    @JsonManagedReference
    private List<Contract> contractList;

    @ManyToOne
    @JoinColumn(name = "service_type_id", referencedColumnName = "service_type_id")
    @JsonBackReference
    private ServiceType serviceType;


    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "rent_type_id")
    @JsonBackReference
    private RenType renType;
    public Service() {
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RenType getRenType() {
        return renType;
    }


    public void setRenType(RenType renType) {
        this.renType = renType;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(String serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(String serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

//    @Override
//    public boolean supports(Class<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        Service service = (Service) target;
//        if(!service.serviceId.matches("^(DV-)\\\\d{4}$")){
//            errors.reject("serviceId", "service.id.format");
//        }
//    }
}
