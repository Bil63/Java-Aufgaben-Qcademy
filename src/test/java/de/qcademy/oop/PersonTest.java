package de.qcademy.oop;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void zunehmen() {
        //3As
        //Arrange
       Person max = new Person("Max", "Müller", 80, LocalDate.now());
       double expectedResult = 85;
        //Act
        max.zunehmen(5);
        //Assert
        assertEquals(expectedResult, max.setGewicht());
    }

    @org.junit.jupiter.api.Test
    void abnehmen() {
    }

    @Test
    void testZunehmen() {
    }

    @Test
    void testZunehmen1() {
    }

    @Test
    void testZunehmen2() {
    }
}