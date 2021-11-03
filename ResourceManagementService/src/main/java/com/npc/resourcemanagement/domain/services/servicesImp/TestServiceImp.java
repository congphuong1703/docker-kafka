package com.cmcglobal.resourcemanagement.domain.services.servicesImp;

import com.cmcglobal.resourcemanagement.domain.entities.Test;
import com.cmcglobal.resourcemanagement.domain.repositories.TestReportRepository;
import com.cmcglobal.resourcemanagement.domain.repositories.TestRepository;
import com.cmcglobal.resourcemanagement.domain.services.TestService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class TestServiceImp implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public void save(Test object) {
        testRepository.save(object);
    }

    @Override
    public Test getById(Long id) {
        return testRepository.getById(id);
    }

    @Override
    public List<Test> findAll() {
        return testRepository.findAll();
    }
}
