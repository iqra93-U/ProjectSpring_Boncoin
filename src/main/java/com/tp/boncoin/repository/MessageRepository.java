package com.tp.boncoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp.boncoin.entity.Message;

public interface MessageRepository extends JpaRepository<Message , Integer>{

}
