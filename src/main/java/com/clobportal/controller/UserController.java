package com.clobportal.controller;


import com.clobportal.entity.UserDetail;
import com.clobportal.repositories.UserdetatilReopsitory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/")
public class UserController {


    @Autowired
    UserdetatilReopsitory  userdetatilReopsitory;


    @GetMapping("/listusers")
     ResponseEntity< List<UserDetail>>listUsers(){
  log.info("listing users....");  
  ResponseEntity.ok(userdetatilReopsitory.findAll());
        return new ResponseEntity<>(userdetatilReopsitory.findAll(), HttpStatus.CREATED) ;

    }

    @GetMapping("/findByEmail")
    Optional<UserDetail>     findByEmail(@RequestParam String username) {
        return userdetatilReopsitory.findByUserName(username);
    }


}
