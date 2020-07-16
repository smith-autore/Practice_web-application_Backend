package com.example.demo.service;

import com.example.demo.model.Buyer;

import java.util.List;

public interface BuyerService {

    /**
     * Создание нового клиента
     * @param buyer - покупатель для создания
     */

    void create(Buyer buyer);

    /**
     * Возвращение списка всех имеющихся покупателей
     * @return список покупателей
     */
    List<Buyer> readAll();

    /**
     * Возвращение покупателя по его ID
     * @param id_buyer - ID покупателя
     * @return - объект покупателя с заданным ID
     */
    Buyer read(int id_buyer);

    /**
     * Обновление покупателя с заданным ID,
     * в соответствии с переданным покупателем
     * @param buyer - покупатель в соответствии с которым нужно обновить данные
     * @param - true если данные были обновлены, иначе false
     */

    boolean update(Buyer buyer, int id_buyer);

    /**
     * Удаление покупателя с заданным ID
     * @param id_buyer - id покупателя, которого нужно удалить
     * @return - true если покупатель был удален, иначе false
     */

    boolean delete(int id_buyer);
}
