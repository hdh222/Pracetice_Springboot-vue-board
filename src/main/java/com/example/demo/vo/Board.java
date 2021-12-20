package com.example.demo.vo;

import lombok.Data;

@Data
public class Board {
    private int seq;
    private String title;
    private String content;
    private String writer;
    private String regdate;
}
