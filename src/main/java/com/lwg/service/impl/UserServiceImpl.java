package com.lwg.service.impl;

import com.lwg.dao.UserDao;
import com.lwg.domain.User;
import com.lwg.domain.UserView;
import com.lwg.domain.UserViewOrder;
import com.lwg.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao dao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> selectAll() {
        return dao.selectAll();
    }

    @Override
    public User select(Integer id) {
        return dao.select(id);
    }

    @Override
    public int insertUser(User user) {
        return dao.insertUser(user);
    }

    @Override
    public int upDateUser(User user) {
        return dao.upDateUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return dao.deleteUser(id);
    }

    @Override
    public List<User> getUserByName(User user) {
        return dao.getUserByName(user);
    }

    @Override
    public List<User> getUserByName2(User user) {
        return dao.getUserByName2(user);
    }

    @Override
    public List<User> getUserByName3(Map map) {
        return dao.getUserByName3(map);
    }

    @Override
    public List<User> getUserByName4(String uname, String usex) {
        return dao.getUserByName4(uname,usex);
    }

    @Override
    public List<User> getDyName(String username, String sex) {
        return dao.getDyName(username,sex);
    }

    @Override
    public List<User> getDyName2(String username, String sex) {
        return dao.getDyName2(username,sex);
    }

    @Override
    public List<User> getUserByIds(List<Integer> myId) {
        return dao.getUserByIds(myId);
    }

    @Override
    public int insertUsers(List<User> users) {
        return dao.insertUsers(users);
    }

    @Override
    public int upDateUserDy(User user) {
        return dao.upDateUserDy(user);
    }

    @Override
    public int deleteUsers(int[] id) {
        return dao.deleteUsers(id);
    }

    @Override
    public List<UserView> getUserAndCnum() {
        return dao.getUserAndCnum();
    }

    @Override
    public List<User> oneToOne() {
        return dao.oneToOne();
    }

    @Override
    public List<User> oneToOne2() {
        return dao.oneToOne2();
    }

    @Override
    public List<UserViewOrder> oneToDuo(Integer id) {
        return dao.oneToDuo(id);
    }

    @Override
    public List<User> oneToDuo2(Integer id) {
        return dao.oneToDuo2(id);
    }

    /*public static void main(String[] args) throws IOException {
        //User user = dao.oneToDuo2(1);
        String cof="mybatis.xml";
        InputStream is=Resources.getResourceAsStream(cof);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.oneToDuo2(1);
        System.out.println(users);
    }*/
}
