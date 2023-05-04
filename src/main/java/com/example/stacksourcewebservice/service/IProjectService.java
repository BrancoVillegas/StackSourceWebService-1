package com.example.stacksourcewebservice.service;

import com.example.stacksourcewebservice.entities.Project;

import java.util.List;

public interface IProjectService extends CrudService<Project> {
    List<Project> findByDigitalProfileId(Long id) throws Exception;
}
