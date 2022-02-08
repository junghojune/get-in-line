package com.hojune.getinline;

import com.hojune.getinline.repository.EventRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class GetInLineApplicationTests {


    @Test
    void contextLoads() {

    }

    //TODO: 불필요 해지면 지울 것
    @TestConfiguration
    static class TestConfig {
        @Bean
        EventRepository eventRepository() {
            return new EventRepository() {};
        }
    }

}
