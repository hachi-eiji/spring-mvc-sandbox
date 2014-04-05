package com.hachiyae.spring.sandbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(Model model) throws Exception {
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public Map<String, String[]> post(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println(request.getParameterValues("bars[0][id]")[0]);
        return request.getParameterMap();
    }
}
