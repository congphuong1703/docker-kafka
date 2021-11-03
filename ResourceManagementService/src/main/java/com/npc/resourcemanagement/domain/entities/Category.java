package com.cmcglobal.resourcemanagement.domain.entities;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "category", schema = "courses")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(value = "Category Model")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "parent_id")
    private int parentId;
    @Column(name = "icon")
    private String icon;
    @Column(name = "is_published")
    private boolean isPublished;
    @Column(name = "created_at")
    protected LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    protected LocalDateTime updatedAt;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Question> questions;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Test> tests;
}
