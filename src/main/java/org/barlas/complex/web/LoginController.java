package org.barlas.complex.web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    @ResponseStatus(HttpStatus.OK)
    public void handle(HttpServletResponse response) {
        
    }

}
