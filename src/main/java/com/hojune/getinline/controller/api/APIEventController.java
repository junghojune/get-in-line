package com.hojune.getinline.controller.api;


import com.hojune.getinline.constant.ErrorCode;
import com.hojune.getinline.dto.APIErrorResponse;
import com.hojune.getinline.exception.GeneralException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @ExceptionHandler
    public ResponseEntity<APIErrorResponse> general(GeneralException e){
        ErrorCode errorCode = e.getErrorCode();
        HttpStatus status = errorCode.isClientSideError() ?
                HttpStatus.BAD_REQUEST :
                HttpStatus.INTERNAL_SERVER_ERROR;

        return ResponseEntity
                .status(status)
                .body(APIErrorResponse.of(
                        false, errorCode, errorCode.getMessage(e)
        ));
    }

}
