package com.cmcglobal.resourcemanagement.domain.services;

import com.cmcglobal.resourcemanagement.domain.entities.Choice;

import java.util.List;

public interface ChoiceService extends BaseService<Choice> {
    void publishToTopic(String message);

    void testRedis();

}
