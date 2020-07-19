package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "apartment")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Apartment {
    @Id
    @Column(name = "id_apartment")
    @SequenceGenerator(name = "apartmentIdSeq", sequenceName = "apartment_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "apartmentIdSeq")
    private Integer idApartment;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private Short houseNumber;

    @Column(name = "apartment_number")
    private Short apartmentNumber;

    @Column(name = "type_of_house")
    private String typeOfHouse;

    @Column(name = "floor_apartment")
    private Short floorApartment;

    @Column(name = "total_area")
    private Float totalArea;

    @Column(name = "living_space")
    private Float livingSpace;

    @Column(name = "comfort_factor")
    private Float comfortFactor;

    public Integer getIdApartment() {
        return idApartment;
    }

    public void setIdApartment(Integer idApartment) {
        this.idApartment = idApartment;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Short getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Short houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Short getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(Short apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getTypeOfHouse() {
        return typeOfHouse;
    }

    public void setTypeOfHouse(String typeOfHouse) {
        this.typeOfHouse = typeOfHouse;
    }

    public Short getFloorApartment() {
        return floorApartment;
    }

    public void setFloorApartment(Short floorApartment) {
        this.floorApartment = floorApartment;
    }

    public Float getTotalArea() { return totalArea; }

    public void setTotalArea(Float totalArea) { this.totalArea = totalArea;}

    public Float getLivingSpace() { return livingSpace; }

    public void setLivingSpace(Float livingSpace) { this.livingSpace = livingSpace;}

    public Float getComfortFactor() { return comfortFactor; }

    public void setComfortFactor(Float comfortFactor) {this.comfortFactor = comfortFactor; }
}
