package com.green.board2.model;

import lombok.Getter;
import lombok.Setter;
// 제목 내용 작성자 수정 가능하도록
@Getter
@Setter
public class BoardPutReq {
    private int boardId;
    private String title;
    private String contents;
    private String writer;
}
