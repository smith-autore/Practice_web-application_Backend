package com.example.demo.service;

import com.example.demo.model.Buyer;

import java.util.List;

public interface BuyerService {

    /**
     * Создание нового покупателя
     * @param buyer - покупатель для создания
     */

    Buyer create(Buyer buyer);

    /**
     * Возвращение списка всех имеющихся покупателей
     * @return список покупателей
     */
    List<Buyer> readAll();

    /**
     * Возвращение покупателя по его ID
     * @param idBuyer - ID покупателя
     * @return - объект покупателя с заданным ID
     */
    Buyer read(int idBuyer);

    /**
     * Обновление покупателя с заданным ID,
     * в соответствии с переданным покупателем
     * @param buyer - покупатель в соответствии с которым нужно обновить данные
     * @param - true если данные были обновлены, иначе false
     */

    boolean update(Buyer buyer, int idBuyer);

    /**
     * Удаление покупателя с заданным ID
     * @param idBuyer - id покупателя, которого нужно удалить
     * @return - true если покупатель был удален, иначе false
     */

    boolean delete(int idBuyer);
}
