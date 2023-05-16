package com.example.stacksourcewebservices.service;

import com.example.stacksourcewebservices.entities.Post;

import java.util.List;

public interface IPostService extends CrudService<Post> {
    List<Post> findByCompany_Id(Long company_id) throws Exception;
}