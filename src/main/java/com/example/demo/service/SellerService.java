package com.example.demo.service;

import com.example.demo.model.Seller;

import java.util.List;

public interface SellerService {

    /**
     * Создание нового продавца
     * @param seller - продавец для создания
     */

    Seller create(Seller seller);

    /**
     * Возвращение списка всех имеющихся продавцов
     * @return список продавцов
     */
    List<Seller> readAll();

    /**
     * Возвращение продавца по его ID
     * @param idSeller - ID продавца
     * @return - объект продавца с заданным ID
     */
    Seller read(int idSeller);

    /**
     * Обновление продавца с заданным ID,
     * в соответствии с переданным продавцом
     * @param seller - продавец в соответствии с которым нужно обновить данные
     * @param - true если данные были обновлены, иначе false
     */

    boolean update(Seller seller, int idSeller);

    /**
     * Удаление продавца с заданным ID
     * @param idSeller - id продавца, которого нужно удалить
     * @return - true если покупатель был удален, иначе false
     */

    boolean delete(int idSeller);
}
