package com.example.demo.service;



import com.example.demo.entity.Board;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;


public interface BoardService {
    public Map<String, Object> getBoard(HttpServletRequest req);
    public Board getData(int seq);
    public int setData(Board board);
    public int deleteData(int seq);
    public void addData(Board board);
}
