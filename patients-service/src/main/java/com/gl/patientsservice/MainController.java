package com.gl.patientsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
public class MainController {

    @GetMapping("/patients")
    public String doctors(){
        return "List of patients";
    }
}
