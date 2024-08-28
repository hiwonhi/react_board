package kr.co.iei.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.iei.board.model.dto.BoardDTO;
import kr.co.iei.board.model.service.BoardService;

@CrossOrigin("*") //다른 데에서 요청들어와도 데이터 줄 수 있게 (CORS 오류 안 나게)
@RestController//컨트롤러의 모든 응답을 비동기로 처리 -> @ResponseBody 생략
@RequestMapping(value="/board")
public class Boardcontroller {
	@Autowired
	private BoardService boardService;
	
	@GetMapping(value="/list")
	public List list() {
		List list = boardService.selectBoardList();
		return list;
	}
	
	@GetMapping(value="/view/{boardNo}")
	public BoardDTO view(@PathVariable int boardNo) { //경로에 있는 변수 여기로 넣어줘
		BoardDTO board = boardService.selectOneBoard(boardNo);
		return board;
	}
}
