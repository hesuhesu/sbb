package com.example.demo.question;

import java.util.List;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.Optional;
import com.example.demo.DataNotFoundException;

@RequiredArgsConstructor
@Service
public class QuestionService {
		
	private final QuestionRepository questionRepository;
	
	public void create(String subject, String content) {
		Question q = new Question();
		q.setSubject(subject);
		q.setContent(content);
		q.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q);
	}
	
	public List<Question> getList() {
		return this.questionRepository.findAll();
	}
	
	public Question getQuestion(Integer id) {
		Optional<Question> question = this.questionRepository.findById(id);
		if (question.isPresent()) {
			return question.get();
		} 
		else {
			throw new DataNotFoundException("question not found");
		}
	}
}