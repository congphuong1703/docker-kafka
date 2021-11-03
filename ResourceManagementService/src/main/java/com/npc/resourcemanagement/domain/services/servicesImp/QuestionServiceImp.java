package com.cmcglobal.resourcemanagement.domain.services.servicesImp;

import com.cmcglobal.resourcemanagement.domain.entities.Question;
import com.cmcglobal.resourcemanagement.domain.repositories.QuestionRepository;
import com.cmcglobal.resourcemanagement.domain.services.QuestionService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class QuestionServiceImp implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public void save(Question object) {
        questionRepository.save(object);
    }

    @Override
    public Question getById(Long id) {
        return questionRepository.getById(id);
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }
}

