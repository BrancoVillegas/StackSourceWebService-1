package com.example.stacksourcewebservice.service;

import com.example.stacksourcewebservice.entities.Message;

import java.util.List;

public interface IMessageService extends CrudService<Message>{
    List<Message> findLastMessageDeveloper(long id) throws Exception;
    List<Message> findLastMessageCompany(long id) throws Exception;
}
