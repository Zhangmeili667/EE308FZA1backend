package com.itheima.mapper;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.itheima.pojo.Contact;
import org.apache.ibatis.annotations.*;

import java.time.LocalDateTime;
import java.util.List;


@Mapper
public interface ContactMapper {

    //查询全部用户信息
    @Select("select * from contacts")
    public List<Contact> list();

    //删除联系人
    @Delete("delete from contacts where id =#{id}")
    void delete(Integer id);

    //新建联系人
    @Insert("insert into contacts (name, number, gender, create_time, update_time)"+
            "values(#{name},#{number},#{gender},#{createTime},#{updateTime})")
    void insert(Contact contact);

    //根据ID查询联系人
    @Select("select id,name,number,gender,create_time,update_time from contacts where id=#{id}")
    Contact searchByID(Integer id);

    //修改联系人信息
    public void update (Contact contact);

    //根据姓名和性别查询联系人
    public List<Contact> searchByName(@Param("name") String name,@Param("gender") Integer gender);
}
