package com.example.demo.repository;


import com.example.demo.entity.Board;
import com.example.demo.util.Paging;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {
    List<Board> getBoard(Paging paging);
    Board getData(int seq);
    int setData(Board board);
    int deleteData(int seq);
    void addData(Board board);
    int getCount();
}
