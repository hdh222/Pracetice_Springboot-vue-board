package com.example.demo.entity;

import lombok.Data;

@Data
public class Board {
    private int seq;    //글 번호
    private String title;   //글 제목
    private String content; //글 내용
    private String writer;  //작성자
    private String regdate; //등록일
}
