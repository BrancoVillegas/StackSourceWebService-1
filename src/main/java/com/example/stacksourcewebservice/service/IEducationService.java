package com.example.stacksourcewebservice.service;

import com.example.stacksourcewebservice.entities.Education;

import java.util.Optional;

public interface IEducationService extends CrudService<Education> {
    Optional<Education> findByDigitalProfileId(Long id) throws Exception;
}
