package com.likang.test;

import com.likang.IDao.IUserDao;
import com.likang.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * 测试类
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("likang.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession
        SqlSession session = factory.openSession();
        //4.使用Sqlsession创建Dao的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
       /* List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }*/
        MybatisTest.addUser(userDao,session );
        //6.释放资源
        session.close();
        in.close();
    }

    public static void addUser(IUserDao userDao,SqlSession sqlSession){
//        User user = new User(3,"帅哥5",new Date(),"男5","天下5");
//        userDao.saveUser(user);
//        userDao.updateUser(user);
//        userDao.deleteUser(3);
//        User user1 =  userDao.findUserById(1);
//        System.out.println(user1);
//        sqlSession.commit();
         List<User> users  =   userDao.findByName("李");
         for (User user :users){
             System.out.println(user);
         }
//        System.out.println(userDao.findNum());
        System.out.println("我成功了");
    }
}
