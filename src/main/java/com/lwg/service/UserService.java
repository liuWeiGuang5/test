package com.lwg.service;

import com.lwg.domain.User;
import com.lwg.domain.UserView;
import com.lwg.domain.UserViewOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> selectAll();
    User select(Integer id);
    int insertUser(User user);
    int upDateUser(User user);
    int deleteUser(Integer id);
    List<User> getUserByName(User user);
    List<User> getUserByName2(User user);
    List<User> getUserByName3(Map map);
    List<User> getUserByName4(String uname,String usex);
    List<User> getDyName(@Param("username") String username,@Param("sex") String sex);
    List<User> getDyName2(@Param("username") String username,@Param("sex") String sex);
    List<User> getUserByIds (List<Integer> myId);
    int insertUsers(List<User> users);
    int upDateUserDy(User user);
    int deleteUsers(int[] id);
    List<UserView> getUserAndCnum();
    List<User> oneToOne();
    List<User> oneToOne2();
    List<UserViewOrder> oneToDuo(Integer id);
    List<User> oneToDuo2(Integer id);
    //========作业==============

}
