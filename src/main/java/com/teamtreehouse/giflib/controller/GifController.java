package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by adhyan on 5/15/16.
 */

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }
}


