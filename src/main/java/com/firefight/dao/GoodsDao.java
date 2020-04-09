package com.firefight.dao;

import com.firefight.bean.Blog;
import com.firefight.bean.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    /*
    发布商品
     */
    @Insert("insert into goods(g_id,goods_name,upper_limit,stock,price,state) values(#{g_id},#{goods_name},#{upper_limit},#{stock},#{price},#{state})")
    int addGoods(Goods goods);

    /*
    查找所有商品
     */
    @Select("select * from goods")
    List<Goods> allGoods();

    /*
    根据状态查找所有商品
    */
    @Select("Select * from goods where state=#{state}")
    List<Goods> allGoodsByState(String state);

    /*
    删除商品
     */
    @Delete("Delete from goods where g_id=#{g_id}")
    int deleteGoods(int g_id);

    /*
    修改商品价格
     */
    @Update("update goods set price=#{price} where g_id=#{g_id}")
     int updatePrice(int g_id,float price);
    /*
    对商品的状态进行修改
     */
    @Update("update goods set state=#{state} where g_id=#{g_id}")
    int updateState(int g_id,String state);
    /*
    修改购买上限
     */
    @Update("update goods set upper_limit=#{upper_limit} where g_id=#{g_id}")
    int updateLimit(int g_id,int upper_limit);
    /*
    修改商品名称
     */
    @Update("update goods set goods_name=#{goods_name} where g_id=#{g_id}")
    int updateName(int g_id,String goods_name);
}
