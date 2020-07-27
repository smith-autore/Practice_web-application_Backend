package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "deal")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Deal {
    @Id
    @Column(name = "id_deal")
    @SequenceGenerator(name = "dealIdSeq", sequenceName = "deal_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dealIdSeq")
    private Integer idDeal;

    @Column(name = "id_buyer")
    private Integer idBuyer;

    @Column(name = "id_seller")
    private Integer idSeller;

    @Column(name = "id_apartment")
    private Integer idApartment;

    @Column(name = "deal_date")
    private LocalDate dealDate;

    @Column(name = "sale_value")
    private Integer saleValue;

    public Integer getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(Integer idDeal) {
        this.idDeal = idDeal;
    }

    public Integer getIdBuyer() { return idBuyer; }

    public void  setIdBuyer(Integer idBuyer) { this.idBuyer = idBuyer; }

    public Integer getIdSeller() { return idSeller; }

    public void setIdSeller(Integer idSeller) { this.idSeller = idSeller; }

    public Integer getIdApartment() { return  idApartment; }

    public void setIdApartment(Integer idApartment) { this.idApartment = idApartment; }

    public LocalDate getDealDate() { return  dealDate; }

    public void setDealDate(LocalDate dealDate) { this.dealDate = dealDate; }

    public Integer getSaleValue() { return saleValue; }

    public void setSaleValue(Integer saleValue) { this.saleValue = saleValue; }
}
