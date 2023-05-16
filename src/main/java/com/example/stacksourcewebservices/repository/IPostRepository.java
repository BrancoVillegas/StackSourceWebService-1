package com.example.stacksourcewebservices.repository;

import com.example.stacksourcewebservices.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepository extends JpaRepository<Post, Long> {
    List<Post> findByCompany_Id(Long company_id);
}
