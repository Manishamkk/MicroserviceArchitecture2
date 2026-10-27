package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Quiz;
import com.example.demo.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService {

	public QuizRepository quizRepository;

	public QuizServiceImpl(QuizRepository quizRepository) {
		this.quizRepository = quizRepository;
	}

	public Quiz add(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	public List<Quiz> getAll() {
		return quizRepository.findAll();
	}

	public Quiz getById(Long id) {
		return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("quiz not found"));
	}

	
	public String deletById(Long id) {
		quizRepository.deleteById(id);
		return  "delete Successfully" ;
	}

}
