package com.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class json {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        User user1 = new User();
        user1.setName("guest1");
        user1.setAge(28);
        String juser1 = JSON.toJSONString(user1);
        System.out.println(juser1);
        User ouser1 = JSON.parseObject(juser1, User.class);
        System.out.println(ouser1);

        User user2 = new User();
        user2.setName("guest2");
        user2.setAge(30);

        UserGroup userGroup = new UserGroup();
        userGroup.setName("admin");
        ArrayList<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        userGroup.setUsers(users);
        String suserGroup = JSON.toJSONString(userGroup);
        System.out.println(suserGroup);
        UserGroup ouserGroup = JSON.parseObject(suserGroup, UserGroup.class);
        System.out.println(ouserGroup);

        User[] userarr = new User[2];
        userarr[0] = user1;
        userarr[1] = user2;
        String juserarr = JSON.toJSONString(userarr);
        System.out.println(juserarr);
        List<User> ouserarr = JSON.parseArray(juserarr, User.class);
        System.out.println(ouserarr);

        Map<String, User> map = new HashMap<String, User>();
        map.put("user", user1);
        String jmap = JSON.toJSONString(map);
        Map<String, User> omap = JSON.parseObject(jmap, new TypeReference<Map<String, User>>(){});
        System.out.println(omap);
    }
}
class UserGroup {
    private String name;
    private List<User> users = new ArrayList<User>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserGroup [name=" + name + ", users=" + users + "]";
    }
}
class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
}