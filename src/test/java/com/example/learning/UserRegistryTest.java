package com.example.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistryTest {

    @Test
    void shouldRegisterUserSuccessfully() {
        UserRegistry registry = new UserRegistry();

        boolean result = registry.register("zhangsan", "123456");

        assertTrue(result);
        assertEquals(1, registry.size());
    }

    @Test
    void shouldRejectDuplicateUsername() {
        UserRegistry registry = new UserRegistry();

        registry.register("zhangsan", "123456");
        boolean result = registry.register("zhangsan", "abcdef");

        assertFalse(result);
        assertEquals(1, registry.size());
    }

    @Test
    void shouldRejectBlankUsername() {
        UserRegistry registry = new UserRegistry();

        boolean result = registry.register("", "123456");

        assertFalse(result);
        assertEquals(0, registry.size());
    }

    @Test
    void shouldRejectShortPassword() {
        UserRegistry registry = new UserRegistry();

        boolean result = registry.register("zhangsan", "123");

        assertFalse(result);
        assertEquals(0, registry.size());
    }

    @Test
    void shouldFindUserByUsername(){
        UserRegistry registry = new UserRegistry();
        registry.register("zhangsan","123456");

        User user = registry.findByUsername("zhangsan");

        assertNotNull(user);
        assertEquals("zhangsan",user.getUsername());
    }

    @Test 
    void shouldReturnNullWhenUserDoesNotExist(){
        UserRegistry registry = new UserRegistry();

        User user = registry.findByUsername("not-exist");
        assertNull(user);
    } 

    @Test 
    void shouldDeleteUserSuccessfully(){
        UserRegistry registry = new UserRegistry();
        registry.register("zhangsan","123456");
        boolean result = registry.deleteByUsername("zhangsan");

        assertTrue(result);
        assertEquals(0, registry.size());
        assertNull(registry.findByUsername("zhangsan"));
    }

    @Test
    void shouldThrowExceptionWhenUserDoesNotExist(){
        UserRegistry registry = new UserRegistry();
        UserNotFoundException exception = assertThrows(UserNotFoundException.class,
            () -> registry.findRequiredByUsername("not-exist"));
        assertEquals("用户不存在：not-exist",exception.getMessage());
    }
}