package com.yizhile.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class People {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
}
