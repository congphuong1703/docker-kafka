package com.cmcglobal.resourcemanagement.domain.services.servicesImp;

import com.cmcglobal.resourcemanagement.domain.entities.Users;
import com.cmcglobal.resourcemanagement.domain.repositories.UsersRepository;
import com.cmcglobal.resourcemanagement.domain.services.UsersService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class UsersServiceImp implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void save(Users object) {
        usersRepository.save(object);
    }

    @Override
    public Users getById(Long id) {
        return usersRepository.getById(id);
    }

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }
}
