package com.clobportal.service;

import com.clobportal.entity.Role;
import com.clobportal.entity.UserDetail;
import com.clobportal.repositories.UserdetatilReopsitory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

    private final UserdetatilReopsitory userdetatilReopsitory;

    public UserService(UserdetatilReopsitory userdetatilReopsitory) {
        this.userdetatilReopsitory = userdetatilReopsitory;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        UserDetail userDetail= userdetatilReopsitory.findByUserName(userName).orElseThrow(() -> new
                RuntimeException("username not found " + userName));
       Set<GrantedAuthority> authority = getAuthorities(userDetail);

        return new org.springframework.security.core.userdetails.User(userDetail.getUserName(), userDetail.getPassword(), authority);
    }
    private Set<GrantedAuthority> getAuthorities(UserDetail user) {
        Set<Role> roleByUserId = user.getRoles();
        final Set<GrantedAuthority> authorities = roleByUserId.stream().map(role -> new SimpleGrantedAuthority( role.getName().toString().toUpperCase())).collect(Collectors.toSet());
        return authorities;
    }
}
