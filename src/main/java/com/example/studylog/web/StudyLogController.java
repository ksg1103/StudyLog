package com.example.studylog.web;

import com.example.studylog.domain.StudyLog;
import com.example.studylog.repository.StudyLogRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/studylogs")
public class StudyLogController {

    private final StudyLogRepository repository;

    public StudyLogController(StudyLogRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public StudyLog create(@RequestBody CreateReq req) {
        return repository.save(new StudyLog(req.title(), req.content()));
    }

    public record CreateReq(String title, String content) {}
}
