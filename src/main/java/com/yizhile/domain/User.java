package com.yizhile.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private Long user_id;
    private String user_name;
    private String user_password;
    private Integer user_status;
}
