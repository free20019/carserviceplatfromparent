package com.tw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ${H_H}
 * @DATE 2019-05-15
 * @TIME 11:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginEn {
    private String name;
    private String password;
}
