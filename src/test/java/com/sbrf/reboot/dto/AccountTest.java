package com.sbrf.reboot.dto;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    void testClassPathXmlApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/context.xml");
        assertDoesNotThrow(() -> {
            Account account = context.getBean("account", Account.class);
            assertEquals(account.getNumber(), "ACC-12345");
        });
    }
}
