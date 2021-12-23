package com.example.demo.service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;
import com.example.demo.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public Map<String, Object> getBoard(HttpServletRequest req) {

        Paging paging = new Paging();

        int pageNum = 1;    //페이지 번호 초기화
        int pageRowCount = paging.getPageRowNum();  //페이지당 보여줄 데이터 개수
        int totalRow = boardRepository.getCount();
        int startRow;
        int endRow;

        int startPageNum;
        int endPageNum;
        int totalPageNum;
        int pageDisplayCount;


        //페이지 번호 파라미터 확인
        String strPageNo = req.getParameter("pageNum");
        if(strPageNo != null){
            pageNum = Integer.parseInt(strPageNo);
        }

        startRow = 1 + (pageNum - 1) * pageRowCount;    //데이터의 시작 RowNum
        endRow = pageNum * pageRowCount;    //데이터의 끝 RowNum

        paging.setPageNo(pageNum);
        paging.setStartRowNum(1 + (pageNum));
        paging.setStartRowNum(startRow);
        paging.setEndRowNum(endRow);

        //페이징 처리 된 데이터
        List<Board> list = boardRepository.getBoard(paging);

        pageDisplayCount = paging.getPageDisplayCount();
        totalPageNum = (int)Math.ceil(totalRow / (double)pageRowCount);
        if(totalPageNum % pageRowCount > 0 ){
            totalPageNum++;
        }

        //페이지 번호 계산
        startPageNum = 1 + ((pageNum - 1) / pageDisplayCount) * pageDisplayCount;
        endPageNum = startPageNum + pageDisplayCount - 1;

        if(totalPageNum < endPageNum){
            endPageNum = totalPageNum;
        }

        //하단 디스플레이 페이지 리스트
        List<Integer> page = new ArrayList<>();
        for(int i = startPageNum; i < endPageNum; i++){
            page.add(i);
        }

        Map<String, Object> map = new HashMap<>();

        map.put("list", list);
        map.put("page", page);
        return map;
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

    @Override
    public void addData(Board board) {
        System.out.println(board);
        boardRepository.addData(board);
    }

}
