package com.example.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JspController {
    private static final Logger logger = LoggerFactory.getLogger(JspController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(Locale locale, Model model) {
        logger.info("method [" + Thread.currentThread().getStackTrace()[1].getMethodName() + "]");	// 로그에 메소드명 나타내기x
        return "login";
    }

    @RequestMapping(value = "/MainPage", method = RequestMethod.GET)
    public String Main(Locale locale, Model model) {
        logger.info("method [" + Thread.currentThread().getStackTrace()[1].getMethodName() + "]");	// 로그에 메소드명 나타내기x
        return "MainPage";
    }

    @RequestMapping(value = "LocationMarkerCluster.do")
    public String LocationMarkerCluster(Locale locale, Model model) {
        logger.info("method [" + Thread.currentThread().getStackTrace()[1].getMethodName() + "]");	// 로그에 메소드명 나타내기x
        return "LocationMarkerCluster";
    }
    @RequestMapping(value = "loginAction.do")
    public String loginAction(Locale locale, Model model) {
        logger.info("method [" + Thread.currentThread().getStackTrace()[1].getMethodName() + "]");	// 로그에 메소드명 나타내기x
        return "loginAction";
    }

}
