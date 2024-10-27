package com.itheima.service;

import com.itheima.pojo.Contact;

import java.util.List;

public interface ContactService {
     //查询全部数据
    List<Contact> list();

    void delete(Integer id);

    void insert(Contact contact);

    Contact searchByID(Integer id);

    void update(Contact contact);

    public List<Contact> searchByName(String name,Integer gender);
}
