package com.igeek.ebuy.service.impl;

import com.igeek.ebuy.manager.mapper.TbItemMapper;
import com.igeek.ebuy.pojo.TbItem;
import com.igeek.ebuy.pojo.TbItemExample;
import com.igeek.ebuy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    
    
    @Autowired
    private TbItemMapper itemMapper;
    
    @Override
    public TbItem queryById(long itemId) {


//        TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
//
//        return null;

        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> itemList = itemMapper.selectByExample(example);
        if(itemList != null && itemList.size() == 1){
            return itemList.get(0);
        }


        return null;

    }


}
