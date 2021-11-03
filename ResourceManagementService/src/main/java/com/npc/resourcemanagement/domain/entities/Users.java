package com.cmcglobal.resourcemanagement.domain.entities;

import com.cmcglobal.resourcemanagement.domain.types.RoleType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "user", schema = "users")
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Users Model")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "location")
    private String location;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "hire_date")
    private LocalDate hireDate;
    @Column(name = "employee_id")
    private String employeeId;
    @Column(name = "company_id")
    private String companyId;
    @Column(name = "date_of_birth")
    private LocalDate dob;
    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
    @Column(name = "created_at")
    protected LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    protected LocalDateTime updatedAt;
    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private List<TestReport> testReports;
}
