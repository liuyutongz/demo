package com.cnds.demo1.service.ex;

import com.cnds.demo1.bean.mg.Goods;
import org.springframework.stereotype.Service;

import java.util.List;


public  interface GoodsService {

    List<Goods>findAll();

    void save(Goods goods);

    void update(Goods goods);

    void delete(Integer id);

    Goods view(Integer id);

}
