package com.epam.unittesting.service;

import com.epam.unittesting.dto.response.UserResponseDto;
import com.epam.unittesting.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;
    @MockBean
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void whenValidUserId_thenUserShouldFound() {
        Long userId = 1L;
        UserResponseDto userResponseDto = userService.get(userId);
        assertEquals(userId, userResponseDto.getId());
    }

}