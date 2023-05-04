package com.example.stacksourcewebservice.service;

import com.example.stacksourcewebservice.entities.Certificate;

import java.util.List;

public interface ICertificateService extends CrudService<Certificate> {
    List<Certificate> findByEducationId(Long id) throws Exception;
}
