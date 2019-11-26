package com.dtpineiro.spring.mockito.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Features {

    @Id
    @GeneratedValue
    private Integer id;
    //@JsonProperty("id")
    //private String idStr;
    private String type;
    @OneToOne(cascade = {CascadeType.ALL})
    private Properties properties;
    @OneToOne(cascade = {CascadeType.ALL})
    private Geometry geometry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
