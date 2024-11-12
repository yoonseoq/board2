package com.green.board2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardGetRes {
    private int boardId;
    private String title;
    private String content;
    private String writer;
    private String createdAt;
}
