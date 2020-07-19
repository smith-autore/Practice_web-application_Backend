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
    private Integer idBuyer;

    @Column(name = "number_passport_buyer")
    private Integer numberPassportBuyer;

    @Column(name = "full_name_buyer")
    private String fullNameBuyer;

    @Column(name = "telephone_buyer")
    private String telephoneBuyer;

    @Column(name = "place_job")
    private String placeJob;

    @Column(name = "position")
    private String position;

    public Integer getIdBuyer() {
        return idBuyer;
    }

    public void setIdBuyer(Integer idBuyer) {
        this.idBuyer = idBuyer;
    }

    public Integer getNumberPassportBuyer() {
        return numberPassportBuyer;
    }

    public void setNumberPassportBuyer(Integer numberPassportBuyer) {
        this.numberPassportBuyer = numberPassportBuyer;
    }

    public String getFullNameBuyer() {
        return fullNameBuyer;
    }

    public void setFullNameBuyer(String fullNameBuyer) {
        this.fullNameBuyer = fullNameBuyer;
    }

    public String getTelephoneBuyer() {
        return telephoneBuyer;
    }

    public void setTelephoneBuyer(String telephoneBuyer) {
        this.telephoneBuyer = telephoneBuyer;
    }

    public String getPlaceJob() {
        return placeJob;
    }

    public void setPlaceJob(String placeJob) {
        this.placeJob = placeJob;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
