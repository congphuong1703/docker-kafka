package com.cmcglobal.resourcemanagement.domain.repositories;

import com.cmcglobal.resourcemanagement.domain.entities.Choice;
import com.cmcglobal.resourcemanagement.domain.entities.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends JpaRepository<Level, Long> {
}
