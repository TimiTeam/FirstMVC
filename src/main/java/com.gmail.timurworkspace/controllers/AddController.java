package com.gmail.timurworkspace.controllers;



import com.gmail.timurworkspace.service.AddService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AddController {

    private static final Logger LOGGER = Logger.getLogger(AddController.class);


    @RequestMapping("add")
    public ModelAndView add(HttpServletRequest request,HttpServletResponse response){

        LOGGER.info("In: 'add()' method, class:  "+getClass().getSimpleName());

        int i = Integer.parseInt(request.getParameter("t1"));
        LOGGER.info(i);

        int j = Integer.parseInt(request.getParameter("t2"));
        LOGGER.info(j);

        AddService as = new AddService();

        LOGGER.info(as.add(i,j));

        ModelAndView mv = new ModelAndView();
        mv.addObject("res",as.add(i,j));
        mv.setViewName("display.jsp");

        return mv;
    }
}
