package com.sbrf.reboot.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    void getAccount() {
        Account account = new Account("ACC456NUM");
        account.setClientId(100L);
        assertEquals(account.getClientId(), 100L);
    }
}
