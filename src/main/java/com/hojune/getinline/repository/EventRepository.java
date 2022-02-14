package com.hojune.getinline.repository;

import com.hojune.getinline.constant.EventStatus;
import com.hojune.getinline.dto.EventDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


//TODO: 인스턴스 생성 편의를 위해 임시로 default사용, repository layer 구현이 완성되면 삭제할 예정
public interface EventRepository {
    default List<EventDTO> findEvents(
            Long placeId,
            String eventName,
            EventStatus eventStatus,
            LocalDateTime eventStartDateTime,
            LocalDateTime eventEndDateTime
    ) {
        return List.of();
    }

    default Optional<EventDTO> findEvent(Long placeId) {
        return Optional.empty();
    }

    default boolean insertEvent(EventDTO eventDTO) {
        return false;
    }

    default boolean updateEvent(Long placeId, EventDTO eventDTO) {
        return false;
    }

    default boolean deleteEvent(Long placeId) {
        return false;
    }

}
