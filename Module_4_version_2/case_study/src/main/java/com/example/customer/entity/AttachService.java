package com.example.customer.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class AttachService {
    @Id
    private String attachId;
    private String attachName;
    private String attachCost;
    private String attachUnit;
    private String attachStatus;

    @OneToMany(mappedBy = "attachService", cascade = CascadeType.PERSIST)
    private List<ContractDetail> contractDetailList;

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }

    public AttachService() {
    }

    public String getAttachId() {
        return attachId;
    }

    public void setAttachId(String attachId) {
        this.attachId = attachId;
    }

    public String getAttachName() {
        return attachName;
    }

    public void setAttachName(String attachName) {
        this.attachName = attachName;
    }

    public String getAttachCost() {
        return attachCost;
    }

    public void setAttachCost(String attachCost) {
        this.attachCost = attachCost;
    }

    public String getAttachUnit() {
        return attachUnit;
    }

    public void setAttachUnit(String attachUnit) {
        this.attachUnit = attachUnit;
    }

    public String getAttachStatus() {
        return attachStatus;
    }

    public void setAttachStatus(String attachStatus) {
        this.attachStatus = attachStatus;
    }
}
