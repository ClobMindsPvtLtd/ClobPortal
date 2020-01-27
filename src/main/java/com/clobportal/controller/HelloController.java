package com.clobportal.controller;

import com.clobportal.entity.UserDetail;
import com.clobportal.repositories.UserRepository;
import com.clobportal.repositories.UserdetatilReopsitory;
import com.clobportal.service.userDetailService;
import com.clobportal.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@RestController
public class HelloController {

    @RequestMapping("/api/hello")

    public @ResponseBody String hello() {
        return "Hello World from testing bracnch!";
    }

   /* @Autowired
    userDetailService userDetailService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserdetatilReopsitory userdetatilReopsitory;

    @RequestMapping("/")

   public @ResponseBody String hello() {
        return "Hello World!";
    }


    @RequestMapping("/login")
    @ResponseBody
    public UserDetail user(){
        UserDetail user = new UserDetail();
        user.setFirstNmae("mohammed ");

        return user;

    }

    @RequestMapping(path = "/save", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ServiceResponse save(@RequestBody UserDetail userDetail){
          ServiceResponse serviceResponse =null;

         userDetailService.save(userDetail);
        serviceResponse = new ServiceResponse("200","saved",userDetail);
    return serviceResponse;
    }

    //@RequestMapping(path = "/list", consumes = "application/json", produces = "application/json")
    @GetMapping(value="/list", headers="Accept=application/json")
    @ResponseBody
    public UserDetail  list(){
        ServiceResponse serviceResponse =null;
       // userdetatilReopsitory.deleteById((long) 7);
        UserDetail user=userRepository.findByEmail("farooq");

       List<UserDetail> list =userdetatilReopsitory.findAll();
       for(UserDetail u:list){
           System.out.println(u.getFirstNmae().toUpperCase());
       }
        serviceResponse=new ServiceResponse("200","listed",list);
        return user;
    }*/



}
