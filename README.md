# Java Learning

一个基于 Java 17 和 Maven 的用户注册控制台程序，用于学习 Java 基础、JUnit 测试和 Git 工作流。

## 技术栈

- Java 17
- Maven
- JUnit 5
- Git
- GitHub

## 已实现功能

- 用户注册
- 用户名不能为空校验
- 密码长度校验
- 重复用户名校验
- 用户数量统计
- JUnit 自动化测试

## 项目结构

```text
src
├── main
│   └── java
│       └── com.example.learning
│           ├── Main.java
│           ├── User.java
│           └── UserRegistry.java
└── test
    └── java
        └── com.example.learning
            └── UserRegistryTest.java

如何运行
1. 克隆项目
git clone https://github.com/wwwgj06/java-learning.git
cd java-learning
2. 运行程序
mvn compile
java -cp target/classes com.example.learning.Main
3. 执行测试
mvn test
测试内容
当前测试包括：
- 合法用户注册；
- 重复用户名注册失败；
- 空用户名注册失败；
- 密码长度不足注册失败。

## 第二步：提交 README

保存后执行：

```bash
git add README.md
git commit -m "docs: add project README"
git push
刷新 GitHub 页面后，你会看到 README 自动显示在项目首页。
至此，你第一天的学习计划全部完成：
- 本地项目创建；
- Java 程序编写；
- Maven 测试；
- Git 版本管理；
- GitHub 远程备份；
- 项目文档编写。
