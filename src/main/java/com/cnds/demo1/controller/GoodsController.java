package com.cnds.demo1.controller;

import com.cnds.demo1.bean.mg.Goods;
import com.cnds.demo1.service.ex.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(tags = "Ais相关接口")
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/goods")
@CrossOrigin
@Slf4j
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    public void save(){
        Goods goods=new Goods();
        goodsService.save(goods);
    }
    @ApiOperation("查询所有商品")
    @ApiImplicitParams({
    })
    @GetMapping("/findAll")
    public List<Goods> findAll(){
        return goodsService.findAll();
    }

}
