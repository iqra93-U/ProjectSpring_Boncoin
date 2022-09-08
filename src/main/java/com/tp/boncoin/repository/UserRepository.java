package com.tp.boncoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp.boncoin.entity.User;

public interface UserRepository extends JpaRepository<User , Integer>{

}
