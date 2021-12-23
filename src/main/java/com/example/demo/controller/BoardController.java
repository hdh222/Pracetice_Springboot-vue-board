package com.example.demo.controller;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public Map<String, Object> getBoard(HttpServletRequest req){
        return boardService.getBoard(req);
    }

    @GetMapping("/board/detail/{seq}")
    public Map<String, Object> getData(@PathVariable(value="seq") int seq){

        Map<String, Object> map = new HashMap<>();
        map.put("data", boardService.getData(seq));
        return map;
    }

    @PutMapping("/board/update/{seq}")
    public int update(@PathVariable(value="seq")int seq, @RequestBody Board board){

        board.setSeq(seq);

        return boardService.setData(board);
    }

    @DeleteMapping("/board/delete/{seq}")
    public int delete(@PathVariable(value="seq")int seq){

        return boardService.deleteData(seq);
    }

    @PostMapping("/board/write")
    public void addData(@RequestBody Board board){
        boardService.addData(board);
    }
}
