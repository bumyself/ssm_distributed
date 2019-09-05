package com.igeek.ebuy.service;

import com.igeek.ebuy.pojo.TbItem;

public interface ItemService {

    /**
     * 通过id 返回商品信息
     */
    public TbItem queryById(long itemId);
}
