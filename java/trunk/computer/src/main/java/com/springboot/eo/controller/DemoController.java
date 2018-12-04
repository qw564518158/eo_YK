package com.springboot.eo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ChenJunXian
 * @create 2018-08-23 16:23
 **/
@Controller
@RequestMapping("aaa")
public class DemoController extends Thread{
    @RequestMapping("sss.json")
    @ResponseBody
    public String sss(){
        String d= "hello,wolrd ";
        return d;
    }

    public String text;
    public int num;

    DemoController(String text1,Integer num1){
        text = text1;
        num = num1;
    }

    DemoController(){

    }

    @Override
    public void run(){
        try {
            for(;;){
                System.out.println(text + "   ");
                sleep(num);

                num++;
                System.out.println(num);
                if(num == 200){
                    wait(num);
                }
                synchronized (text.getClass()){

                }
            }
        }catch (Exception e){

        }
    }

    public static void main(String[] args) {
        new DemoController("ping" , 33).start();
        new DemoController("inokim" , 100).start();
    }


}

 