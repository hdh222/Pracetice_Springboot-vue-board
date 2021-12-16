package com.example.demo.repository;

import com.example.demo.vo.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {
    List<Board> getBoard();
    Board getData(int seq);
    int setData(Board board);
    int deleteData(int seq);
    void addData(Board board);
}
