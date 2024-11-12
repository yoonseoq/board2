package com.green.board2;

import com.green.board2.model.BoardGetOneRes;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardInsReq;
import com.green.board2.model.BoardPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor// di를 준다

public class BoardService {
    private final BoardMapper mapper;

    public int insBoard(BoardInsReq p){
        return mapper.insBoard(p);
    }
    public List<BoardGetRes> getBoardList(){
        return mapper.getBoardList();
    }
    public BoardGetOneRes getBoardOne(int boardId){
        return mapper.getBoardOne(boardId);
    }

    public int putBoard(BoardPutReq p){
        return mapper.putBoard(p);
    }
}
