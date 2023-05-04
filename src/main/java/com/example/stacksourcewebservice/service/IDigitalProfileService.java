package com.example.stacksourcewebservice.service;

import com.example.stacksourcewebservice.entities.DigitalProfile;

import java.util.Optional;

public interface IDigitalProfileService extends CrudService<DigitalProfile> {

    Optional<DigitalProfile> findDigitalProfileByDeveloperId(Long id) throws Exception;
}