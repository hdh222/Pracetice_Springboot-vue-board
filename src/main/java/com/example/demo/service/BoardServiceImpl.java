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

    @Override
    public Board getData(int seq) {
        return boardRepository.getData(seq);
    }

    @Override
    public int setData(Board board) {
        return boardRepository.setData(board);
    }

    @Override
    public int deleteData(int seq) {
        return boardRepository.deleteData(seq);
    }

}
