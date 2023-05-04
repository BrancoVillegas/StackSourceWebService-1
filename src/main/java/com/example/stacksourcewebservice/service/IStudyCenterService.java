package com.example.stacksourcewebservice.service;

import com.example.stacksourcewebservice.entities.StudyCenter;

import java.util.List;

public interface IStudyCenterService extends CrudService<StudyCenter> {
    List<StudyCenter> findByEducationId(Long id) throws Exception;
}

