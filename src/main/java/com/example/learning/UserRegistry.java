package com.example.learning;

import java.util.HashMap;
import java.util.Map;

public class UserRegistry {
    private final Map<String, User> users = new HashMap<>();

    public boolean register(String username, String password) {
        if (username == null || username.isBlank()) {
            return false;
        }

        if (password == null || password.length() < 6) {
            return false;
        }

        if (users.containsKey(username)) {
            return false;
        }

        users.put(username, new User(username, password));
        return true;
    }

    public boolean exists(String username) {
        return users.containsKey(username);
    }

    public int size() {
        return users.size();
    }

    public User findByUsername(String username){
        return users.get(username);
    }

    public User findRequiredByUsername(String username){
        User user = users.get(username);
        if(user==null){
            throw new UserNotFoundException("用户不存在："+username);
        }
         return user;
    }
    public boolean deleteByUsername(String username){
        return users.remove(username) != null;
    }
}