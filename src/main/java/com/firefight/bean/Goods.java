package com.firefight.bean;

/*
商品
 */
public class Goods {
   //id
    private int g_id;
    //名称
    private String goods_name;
    //购买上限
    private int upper_limit;
    //库存
    private String stock;
    //价钱
    private float price;
    //商品状态   在售，售罄，补货，下架
    private String state;
}
