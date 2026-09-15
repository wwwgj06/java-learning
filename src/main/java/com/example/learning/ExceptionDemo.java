package com.example.learning;

/**
 * 异常处理练习。
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        System.out.println("程序开始");

        try {
            // 这里会因为 abc 不是数字而抛出异常
            int number = Integer.parseInt("abc");
            System.out.println("转换后的数字：" + number);
        } catch (NumberFormatException exception) {
            // 捕获数字格式错误，并给出清晰提示
            System.out.println("转换失败：输入内容不是有效数字");
        }

        // 异常被处理后，程序可以继续执行
        System.out.println("程序结束");
    }
}