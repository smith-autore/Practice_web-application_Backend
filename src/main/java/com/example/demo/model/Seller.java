package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "seller")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Seller {
    @Id
    @Column(name = "id_seller")
    @SequenceGenerator(name = "sellerIdSeq", sequenceName = "seller_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sellerIdSeq")
    private Integer idSeller;

    @Column(name = "login_seller")
    private String loginSeller;

    @Column(name = "password_seller")
    private String passwordSeller;

    @Column(name = "number_passport_seller")
    private Integer numberPassportSeller;

    @Column(name = "full_name_seller")
    private String fullNameSeller;

    @Column(name = "telephone_seller")
    private String telephoneSeller;

    public Integer getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Integer idSeller) {
        this.idSeller = idSeller;
    }

    public String getLoginSeller() {
        return loginSeller;
    }

    public void setLoginSeller(String loginSeller) {
        this.loginSeller = loginSeller;
    }

    public String getPasswordSeller() {
        return passwordSeller;
    }

    public void setPasswordSeller(String passwordSeller) {
        this.passwordSeller = passwordSeller;
    }

    public Integer getNumberPassportSeller() {
        return numberPassportSeller;
    }

    public void setNumberPassportSeller(Integer numberPassportSeller) {
        this.numberPassportSeller = numberPassportSeller;
    }

    public String getFullNameSeller() {
        return fullNameSeller;
    }

    public void setFullNameSeller(String fullNameSeller) {
        this.fullNameSeller = fullNameSeller;
    }

    public String getTelephoneSeller() {
        return telephoneSeller;
    }

    public void setTelephoneSeller(String telephoneSeller) {
        this.telephoneSeller = telephoneSeller;
    }
}
