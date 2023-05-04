package com.example.stacksourcewebservice.service;

import com.example.stacksourcewebservice.entities.User;

import java.util.List;

public interface IUserService extends CrudService<User> {

    User findByEmail(String email) throws Exception;

    List<User> findByFirstName(String firstName) throws Exception;

    List<User> findByRole(String role) throws Exception;

    List<User> findDeveloperByFrameworkAndProgrammingLanguageAndDatabase(String framework, String programmingLanguage, String database) throws Exception;

}

