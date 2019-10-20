package com.lee.service.impl;

import com.lee.pojo.Dept;
import com.lee.pojo.MeetingPub;
import com.lee.service.DeptService;
import com.lee.service.MeetingPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingPubServiceImpl implements MeetingPubService {

    @Autowired
    private DeptService deptService;

    @Override
    public MeetingPub findByPCode(String pCode) {
        MeetingPub meetingPub = new MeetingPub();
        meetingPub.setId(1);
        meetingPub.setPCode(pCode);
        meetingPub.setTitle("学习dubbo");
        meetingPub.setContent("dubbo是一个rpc框架");
        Dept dept = deptService.findById(1);
        meetingPub.setDept(dept);
        return meetingPub;
    }
}
