package com.cmcglobal.resourcemanagement.domain.repositories;

import com.cmcglobal.resourcemanagement.domain.entities.Choice;
import com.cmcglobal.resourcemanagement.domain.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
}
