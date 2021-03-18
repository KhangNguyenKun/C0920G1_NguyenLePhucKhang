package com.example.customer.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Contract {
    @Id
    private String contractId;
    private String contractStartDate;
    private String contractEndDate;
    private String contractDeposit;
    private String contractTotalMoney;



    @ManyToOne
    @JoinColumn(name = "customer_id")
//    @NotFound(action = NotFoundAction.IGNORE)
    private Customer customer;

    @OneToMany(mappedBy="contract", cascade = CascadeType.ALL)
    private Set<ContractDetail> contractDetailSet;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service serviceId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Employee employee;

    public Contract() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<ContractDetail> getContractDetailSet() {
        return contractDetailSet;
    }

    public void setContractDetailSet(Set<ContractDetail> contractDetailSet) {
        this.contractDetailSet = contractDetailSet;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(String contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public String getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(String contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }


    public Service getServiceId() {
        return serviceId;
    }

    public void setServiceId(Service serviceId) {
        this.serviceId = serviceId;
    }
}
