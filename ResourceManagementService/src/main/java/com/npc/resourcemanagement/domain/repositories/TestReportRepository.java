package com.cmcglobal.resourcemanagement.domain.repositories;

import com.cmcglobal.resourcemanagement.domain.entities.Choice;
import com.cmcglobal.resourcemanagement.domain.entities.TestReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestReportRepository extends JpaRepository<TestReport, Long> {
}
