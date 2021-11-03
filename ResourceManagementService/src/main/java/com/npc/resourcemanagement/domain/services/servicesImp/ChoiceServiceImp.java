package com.cmcglobal.resourcemanagement.domain.services.servicesImp;

import com.cmcglobal.resourcemanagement.Constants;
import com.cmcglobal.resourcemanagement.domain.entities.Choice;
import com.cmcglobal.resourcemanagement.domain.repositories.ChoiceRepository;
import com.cmcglobal.resourcemanagement.domain.services.ChoiceService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
public class ChoiceServiceImp implements ChoiceService {


    @Autowired
    private ChoiceRepository choiceRepository;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishToTopic(String message) {
        System.out.println("publish to topic " + Constants.TOPIC);
        this.kafkaTemplate.send(Constants.TOPIC, message);
    }

    public void testRedis() {
        redisTemplate.opsForValue().set("loda", "hello world");

        System.out.println("Value of key loda: " + redisTemplate.opsForValue().get("loda"));
    }

    @Override
    @Transactional
    public void save(Choice object) {
        choiceRepository.save(object);
    }

    @Override
    public Choice getById(Long id) {
        Choice choice = choiceRepository.getById(id);
        return choice;
    }

    @Override
    public List<Choice> findAll() {
        return choiceRepository.findAll();
    }
}
