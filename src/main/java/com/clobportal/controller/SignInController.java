package com.clobportal.controller;


import com.clobportal.dto.UserDto;
import com.clobportal.entity.Role;
import com.clobportal.entity.RoleType;
import com.clobportal.entity.UserDetail;
import com.clobportal.repositories.RoleDao;
import com.clobportal.repositories.UserdetatilReopsitory;
import javafx.beans.property.ReadOnlyListProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@Validated
@RestController
@PreAuthorize("permitAll()")
@RequestMapping("/api/signin")
public class SignInController {


    @Autowired
    private RoleDao roleDao;

  public  final UserdetatilReopsitory userdetatilReopsitory;

  public final PasswordEncoder passwordEncoder;

    public SignInController(UserdetatilReopsitory userdetatilReopsitory, PasswordEncoder passwordEncoder) {
        this.userdetatilReopsitory = userdetatilReopsitory;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping
    UserDetail signin(@RequestBody UserDto userDto) {

        UserDetail u = new UserDetail();
        u.setUserName(userDto.getUsername());
        u.setPassword(passwordEncoder.encode(userDto.getPassword()));
        System.out.println(userDto.getPassword());
        /*Role role = new Role();
        role.setName(RoleType.ADMIN);
        roleDao.save(role);*/

        List<RoleType> roleTypes = new ArrayList<>();
        userDto.getRole().stream().map(roles -> roleTypes.add(RoleType.valueOf(roles)));
        u.setRoles(roleDao.find(userDto.getRole()));

        userdetatilReopsitory.save(u);
        return userdetatilReopsitory.save(u);
    }


}
