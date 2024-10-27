package com.itheima;

import com.itheima.mapper.ContactMapper;
import com.itheima.pojo.Contact;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SoftwareEngineeringProject01ContactsApplicationTests {
    @Autowired
    private ContactMapper contactMapper;

    @Test
    void testInsert() {
        Contact contact=new Contact();
        contact.setName("zmh");
        contact.setNumber("12345678910");
        contact.setGender((short) 2);
        contact.setCreateTime(LocalDateTime.now());
        contact.setUpdateTime(LocalDateTime.now());
    }



}

