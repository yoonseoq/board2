package com.green.board2;

import com.green.board2.model.BoardGetOneRes;
import com.green.board2.model.BoardGetRes;
import com.green.board2.model.BoardInsReq;
import com.green.board2.model.BoardPutReq;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/board")
@RestController
@RequiredArgsConstructor//di를 받아야한다
public class BoardController {
   private final BoardService service;

   @PostMapping
   public int insBoard(@RequestBody BoardInsReq p){
      System.out.println(p);
      return service.insBoard(p);
   }
   @GetMapping
   public List<BoardGetRes> getResList(){
      System.out.println("getResList");
      return service.getBoardList();
   }
   @GetMapping("{boardId}") // 주소값이 나오는 GetMapping 을 사용하자
   public BoardGetOneRes getOne(@PathVariable int boardId){
      return service.getBoardOne(boardId);
   }
   @PutMapping
   public int putBoard(@RequestBody BoardPutReq p){
      return service.putBoard(p);
   }

}
