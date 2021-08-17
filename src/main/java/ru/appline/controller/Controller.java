package ru.appline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.appline.logic.Compass;
import ru.appline.logic.Model;

import java.util.HashMap;

@RestController
public class Controller {
    private static final Model model = Model.getInstance();
    /*
    {
        "North": [337,23],
        "North-East": [23,68],
        "East":  [68,113],
        "South-East": [113,158],
        "South": [158,203],
        "South-West": [203,248],
        "West": [248,293],
        "North-West": [293,337]
    }
     */

    @PostMapping(value = "/setCompass", consumes = "application/json", produces = "application/json")
    public Compass setCompass(@RequestBody Compass compass) {
        model.setCompass(compass);

        return model.getCompass();

    }

    /*

    {
        "Degree": 150
    }
     */
    @GetMapping(value = "/getDirection", consumes = "application/json", produces = "application/json")
    public String getDirection(@RequestBody HashMap<String, Integer> degree) {
       return "{ \n\"Direction\": \"" + model.getDirection(degree.get("Degree")) +"\"\n}";

    }
}
