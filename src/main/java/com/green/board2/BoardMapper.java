package com.green.board2;

import com.green.board2.model.BoardGetOneRes;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardInsReq;
import com.green.board2.model.BoardPutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // 매퍼를 애노테이션 해야함
public interface BoardMapper {
    int insBoard(BoardInsReq p);
    List<BoardGetRes> getBoardList();
    BoardGetOneRes getBoardOne(int boardId); //pk값
    int putBoard(BoardPutReq p);
}
