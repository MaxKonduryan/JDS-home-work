package com.sbrf.reboot.model;

import com.sbrf.reboot.dto.Account;
import lombok.*;

import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {
    private final String name;
    private int age;
    private Set<Account> accounts;
}
