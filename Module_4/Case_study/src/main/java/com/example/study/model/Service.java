package com.example.study.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ServiceFurama {
    @Id
    @GeneratedValue
    private String service_id;
    private String service_name;
    private String service_area;
    private String service_cost;
    private String service_max_people;
    private String rent_type_id;
    private String service_type_id;
    private String standard_room;
    private String description_other_convenience;
    private String pool_area;
    private String numbers_of_floor;

    public ServiceFurama() {
    }


}
