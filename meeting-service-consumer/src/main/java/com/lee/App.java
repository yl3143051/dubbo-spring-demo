package com.lee;

import com.lee.pojo.MeetingPub;
import com.lee.service.MeetingPubService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[] {"classpath:consumer.xml"});
        context.start();
        MeetingPubService meetingPubService = context.getBean(MeetingPubService.class); // 获取远程服务代理
        MeetingPub byPCode = meetingPubService.findByPCode("10011");
        System.out.println("远端程序调用成功");
        System.out.println(byPCode);
        System.in.read();
    }
}
