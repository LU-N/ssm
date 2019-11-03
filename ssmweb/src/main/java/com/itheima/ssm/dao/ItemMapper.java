package com.itheima.ssm.dao;

import com.itheima.ssm.pojo.Item;

/**
 * @Author JinLu
 * @Date2019/11/3 14:57
 **/
public interface ItemMapper {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Item findById(int id);
}
