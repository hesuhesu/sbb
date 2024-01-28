package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import java.util.List;
// import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.transaction.annotation.Transactional;

// import com.example.demo.answer.Answer;
// import com.example.demo.answer.AnswerRepository;
// import com.example.demo.question.Question;
// import com.example.demo.question.QuestionRepository;
import com.example.demo.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {
	
	/*@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;*/
	
	@Autowired
	private QuestionService questionService;
	
	/*void testJpa() {
		Question q1 = new Question();
		q1.setSubject("sbb 가 무 엇 인 가 요 ?");
		q1.setContent("sbb 에 대 해 서 알 고 싶 습 니 다 .");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1); // 첫 번 째 질 문 저 장
		Question q2 = new Question();
		q2.setSubject(" 스 프 링 부 트 모 델 질 문 입 니 다 .");
		q2.setContent("id 는 자 동 으 로 생 성 되 나 요 ?");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2); // 두 번 째 질 문 저 장
	}*/
	
	/*void testJpa() {
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2, all.size());
		Question q = all.get(0);
		assertEquals("sbb 가 무 엇 인 가 요 ?", q.getSubject());
	}*/
	
	/*void testJpa() {
		Optional<Question> oq = this.questionRepository.findById(1);
		if(oq.isPresent()) {
		Question q = oq.get();
		assertEquals("sbb 가 무 엇 인 가 요 ?", q.getSubject());
		}
		}*/
	
	/*void testJpa() {
		Question q = this.questionRepository.findBySubject("sbb 가 무 엇 인 가 요 ?");
		assertEquals(1, q.getId());
	}*/
	
	/*void testJpa() {
		Question q = this.questionRepository.findBySubjectAndContent(
				"sbb 가 무 엇 인 가 요 ?", "sbb 에 대 해 서 알 고 싶 습 니 다 .");
				assertEquals(1, q.getId());
	}*/
	
	/*void testJpa() {
		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
		Question q = qList.get(0);
		assertEquals("sbb 가 무 엇 인 가 요 ?", q.getSubject());
	}*/
	
	/*void testJpa() {
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		q.setSubject(" 수 정 된 제 목 ");
		this.questionRepository.save(q);
	}*/
	
	/*void testJpa() {
		assertEquals(2, this.questionRepository.count());
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		this.questionRepository.delete(q);
		assertEquals(1, this.questionRepository.count());
	}*/
	
	/*void testJpa() {
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		Answer a = new Answer();
		a.setContent(" 네 자 동 으 로 생 성 됩 니 다 .");
		a.setQuestion(q); // 어 떤 질 문 의 답 변 인 지 알 기 위 해 서 Question 객 체 가 필 요 하 다 .
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);
	}*/
	
	/*void testJpa() {
		Optional<Answer> oa = this.answerRepository.findById(1);
		assertTrue(oa.isPresent());
		Answer a = oa.get();
		assertEquals(2, a.getQuestion().getId());
	}*/
	
	/*@Transactional
	@Test
	void testJpa() {
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		List<Answer> answerList = q.getAnswerList();
		assertEquals(1, answerList.size());
		assertEquals(" 네 자 동 으 로 생 성 됩 니 다 .", answerList.get(0).getContent());
	}*/
	
	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format(" 테 스 트 데 이 터 입 니 다 :[%03d]", i);
			String content = " 내 용 무 ";
			this.questionService.create(subject, content, null);
		}
	}
}