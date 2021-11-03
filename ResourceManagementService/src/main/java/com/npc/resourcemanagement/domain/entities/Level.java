package com.cmcglobal.resourcemanagement.domain.entities;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "level", schema = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Level Model")
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
    @Column(name = "level")
    private String level;
    @Column(name = "parent_id")
    private int parentId;
    @Column(name = "is_published")
    private boolean isPublished;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @OneToMany(mappedBy = "level")
    private List<Test> tests;
    @OneToMany(mappedBy = "level")
    private List<Question> questions;
    @OneToMany(mappedBy = "level")
    private List<Users> users;
}
