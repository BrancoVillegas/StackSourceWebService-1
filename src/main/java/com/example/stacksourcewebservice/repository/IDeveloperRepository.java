package com.example.stacksourcewebservice.repository;

import com.example.stacksourcewebservice.entities.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeveloperRepository extends JpaRepository<Developer, Long> {
}
