package com.example.demo.util;

import lombok.Data;

@Data
public class Paging {
    //한 페이지에 나타낼 row 개수
    final int pageRowNum = 5;
    //하단 디스플레이 페이지 개수
    final int pageDisplayCount = 5;

    //페이지 번호
    private int pageNo;
    //보여줄 페이지 데이터의 시작 row번호
    private int startRowNum;
    //보여줄 페이지 데이터의 끝 row번호
    private int endRowNum;

    //검색에 필요한 변수
    private int keyword;
    private int keywordType;
}
