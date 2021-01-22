package com.example.study.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceType {
    @Id
    private String serviceTypeId;
    private String serviceTypeName;

    public ServiceType() {
    }

    public String getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(String serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }
}
