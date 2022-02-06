package com.hojune.getinline.service;

import com.hojune.getinline.constant.EventStatus;
import com.hojune.getinline.dto.EventDTO;
import com.hojune.getinline.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EventService {

    private final EventRepository eventRepository;

    public List<EventDTO> getEvents(
            Long placeId,
            String eventName,
            EventStatus eventStatus,
            LocalDateTime eventStartDatetime,
            LocalDateTime eventEndDatetime
    ) {
        return eventRepository.findEvents(
                placeId,
                eventName,
                eventStatus,
                eventStartDatetime,
                eventEndDatetime
        );
    }

    public Optional<EventDTO> getEvent(Long eventId){
        return eventRepository.findEvent(eventId);
    }

    public boolean creatEvent(EventDTO eventDTO){
        return eventRepository.insertEvent(eventDTO);
    }

    public boolean modifyEvent(Long eventId, EventDTO eventDTO){
        return eventRepository.updateEvent(eventId, eventDTO);
    }

    public boolean removeEvent(Long eventId){
        return eventRepository.deleteEvent(eventId);
    }

}