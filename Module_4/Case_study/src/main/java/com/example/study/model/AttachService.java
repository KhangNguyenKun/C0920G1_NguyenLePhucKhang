package com.example.study.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AttachService {
    @Id
    private String attachId;
    private String attachName;
    private String attachCost;
    private String attachUnit;
    private String attachStatus;

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
