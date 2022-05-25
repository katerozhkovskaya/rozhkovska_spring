package com.rozhkovska.kate.learningspring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservations")
public class RoomReservationWebController {

    @GetMapping
    public String getReservations() {
        return "reservations";
    }
}
