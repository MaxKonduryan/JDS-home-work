package com.sbrf.reboot.model;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.junit.jupiter.api.Assertions.*;

@ComponentScan(basePackages = "com.sbrf.reboot.model")
public class ClientTest {

    @Test
     void testAnnotationConfigApplicationContext() {
        assertDoesNotThrow(() -> {
            ApplicationContext context = new AnnotationConfigApplicationContext(ClientTest.class);
            context.getBean("client", Client.class);
        });
    }
}
