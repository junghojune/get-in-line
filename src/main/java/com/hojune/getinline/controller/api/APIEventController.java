package com.hojune.getinline.controller.api;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class APIEventController {

    @GetMapping("/events")
    public List<String> getEvent(){
        return List.of("event1", "event2");
    }

    @PostMapping("/events")
    public boolean creatEvent(){
        return true;
    }

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable Integer eventId){
        return "place" + eventId;
    }

    @PutMapping("/events/{eventId}")
    public Boolean modifyEvent(@PathVariable Integer eventId){
        return true;
    }

    @DeleteMapping("/events/{eventId}")
    public Boolean removeEvent(@PathVariable Integer eventId){
        return true;
    }
}
