package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SubTest {

    @Test
    void test() {
        int a = 3;
        int b = 5;
        assertThat(a + b).isEqualTo(10); // 테스트 실패 예
    }
}
