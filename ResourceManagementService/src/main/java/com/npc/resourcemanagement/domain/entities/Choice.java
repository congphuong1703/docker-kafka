package com.cmcglobal.resourcemanagement.domain.entities;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "choice", schema = "courses")
@ApiModel(value = "Choice Model")
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    @Column(name = "is_correct")
    private boolean isCorrect;
    @Column(name = "is_published")
    private boolean isPublished;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    protected LocalDateTime updatedAt;
    @OneToMany(mappedBy = "choice", fetch = FetchType.LAZY)
    private List<TestReport> testReports;
}
