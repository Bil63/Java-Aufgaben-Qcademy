package de.qcademy.oop;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void zunehmen() {
        //3As
        //Arrange
       Person max = new Person("Max", "Müller", 80.0, LocalDate.of(1998, 12,19));
       double expectedResult = 85;
        //Act
        max.zunehmen(5);
        //Assert
        assertEquals(expectedResult, max.getGewicht());
    }

    @Test
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