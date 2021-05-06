package com.example.Ohjelmistoprojekti.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Ohjelmistoprojekti.demo.domain.Query;

@Repository
public interface QueryRepository extends JpaRepository<Query, Long> {

}