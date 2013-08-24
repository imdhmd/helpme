package org.kovai.helpme.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReceiveAlertC {
    @RequestMapping(method = RequestMethod.POST, value = "/accident")
    public
    @ResponseBody
    String accidentAlert(){
        return "Acknowledged";
    }
}
