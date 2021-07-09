package com.cnds.demo1.service.impl;

import com.cnds.demo1.bean.mg.Goods;

import com.cnds.demo1.bean.mg.GoodsExample;
import com.cnds.demo1.bean.repository.mg.GoodsMapper;
import com.cnds.demo1.service.ex.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll() {
//        String SQL="select * from goods where 1=1 ";
        GoodsExample example = new GoodsExample();
        return goodsMapper.selectByExample(example);
//        return null;
    }

    @Override
    public void save(Goods goods) {

        goodsMapper.insertSelective(goods);
    }

    @Override
    public void update(Goods goods) {
        goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public void delete(Integer id) {
//        GoodsExample example=new GoodsExample();
//        example.createCriteria().andPidEqualTo(id);
//        goodsMapper.deleteByExample(example);
        goodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Goods view(Integer id){
        return goodsMapper.selectByPrimaryKey(id);
    }



}
