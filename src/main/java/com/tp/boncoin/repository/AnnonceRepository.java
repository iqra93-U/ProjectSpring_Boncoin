package com.tp.boncoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp.boncoin.entity.Annonce;

public interface AnnonceRepository extends JpaRepository<Annonce , Integer> {

}
