package com.hojune.getinline.dto;

import com.hojune.getinline.constant.ErrorCode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class APIDataResponseTest {

    @DisplayName("문자열 데이터가 주어지면, 표준 성공 웅답을 생성한다.")
    @Test
    void givenStingData_whenCreatingResponse_thenReturnSuccessfulResponse() {
        // Given
        String data = "test data";

        // When
        APIDataResponse<String> response = APIDataResponse.of(data);


        assertThat(response)
                .isNotNull()
                .hasFieldOrPropertyWithValue("success", true)
                .hasFieldOrPropertyWithValue("errorCode", ErrorCode.OK.getCode())
                .hasFieldOrPropertyWithValue("message", ErrorCode.OK.getMessage())
                .hasFieldOrPropertyWithValue("data", data)
        ;

        // Then
    }

    @DisplayName("문자열 데이터가 없을때, 비어있는 표준 성공 웅답을 생성한다.")
    @Test
    void givenNothing_whenCreatingResponse_thenReturnEmptySuccessfulResponse() {
        // Given
        // When
        APIDataResponse<String> response = APIDataResponse.empty();


        assertThat(response)
                .isNotNull()
                .hasFieldOrPropertyWithValue("success", true)
                .hasFieldOrPropertyWithValue("errorCode", ErrorCode.OK.getCode())
                .hasFieldOrPropertyWithValue("message", ErrorCode.OK.getMessage())
                .hasFieldOrPropertyWithValue("data", null)
        ;
        // Then
    }
}