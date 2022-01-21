package com.hojune.getinline.controller.error;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BaseErrorController.class)
class BaseErrorControllerTest {

    private final MockMvc mvc;

    public BaseErrorControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @DisplayName("[view] [GET] 에러 페이지 - 페이지 없음")
    @Test
    void giveWrongURI_whenRequestingPage_ThenReturns404ErrorPage(@Autowired MockMvc mvc) throws Exception {
        // Given

        // When & Then
        mvc.perform(get("/wrong-url"))
                .andExpect(status().isNotFound())
                .andDo(print());


    }

}