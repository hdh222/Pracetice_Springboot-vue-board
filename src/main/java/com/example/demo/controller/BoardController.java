package com.example.demo.controller;

import com.example.demo.service.BoardService;
import com.example.demo.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public List<Board> getBoard(){
        return boardService.getBoard();
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
