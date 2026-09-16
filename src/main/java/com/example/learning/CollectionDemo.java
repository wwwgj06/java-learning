package com.example.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> usernames = new ArrayList<>();
        usernames.add("zhangsan");
        usernames.add("lisi");
        usernames.add("wangwu");

        System.out.println("用户数量：" + usernames.size());

        System.out.println("第一个用户：" + usernames.get(0));

        for (String username : usernames) {
            System.out.println("用户名：" + username);
        }
        usernames.remove("lisi");
        System.out.println("删除后的用户列表：" + usernames);

        System.out.println("尝试获取第11个用户：");

        try {
            System.out.println(usernames.get(10));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("获取失败：用户下标不存在");
        }
        System.out.println("程序仍然可以继续运行");

        System.out.println();
        System.out.println("===== Set 示例 =====");

        Set<String> uniqueUsernames = new HashSet<>();

        boolean firstAdd = uniqueUsernames.add("zhangsan");
        boolean secondAdd = uniqueUsernames.add("lisi");
        boolean duplicateAdd = uniqueUsernames.add("zhangsan");

        System.out.println("第一次添加 zhangsan：" + firstAdd);
        System.out.println("添加 lisi：" + secondAdd);
        System.out.println("再次添加 zhangsan：" + duplicateAdd);
        System.out.println("Set 中的用户名：" + uniqueUsernames);
        System.out.println("Set 中的用户数量：" + uniqueUsernames.size());

        System.out.println();
        System.out.println("=====Map示例=====");
        Map<String, User> userMap = new HashMap<>();

        User user1 = new User("zhangsan", "123456");
        User user2 = new User("lisi", "abcdef");

        userMap.put(user1.getUsername(), user1);
        userMap.put(user2.getUsername(), user2);

        System.out.println("用户数量：" + userMap.size());
        System.out.println("zhangsan 是否存在：" + userMap.containsKey("zhangsan"));

        User foundUser = userMap.get("zhangsan");
        System.out.println("查询到的用户：" + foundUser.getUsername());

        userMap.remove("lisi");

        System.out.println("删除后的用户数量：" + userMap.size());

        System.out.println();
        System.out.println("=====Map覆盖示例=====");

        User oldUser = new User("wangwu", "oldpass");
        User newUser = new User("wangwu", "newpass");

        userMap.put("wangwu", oldUser);

        System.out.println("第一次保存的密码：" + userMap.get("wangwu").getPassword());

        userMap.put("wangwu", newUser);

        System.out.println("第二次保存的密码：" + userMap.get("wangwu").getPassword());
        System.out.println("当前用户数量：" + userMap.size());

    }

}
