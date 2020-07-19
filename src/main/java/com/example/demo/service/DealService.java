package com.example.demo.service;

import com.example.demo.model.Deal;

import java.util.List;

public interface DealService {

    /**
     * Создание новой сделки
     * @param deal - сделка для создания
     */

    void create(Deal deal);

    /**
     * Возвращение списка всех имеющихся сделок
     * @return список сделок
     */
    List<Deal> readAll();

    /**
     * Возвращение сделки по её ID
     * @param idDeal - ID сделки
     * @return - объект сделки с заданным ID
     */
    Deal read(int idDeal);

    /**
     * Обновление сделки с заданным ID,
     * в соответствии с переданной сделкой
     * @param deal -сделка в соответствии с которой нужно обновить данные
     * @param - true если данные были обновлены, иначе false
     */

    boolean update(Deal deal, int idDeal);

    /**
     * Удаление сделки с заданным ID
     * @param idDeal - id сделки, которую нужно удалить
     * @return - true если сделка была удалена, иначе false
     */

    boolean delete(int idDeal);
}
