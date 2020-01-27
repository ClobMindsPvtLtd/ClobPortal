package com.clobportal.service;

import com.clobportal.entity.UserDetail;
import com.clobportal.repositories.UserRepository;
import com.clobportal.repositories.UserdetatilReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailService")
public class userDetailServiceimpl implements userDetailService {

    @Autowired
    UserdetatilReopsitory userdetatilReopsitory;


    @Override
    public Object save(UserDetail userDetail) {
        return null;
    }
}



