package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private int id;
    private String name;
    private String number;
    private Short gender;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
