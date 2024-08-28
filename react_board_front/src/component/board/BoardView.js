import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

const BoardView = () => {
  const params = useParams();
  const boardNo = params.boardNo;
  const [board, setBoard] = useState({
    /* 테스트데이터라 DB에서 불러온 거 확인되면 지우기
    boardNo: 10,
    boardTitle: "게시글10",
    boardContent: "내용내용내용",
    boardWriter: "user01",
    boardDate: "2024-08-27 16:14:54",
    */
  });
  useEffect(() => {
    axios
      .get("http://192.168.10.26:9999/board/view/" + boardNo)
      .then((res) => {
        console.log(res);
        setBoard(res.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);
  return (
    <div className="board-view-wrap">
      <h3>게시글 상세보기</h3>
      <div className="board-view">
        <table>
          <tbody>
            <tr>
              <th>제목</th>
              <td colSpan={5}>{board.boardTitle}</td>
            </tr>
            <tr>
              <th>글번호</th>
              <td>{board.boardNo}</td>
              <th>작성자</th>
              <td>{board.boardWriter}</td>
              <th>작성일</th>
              <td>{board.boardDate}</td>
            </tr>
            <tr>
              <th>내용</th>
              <td colSpan={5}>
                <div className="board-content">{board.boardContent}</div>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default BoardView;
