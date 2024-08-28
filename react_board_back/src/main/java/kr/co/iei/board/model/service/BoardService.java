package kr.co.iei.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	public int insertBoard(BoardDTO board) {
		int result = boardDao.insertBoard(board);
		return result;
	}

	@Transactional
	public int deleteBoard(int boardNo) {
		int result = boardDao.deleteBoard(boardNo);
		return result;
	}

	@Transactional
	public int updateBoard(BoardDTO board) {
		int result = boardDao.updateBoard(board);
		return result;
	}
}
