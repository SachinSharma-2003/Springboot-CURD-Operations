package com.example.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.Entity.StuData;

public interface JpaRepos extends JpaRepository<StuData, Integer>{

}
