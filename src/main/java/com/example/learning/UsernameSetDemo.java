package com.example.learning;

import java.util.HashSet;
import java.util.Set;

/**
 * Set 集合练习。
 *
 * 用于保存不重复的用户名。
 */
public class UsernameSetDemo {

    public static void main(String[] args) {
        // Set 只保存用户名，不保存 User 对象
        Set<String> usernames = new HashSet<>();

        addUsername(usernames, "zhangsan");
        addUsername(usernames, "lisi");
        addUsername(usernames, "zhangsan");

        System.out.println("当前用户名：" + usernames);
        System.out.println("用户名数量：" + usernames.size());
    }

    /**
     * 尝试添加用户名。
     *
     * @param usernames 用户名集合
     * @param username 要添加的用户名
     */
    private static void addUsername(
            Set<String> usernames,
            String username
    ) {
        boolean added = usernames.add(username);

        if (added) {
            System.out.println("添加成功：" + username);
        } else {
            System.out.println("添加失败，用户名已存在：" + username);
        }
    }
}