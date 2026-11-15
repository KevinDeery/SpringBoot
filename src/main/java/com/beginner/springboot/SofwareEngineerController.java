package com.beginner.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/Software-enginners")
public class SofwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(new SoftwareEngineer(1,"js, node, react, tailwindcss","James"),
                       new SoftwareEngineer(2,"java, spring, springboot","Jamila"));
    }

}
