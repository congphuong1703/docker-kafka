package com.cmcglobal.resourcemanagement.domain.services.servicesImp;

import com.cmcglobal.resourcemanagement.domain.entities.TestReport;
import com.cmcglobal.resourcemanagement.domain.repositories.TestReportRepository;
import com.cmcglobal.resourcemanagement.domain.services.TestReportService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class TestReportServiceImp implements TestReportService {

    @Autowired
    private TestReportRepository testReportRepository;

    @Override
    public void save(TestReport object) {
        testReportRepository.save(object);
    }

    @Override
    public TestReport getById(Long id) {
        return testReportRepository.getById(id);
    }

    @Override
    public List<TestReport> findAll() {
        return testReportRepository.findAll();
    }
}
