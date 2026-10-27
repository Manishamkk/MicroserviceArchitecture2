package com.example.demo.client;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.QuestionResponse;

@FeignClient(name = "QuestionService")
public interface QuestionClient {

    @GetMapping("/question/getById/{id}")
    QuestionResponse getQuestion(@PathVariable("id") Long id);
    
}