package com.lee.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class MeetingPub implements Serializable {

    private Integer id;
    private String pCode;
    private String title;
    private String content;

    private Dept dept;

}
