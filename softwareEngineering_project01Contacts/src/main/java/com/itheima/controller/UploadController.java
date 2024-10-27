package com.itheima.controller;

import com.itheima.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
public class UploadController {
    @PostMapping("/upload")
    public Result upload (String name, String number){
        log.info("文件上传:{},{}",name,number);
        return Result.success();
    }
}
