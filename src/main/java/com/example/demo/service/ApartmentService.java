package com.example.demo.service;

import com.example.demo.model.Apartment;

import java.util.List;

public interface ApartmentService {

    /**
     * Создание новой квартиры
     * @param apartment - квартира для создания
     */

    void create(Apartment apartment);

    /**
     * Возвращение списка всех имеющихся квартир
     * @return список квартир
     */
    List<Apartment> readAll();

    /**
     * Возвращение квартиры по его ID
     * @param idApartment - ID квартиры
     * @return - объект квартиры с заданным ID
     */
    Apartment read(int idApartment);

    /**
     * Обновление квартиры с заданным ID,
     * в соответствии с переданной квартирой
     * @param apartment - квартира в соответствии с которой нужно обновить данные
     * @param - true если данные были обновлены, иначе false
     */

    boolean update(Apartment apartment, int idApartment);

    /**
     * Удаление квартиры с заданным ID
     * @param idApartment - id квартиры, которой нужно удалить
     * @return - true если квартира была удалена, иначе false
     */

    boolean delete(int idApartment);
}