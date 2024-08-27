package kr.co.iei.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kr.co.iei.board.model.service.BoardService;

@RestController//컨트롤러의 모든 응답을 비동기로 처리 -> @ResponseBody 생략
@RequestMapping(value="/board")
public class Boardcontroller {
	@Autowired
	private BoardService boardService;
	
	
}
