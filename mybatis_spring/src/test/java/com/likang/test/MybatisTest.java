package com.likang.test;

import com.likang.IDao.IAccountDao;
import com.likang.IDao.IUserDao;
import com.likang.model.Account;
import com.likang.model.AcountVo;
import com.likang.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
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
        Logger logger = Logger.getLogger(MybatisTest.class);
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("likang.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession
        SqlSession session = factory.openSession();
        //4.使用Sqlsession创建Dao的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
//       List<Account> accounts =  accountDao.findAll();
//       for (Account account : accounts){
//           System.out.println(account);
//       }
        List<AcountVo> acountVos = accountDao.findAllVo();
        for (AcountVo acountVo : acountVos){
            System.out.println(acountVo);
        }
        //5.使用代理对象执行方法
      /*  List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }*/
//        MybatisTest.addUser(userDao, session);
        //6.释放资源
        session.close();
        in.close();
    }

    public static void addUser(IUserDao userDao, SqlSession sqlSession) {
//        User user = new User(3,"帅哥5",new Date(),"男5","天下5");
//        userDao.saveUser(user);
//        userDao.updateUser(user);
//        userDao.deleteUser(3);
//        User user1 =  userDao.findUserById(1);
//        System.out.println(user1);
//        sqlSession.commit();
//         List<User> users  =   userDao.findByName("李");
//         for (User user :users){
//             System.out.println(user);
//         }
//        System.out.println(userDao.findNum());
//        User user = new User();
//        user.setId(1);
//        user.setUserName("康");
//        List<User> users = userDao.queryList(user);
//        for (User user1 : users){
//            System.out.println(user1);
//        }
          int[] ids = {1,2};
          List<User> users = userDao.selectForeach(ids);
        for (User user : users){
            System.out.println(user);
        }
    }
}
