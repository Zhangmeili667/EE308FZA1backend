package com.itheima.service.impl;

import com.itheima.mapper.ContactMapper;
import com.itheima.pojo.Contact;
import com.itheima.service.ContactService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactMapper contactMapper;

    @Override
    public List<Contact> list() {
        return contactMapper.list();
    }

    @Override
    public void delete(Integer id) {
        contactMapper.delete(id);
    }

    @Override
    public void insert(Contact contact) {
        contact.setCreateTime(LocalDateTime.now());
        contact.setUpdateTime(LocalDateTime.now());
        contactMapper.insert(contact);
    }

    @Override
    public Contact searchByID(Integer id) {
        Contact contact =contactMapper.searchByID(id);
        return contact;
    }

    @Override
    public void update(Contact contact) {
        contact.setUpdateTime(LocalDateTime.now());
        contactMapper.update(contact);
    }

    @Override
    public List<Contact> searchByName(String name, Integer gender) {
        List<Contact> contactList =contactMapper.searchByName(name, gender);
        return contactList;
    }


}
