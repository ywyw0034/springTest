package com.yilaguan.controller;

import com.yilaguan.model.UserModel;
import com.yilaguan.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER= LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @GetMapping("/findAll")
    public String findAll(){
        List<UserModel> userModels=userService.findAll();

        for (UserModel item:userModels){
            LOGGER.info(item.getId()+": "+item.getName()+": "+item.getPassword());
        }
        return "hello";
    }
}
