package com.tp.boncoin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tp.boncoin.entity.Message;

public interface MessageRepository extends JpaRepository<Message , Integer>{

	@Query("SELECT m FROM Message m WHERE m.idAnnonce = :id")
	public List<Message> getMessageById(@Param ("id") int id);
	
}
