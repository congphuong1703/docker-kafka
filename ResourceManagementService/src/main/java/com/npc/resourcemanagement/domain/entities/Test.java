package com.cmcglobal.resourcemanagement.domain.entities;

import com.cmcglobal.resourcemanagement.domain.types.RoleType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "test", schema = "courses")
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Test Model")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
    @Column(name = "is_published")
    private boolean isPublished;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    @Column(name = "created_at")
    protected LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    protected LocalDateTime updatedAt;
    @OneToMany(mappedBy = "test", fetch = FetchType.LAZY)
    private List<TestReport> testReports;
}
