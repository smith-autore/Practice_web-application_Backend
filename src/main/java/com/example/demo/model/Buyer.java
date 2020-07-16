package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "buyer")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Buyer {
    @Id
    @Column(name = "id_buyer")
    @SequenceGenerator(name = "buyerIdSeq", sequenceName = "buyer_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "buyerIdSeq")
    private Integer id_buyer;

    @Column(name = "number_passport_buyer")
    private Integer number_passport_buyer;

    @Column(name = "full_name_buyer")
    private String full_name_buyer;

    @Column(name = "telephone_buyer")
    private String telephone_buyer;

    @Column(name = "place_job")
    private String place_job;

    @Column(name = "position")
    private String position;

    public Integer getId_buyer() {
        return id_buyer;
    }

    public void setId_buyer(Integer id_buyer) {
        this.id_buyer = id_buyer;
    }

    public Integer getNumber_passport_buyer() {
        return number_passport_buyer;
    }

    public void setNumber_passport_buyer(Integer number_passport_buyer) {
        this.number_passport_buyer = number_passport_buyer;
    }

    public String getFull_name_buyer() {
        return full_name_buyer;
    }

    public void setFull_name_buyer(String full_name_buyer) {
        this.full_name_buyer = full_name_buyer;
    }

    public String getTelephone_buyer() {
        return telephone_buyer;
    }

    public void setTelephone_buyer(String telephone_buyer) {
        this.telephone_buyer = telephone_buyer;
    }

    public String getPlace_job() {
        return place_job;
    }

    public void setPlace_job(String place_job) {
        this.place_job = place_job;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
