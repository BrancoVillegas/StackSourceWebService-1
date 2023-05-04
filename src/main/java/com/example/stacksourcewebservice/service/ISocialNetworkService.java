package com.example.stacksourcewebservice.service;

import com.example.stacksourcewebservice.entities.SocialNetwork;

import java.util.List;

public interface ISocialNetworkService extends CrudService<SocialNetwork> {
    List<SocialNetwork> findSocialNetworkByName(String name_social_network) throws Exception;

    List<SocialNetwork> findByUserId(Long id) throws Exception;
}