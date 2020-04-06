package com.firefight.test;

import com.firefight.bean.User;
import com.firefight.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void run1() throws IOException {
        User user =new User();
        user.setName("朱星宇");
        user.setGender("男");
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        UserDao dao = session.getMapper(UserDao.class);

        // 保存
        dao.addUser(user);

        // 提交事务
        session.commit();

        // 关闭资源
        session.close();
        in.close();
    }

    @Test
    public void run2() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = factory.openSession();

        UserDao dao = session.getMapper(UserDao.class);

        List<User> list = dao.findAllUser();
        for (User user: list ) {
            System.out.println(user);
        }

        session.close();
        in.close();
    }
}
