package com.example.studylog.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "study_log")
public class StudyLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, columnDefinition = "text")
    private String content;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    protected StudyLog() {
        // JPA 기본 생성자
    }

    // ✅ 이 생성자를 추가해라
    public StudyLog(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
