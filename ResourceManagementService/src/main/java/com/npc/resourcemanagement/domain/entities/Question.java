package com.cmcglobal.resourcemanagement.domain.entities;

import com.cmcglobal.resourcemanagement.domain.types.QuestionType;
import com.cmcglobal.resourcemanagement.domain.utils.PostgreSQLEnumType;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "question", schema = "courses")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@TypeDef(name = "pgsql_enum", typeClass = PostgreSQLEnumType.class)
@ApiModel(value = "Question Model")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
    @Column(name = "exp")
    private int experience;
    @Column(name = "is_published")
    private boolean isPublished;
    @Column(name = "question")
    private String question;
    @Column(name = "question_type")
    @Enumerated(EnumType.STRING)
    @Type(type = "pgsql_enum")
    private QuestionType questionType;
    @Column(name = "created_at")
    protected LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    protected LocalDateTime updatedAt;
    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    private List<Choice> choices;
    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    private List<Test> tests;
    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    private List<TestReport> testReports;
}
