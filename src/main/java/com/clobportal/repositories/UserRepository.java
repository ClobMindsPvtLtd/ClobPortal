package com.clobportal.repositories;


import com.clobportal.entity.UserDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<UserDetail,Long> {

    UserDetail findByEmail(String email);

}
