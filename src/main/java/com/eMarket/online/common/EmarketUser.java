package com.eMarket.online.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmarketUser {
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private boolean actived;
}
