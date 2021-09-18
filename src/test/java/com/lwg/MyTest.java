package com.lwg;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lwg.domain.*;
import com.lwg.service.StudentService;
import com.lwg.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyTest {


    @Test
    public void Test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<User> users =  service.selectAll();
        for (User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void Test02(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        int id = 1;
        User user = service.select(id);
        System.out.println(user);
    }

    @Test
    public void Test03() throws ParseException {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        String time = "2008-08-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(time);
        User user = new User(null,"彬彬",date,"男","北京");
        int result = service.insertUser(user);
        if (result == 1){
            System.out.println("添加用户的id=  "+user.getId());
            System.out.println("添加成功");
        }
    }

    @Test
    public void Test04() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        User user = new User();
        user.setId(25);
        user.setUsername("杰哥");
        user.setSex("男");
        int result = service.upDateUser(user);
        if (result == 1){
            System.out.println("更新成功");
        }
    }

    @Test
    public void Test05() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        int result = service.deleteUser(25);
        if (result == 1){
            System.out.println("删除成功");
        }
    }

    @Test
    public void Test06() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        User user = new User();
        user.setUsername("z");
        user.setSex("1");
        List<User> users = service.getUserByName(user);
        for (User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void Test07() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        User user = new User();
        user.setUsername("z");
        user.setSex("1");
        List<User> users = service.getUserByName2(user);
        for (User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void Test08() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        Map map = new HashMap<String,Object>();
        map.put("username","z");
        map.put("sex",1);
        List<User> users = service.getUserByName3(map);
        for (User u : users){
            System.out.println(u);
        }
    }


    @Test
    public void Test09() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<User> users = service.getUserByName4("z","1");
        for (User u : users){
            System.out.println(u);
        }
    }


    @Test
    public void Test010() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<User> users = service.getDyName("","1");
        for (User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void Test011() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<User> users = service.getDyName2("","");
        for (User u : users){
            System.out.println(u);
        }
    }


    @Test
    public void Test012() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(16);
        ids.add(19);
        List<User> users = service.getUserByIds(ids);
        for (User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void Test013() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<User> users = new ArrayList<>();
        int i = 0;
        for (; i < 5; i++) {
            User user = new User(null,"张三"+i,new Date(),"1","北京");
            users.add(user);
        }
        int result = service.insertUsers(users);
        if (result == 5) {
            System.out.println("添加"+i+"条数据成功");
        }
    }

    @Test
    public void Test014() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        User user = new User();
        user.setId(36);
        user.setUsername("阿博");
        user.setSex("女");
        int result = service.upDateUserDy(user);
        if (result == 1){
            System.out.println("成功更新数据");
        }
    }

    @Test
    public void Test015() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        int result = service.deleteUsers(new int[] {30,31,32,33,34,35});
        if (result == 6) {
            System.out.println("成功删除"+result+"条数据");
        }
    }


    /*
    * 难点
    * */
    @Test
    public void Test016() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<UserView> userViews = service.getUserAndCnum();
        for (UserView uv : userViews){
            System.out.println(uv);
        }
    }

    @Test
    public void Test017() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<User> users = service.oneToOne();
        for (User u : users){
            System.out.println(u);
        }
    }

    @Test
    public void Test018() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<User> users = service.oneToOne2();
        /*for (User u : users){
            System.out.println(u);
        }*/
        System.out.println(users.get(0).getId());
    }


    @Test
    public void Test019() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<UserViewOrder> users = service.oneToDuo(1);
        for (User u : users){
            System.out.println(u);
        }
    }


    @Test
    public void Test020() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        List<User> user = service.oneToDuo2(1);
        System.out.println(user);
    }


    @Test
    public void Test021() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        List<Student> students = service.selStudent();
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Test
    public void Test022() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        List<Classes> classes = service.selClass(1);
        for (Classes c : classes){
            System.out.println(c);
        }
    }


    //一级缓存
    @Test
    public void Test023(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        User user = service.select(1);
        System.out.println("第一次查询结果"+user);
        User user1 = service.select(1);
        System.out.println("第二次查询结果"+user1);
    }

    @Test
    public void Test024(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("userService");
        PageHelper.startPage(1,6);
        List<User> users = service.selectAll();
        PageInfo<User> info = new PageInfo<User>(users);
    }





}
