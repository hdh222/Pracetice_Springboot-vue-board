package com.example.demo.service;

import com.example.demo.vo.Board;

import java.util.List;

public interface BoardService {
    public List<Board> getBoard();
    public Board getData(int seq);
    public int setData(Board board);
    public int deleteData(int seq);
}
