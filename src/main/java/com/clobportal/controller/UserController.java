package com.clobportal.controller;


import com.clobportal.entity.UserDetail;
import com.clobportal.repositories.UserdetatilReopsitory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/")
public class UserController {


    @Autowired
    UserdetatilReopsitory  userdetatilReopsitory;


    @GetMapping("/listusers")
   @ResponseBody
    List<UserDetail> listUsers(){
  log.info("listing users....");
        return userdetatilReopsitory.findAll();

    }

    @GetMapping("/findByEmail")
    @ResponseBody
    Optional<UserDetail>     findByEmail(@RequestParam String username) {
        return userdetatilReopsitory.findByUserName(username);
    }

}
