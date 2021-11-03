package com.cmcglobal.resourcemanagement.domain.repositories;

import com.cmcglobal.resourcemanagement.domain.entities.Choice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice, Long> {
}
