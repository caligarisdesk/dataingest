package com.cdsk.controller;

import com.cdsk.model.TemperatureDatum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello-world")
public class IngestController {

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody TemperatureDatum sayHello(@RequestParam(value="name", required=false, defaultValue="20.0") double temp) {
        return TemperatureDatum
                .builder()
                .x(1)
                .y(2)
                .temp(temp)
                .build();
    }
}

