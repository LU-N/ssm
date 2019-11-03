package com.itheima.ssm.service;

import com.itheima.ssm.pojo.Item;

/**
 * @Author JinLu
 * @Date2019/11/3 15:25
 **/
public interface ItemService {
    /**
     * findBuId
     * @param id
     * @return
     */
    public Item findById(int id);
}
