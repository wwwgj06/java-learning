package com.example.learning;

import java.util.HashMap;
import java.util.Map;

/**
 * Map 集合练习。
 *
 * 使用用户名作为 Key，User 对象作为 Value。
 */
public class UserMapDemo {

    public static void main(String[] args) {
        // Key 是用户名，Value 是对应的 User 对象
        Map<String, User> users = new HashMap<>();

        User zhangsan = new User("zhangsan", "123456");
        User lisi = new User("lisi", "abcdef");

        // 保存用户
        users.put(zhangsan.getUsername(), zhangsan);
        users.put(lisi.getUsername(), lisi);

        // 根据用户名查询用户
        User foundUser = users.get("zhangsan");

        if (foundUser != null) {
            System.out.println("查询成功：" + foundUser.getUsername());
        } else {
            System.out.println("用户不存在");
        }

        // 查询不存在的用户
        User missingUser = users.get("wangwu");

        if (missingUser == null) {
            System.out.println("用户不存在：wangwu");
        }

        // 判断 Key 是否存在
        System.out.println(
                "lisi 是否存在："
                        + users.containsKey("lisi")
        );

        // 删除用户
        User deletedUser = users.remove("lisi");

        if (deletedUser != null) {
            System.out.println(
                    "删除成功：" + deletedUser.getUsername()
            );
        }

        System.out.println("剩余用户数量：" + users.size());
    }
}