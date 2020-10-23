package com.yilaguan.controller;

import com.alibaba.fastjson.JSON;
import com.yilaguan.model.UserModel;
import com.yilaguan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @ModelAttribute
    public void init(Model model) {
        UserModel userModel=new UserModel();
        userModel.setName("hhh");
        model.addAttribute(userModel);
    }

    @ModelAttribute
    public void initTwo(){
        LOGGER.info("two");
    }


    @GetMapping("/findAll")
    @ResponseBody
    public List findAll() {
        List<UserModel> userModels = userService.findAll();

        for (UserModel item : userModels) {
            LOGGER.info(item.getId() + ": " + item.getName() + ": " + item.getPassword());
        }
        return userModels;
    }

    @PostMapping("/findUserById")
    public UserModel findUserById(int id) {
        UserModel userModel = userService.findUserById(id);
        System.out.println(userModel.getName() + ": " + userModel.getPassword());
        return userModel;
    }

    @PostMapping("/insertUser")
    public int insert(String request) {
        UserModel userModel = JSON.parseObject(request, UserModel.class);
        int count = userService.insertUser(userModel);
        return count;
    }

    @PostMapping("/insertUserNew")
    @ResponseBody
    public int insertNew(String request){
        UserModel userModel=JSON.parseObject(request,UserModel.class);
        return (int)userService.insertUserNew(userModel);
    }

    @PostMapping("/deleteUserById")
    @ResponseBody
    public int deleteUser(int id){
        return userService.deleteUserById(id);
    }

    @PostMapping("/deleteUserByName")
    @ResponseBody
    public int deleteUser(String name){
        return userService.deleteUserByName(name);
    }
}
