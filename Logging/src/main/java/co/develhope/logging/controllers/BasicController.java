package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    BasicService basicService;

    @GetMapping("/")
    public String welcomeMsg(){
        logger.info("This is the welcome message");
        return"Welcome user!";
    }

    @GetMapping("/exp")
    public Integer getExponent(){
        return basicService.calculateExponent();
    }

    @GetMapping("/get-errors")
    public void throwCustomException()throws Exception{
        logger.error("A custom exception has been throw");
        throw new Exception("This is a custome error!");
    }

}