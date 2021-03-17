package com.example.customer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ContractDetail {
    @Id
    private String contractDetailId;

    private String quantity;

    @ManyToOne
    @JoinColumn(name = "contract_id", nullable = false)
    private Contract contract;
    public ContractDetail() {
    }

    @ManyToOne
    @JoinColumn(name = "attach_service_id", nullable = false)
    private AttachService attachService;

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public String getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(String contractDetailId) {
        this.contractDetailId = contractDetailId;
    }


    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
