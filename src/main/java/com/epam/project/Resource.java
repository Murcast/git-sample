package com.epam.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/resource")
public class Resource {

    @GetMapping("/get")
    public String method() {
        return "stored data";
    }

    @GetMapping("/getList")
    public List<String> listMethod() {
        return new ArrayList<String>(){{
            this.add("first record");
            this.add("second record");
            this.add("third record");
            this.add("fourth record");
            this.add("fifth record");
            this.add("sixth record");
        }};
    }
}
