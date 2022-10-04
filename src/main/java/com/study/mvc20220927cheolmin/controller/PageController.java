package com.study.mvc20220927cheolmin.controller;

import com.study.mvc20220927cheolmin.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;

@Controller
public class PageController {

    @GetMapping("/test1")
    public String test1(){
        return "test_page1"; //html 불러오기

    }
    @GetMapping("/test2")
    public String test2(){
        System.out.println("test2");
        return "test/test_page2"; //html 불러오기 //경로 재설정
    }

    @GetMapping("/test3")
    public String test3(Model model, @RequestParam String strData, @RequestParam String name){
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute("data",strData);
        model.addAttribute("name", name);
        return "test/test_page3";
    }
    @GetMapping("/test4")
    public String test4(Model model, TestReqDto testReqDto){

        System.out.println(testReqDto);

        model.addAttribute("data",testReqDto.getStrData());
        model.addAttribute("name",testReqDto.getName());
        model.addAttribute("number",testReqDto.getNumber());

        return "test/test_page4";
    }

}
