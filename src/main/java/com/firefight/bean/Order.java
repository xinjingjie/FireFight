package com.firefight.bean;
/*
订单
 */
public class Order {
    //订单id
    private int o_id;
    //商品id
    private int g_id;
    //用户id
    private int uid;
    //商品数目
    private int number;
    //创建日期
    private String create_time;
    //付款状态 已付款 未付款
    private String pay_state;
    //总价
    private String amount;
    //收货地址
    private String location;
    //电话号
    private String telephone;
}
