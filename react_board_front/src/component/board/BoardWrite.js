import { useState } from "react";

const BoardWrite = () => {
  const [boardTitle, setBoardTitle] = useState("");
  const [boardContent, setBoardContent] = useState("");
  const [boardWriter, setBoardWriter] = useState("");
  const changeTitle = (e) => {
    setBoardTitle(e.target.value);
  };
  const changeContent = (e) => {
    setBoardContent(e.target.value);
  };
  const changeWriter = (e) => {
    setBoardWriter(e.target.value);
  };
  return (
    <div className="board-write-wrap">
      <h3>글쓰기</h3>
      <div className="board-write">
        <div className="input-wrap">
          <label htmlFor="boardTitle">제목</label>
          <input
            type="text"
            id="boardTitle"
            value={boardTitle}
            onChange={changeTitle}
          ></input>
        </div>
        <div className="input-wrap">
          <label htmlFor="boardWriter">작성자</label>
          <input
            type="text"
            id="boardWriter"
            value={boardWriter}
            onChange={changeWriter}
          ></input>
        </div>
        <div className="input-wrap">
          <label htmlFor="boardContent">내용</label>
          <textarea
            value={boardContent}
            onChange={changeContent}
            id="boardContent"
          ></textarea>
        </div>
      </div>
    </div>
  );
};

export default BoardWrite;
