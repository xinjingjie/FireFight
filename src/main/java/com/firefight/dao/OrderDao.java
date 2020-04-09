package com.firefight.dao;

import com.firefight.bean.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {
    @Insert("insert into order(g_id,uid,number,create_time,pay_state,amount,location,telephone) values(#{g_id},#{uid},#{number},#{create_time},#{pay_state},#{amount},#{location},#{telephone}) ")
    int addOrder(Order order);

    @Delete("delete from order where o_id=#{o_id}")
    int deleteOrder(int o_id);

    @Select("select * from order")
    List<Order> allOrder();

    @Select("select * from order where pay_state=#{pay_state}")
    List<Order> findByState(String pay_state);
}
