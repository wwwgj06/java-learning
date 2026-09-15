package com.example.learning;

import java.util.ArrayList;
import java.util.List;

public class UserListDemo {
    public static void main(String[] args) {
        
    List<User> users = new ArrayList<>();

    users.add(new User("zhangsan", "123456"));
    users.add(new User("lisi", "abcdef"));
    users.add(new User("wangwu", "654321"));

    System.out.println("用户数量：" + users.size());

    for(User user : users){
        System.out.println("用户名："+user.getUsername());
        }
    User firstUser = users.get(0);
    System.out.println("第一个用户："+firstUser.getUsername());

    users.remove(1);

    System.out.println("删除后的用户数量：" + users.size());
    }
}
