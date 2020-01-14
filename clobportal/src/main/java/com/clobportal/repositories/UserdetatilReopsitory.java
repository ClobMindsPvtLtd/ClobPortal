package com.clobportal.repositories;

import com.clobportal.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserdetatilReopsitory extends JpaRepository<UserDetail,Long> {




}
