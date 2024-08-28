package kr.co.iei.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.iei.board.model.dao.BoardDao;
import kr.co.iei.board.model.dto.BoardDTO;

@Service
public class BoardService {
	@Autowired
	private BoardDao boardDao;

	public List selectBoardList() {
		List list = boardDao.selectBoardList();
		return list; //이렇게 해주면 잭슨이라는 라이브러리가 알아서 제이슨으로 바꿔줌
	}

	public BoardDTO selectOneBoard(int boardNo) {
		BoardDTO board = boardDao.selectOneBoard(boardNo);
		return board;
	}
}
