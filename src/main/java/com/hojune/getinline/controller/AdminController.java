package com.hojune.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/place")
    public String adminPlaces() {
        return "admin/places";
    }

    @GetMapping("/place/{placeId}")
    public String adminPlacesDetail(@PathVariable Integer placeId) {
        return "admin/places-detail";
    }

    @GetMapping("/events")
    public String adminEvents() {
        return "admin/events";
    }

    @GetMapping("/events/{eventId}")
    public String adminEventsDetail(@PathVariable Integer eventId) {
        return "admin/event-detail";
    }
}
