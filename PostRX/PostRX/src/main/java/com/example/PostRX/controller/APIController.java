package com.example.PostRX.controller;

import com.example.PostRX.model.Parking;
import org.springframework.web.bind.annotation.*;

import static com.example.PostRX.model.Parking.returnPlace;


@RestController
public class APIController {

    Parking park = new Parking();


    @PostMapping("/park")
    public String parkMethod(@RequestBody Parking parking) {
        System.out.println(parking);
        var res = park.getPlace() - parking.getCar();
        returnPlace(res);
        if (res < 0) {
            res = 0;
            return "Свободный парковачный мест 0 ";
        }

        return "Свободный парковачный мест " + res;
    }

    @PostMapping("/unpark")
    public String unparkMethod(@RequestBody Parking parking) {
        System.out.println(parking);
        var res = park.getPlace() + parking.getCar();
        returnPlace(res);
        return "Свободный парковачный мест " + res;
    }
    @GetMapping("/free")
    public String freeMethod(@RequestParam(name = "question", required = false) String question) {

        return "Свободный парковачный мест " + park.getPlace();


    }


}