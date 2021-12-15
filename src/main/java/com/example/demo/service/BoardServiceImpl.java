package com.example.demo.service;

import com.example.demo.repository.BoardRepository;
import com.example.demo.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<Board> getBoard() {
        return boardRepository.getBoard();
    }
}
