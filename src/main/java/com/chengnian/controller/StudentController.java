package com.chengnian.controller;


import com.chengnian.model.SchoolBean;
import com.chengnian.model.SchoolBeanRepository;
import com.chengnian.model.StudentBean;
import com.chengnian.model.StudentBeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    public StudentBeanRepository stu;
    @Autowired
    public SchoolBeanRepository sch;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(ModelMap map){
        List<StudentBean> s = stu.findAll();
        List<SchoolBean> sc = sch.findAll();
        map.addAttribute("s",s);
        map.addAttribute("sc",sc);
        return "index";
    }
}
