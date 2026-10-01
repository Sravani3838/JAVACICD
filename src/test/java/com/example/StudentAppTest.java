package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentAppTest {

    @Test
    public void testStudentDetails() {

        String details = StudentApp.getStudentDetails();

        assertTrue(details.contains("B.Tech"));
        assertTrue(details.contains("Computer Science"));
    }
}