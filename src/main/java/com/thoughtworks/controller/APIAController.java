package com.thoughtworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/apia")
public class APIAController {

    @RequestMapping(value= "/index", method = RequestMethod.GET)
    public String onPage(HttpServletRequest request) {
        return "index";
    }
}
