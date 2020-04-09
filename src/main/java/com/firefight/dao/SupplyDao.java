package com.firefight.dao;

import com.firefight.bean.Supply;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyDao {
    /*

     */
    @Insert("insert into supply(supply_name,supply_total,stock,state) values(#{supply_name},#{supply_total},#{stock},#{state},)")
    int addSupply(Supply supply);


}
