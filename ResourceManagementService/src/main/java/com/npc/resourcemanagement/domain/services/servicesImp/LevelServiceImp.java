package com.cmcglobal.resourcemanagement.domain.services.servicesImp;

import com.cmcglobal.resourcemanagement.domain.entities.Level;
import com.cmcglobal.resourcemanagement.domain.repositories.LevelRepository;
import com.cmcglobal.resourcemanagement.domain.services.LevelService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class LevelServiceImp implements LevelService {

    @Autowired
    private LevelRepository levelRepository;

    @Override
    public void save(Level object) {
        levelRepository.save(object);
    }

    @Override
    public Level getById(Long id) {
        return levelRepository.getById(id);
    }

    @Override
    public List<Level> findAll() {
        return levelRepository.findAll();
    }
}
