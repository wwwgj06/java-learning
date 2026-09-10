package com.example.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistry registry = new UserRegistry();

        System.out.println("===== 用户注册 =====");

        while (true) {
            System.out.print("请输入用户名，输入 exit 退出：");
            String username = scanner.nextLine();

            if ("exit".equalsIgnoreCase(username)) {
                break;
            }

            System.out.print("请输入密码：");
            String password = scanner.nextLine();

            if (registry.register(username, password)) {
                System.out.println("注册成功！");
            } else if (registry.exists(username)) {
                System.out.println("注册失败：用户名已存在");
            } else if (username.isBlank()) {
                System.out.println("注册失败：用户名不能为空");
            } else if (password.length() < 6) {
                System.out.println("注册失败：密码长度不能少于 6 位");
            } else {
                System.out.println("注册失败：输入不合法");
            }

            System.out.println("当前用户数量：" + registry.size());
            System.out.println();
        }

        scanner.close();
        System.out.println("程序已退出");
    }
}