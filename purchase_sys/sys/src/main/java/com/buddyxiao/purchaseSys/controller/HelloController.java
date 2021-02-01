package com.buddyxiao.purchaseSys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/")
    public String hello(Model model, HttpServletRequest request) {
        model.addAttribute("hello", "hello springmvc");
        HttpSession session = request.getSession();
        session.setAttribute("contextPath",request.getContextPath());
        return "hello";
    }

    /**
     * 跳转至login.html
     * @return
     */
    @RequestMapping("/loginPage")
    public String login() {
        return "login";
    }

    /**
     * 跳转至info.html
     * @return
     */
    @RequestMapping("/infoPage")
    public String infoPage() {
        return "info";
    }
}
