package com.itheima.controller;

import com.itheima.pojo.Contact;
import com.itheima.pojo.Result;
import com.itheima.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@Slf4j
@RestController
public class ContactController {

    //private static Logger logger = LoggerFactory.getLogger(ContactController.class);
    @Autowired
    private ContactService contactService;

    //RequestMapping(value = "/contactsList", method = RequestMethod.GET)
    //查询联系人数据
    @GetMapping("/contacts")
    public Result list() {
        log.info("查询所有数据");
        List<Contact> contactList = contactService.list();
        return Result.success(contactList);
    }

    //删除联系人
    @DeleteMapping("/contacts/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("删除数据");
        //调用Contact Service来删除数据
        contactService.delete(id);
        return Result.success();
    }

    //新建联系人
    @PostMapping("/contacts")
    public Result insert(@RequestBody Contact contact) {
        log.info("新建联系人数据");
        //调用Contact Service来插入数据
        contactService.insert(contact);
        return Result.success();
    }

    //根据ID查询信息
    @GetMapping("/contacts/{id}")
    public Result searchByID(@PathVariable Integer id) {
        log.info("根据ID查询信息");
        //调用Contact Service来查询数据
        Contact contact = contactService.searchByID(id);
        return Result.success(contact);
    }

    //根据姓名和性别查询信息
    @GetMapping("/searchByName")
    public Result searchByName(String name, Integer gender) {
        log.info("根据姓名和性别查询信息");

        // 调用Contact Service来查询数据
        List<Contact> contactList = contactService.searchByName(name, gender);
        return Result.success(contactList);
    }

    //修改联系人
    @PostMapping("/updateContact")
    public Result update(@RequestBody Contact contact) {
        log.info("根据ID修改信息");
        //调用Contact Service来修改数据
        contactService.update(contact);
        return Result.success();
    }
}
