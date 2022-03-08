package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetName() {
        // Given
        String expected = "Toto";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetAge() {
        // Given
        Integer expected = 32;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFavoriteFood() {
        // Given
        String expected = "Pears";

        // When
        Person person = new Person();
        person.setFavoriteFood(expected);

        // Then
        String actual = person.getFavoriteFood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteFood() {
        // Given
        String expected = "Pears";

        // When
        Person person = new Person();
        person.setFavoriteFood(expected);

        // Then
        String actual = person.getFavoriteFood();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFavoriteColor() {
        // Given
        String expected = "Pink";

        // When
        Person person = new Person();
        person.setFavoriteColor(expected);

        // Then
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteColor() {
        // Given
        String expected = "Orange";

        // When
        Person person = new Person();
        person.setFavoriteColor(expected);

        // Then
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFavoriteHoliday() {
        // Given
        String expected = "Christmas";

        // When
        Person person = new Person();
        person.setFavoriteHoliday(expected);

        // Then
        String actual = person.getFavoriteHoliday();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavoriteHoliday() {
        // Given
        String expected = "New Year's";

        // When
        Person person = new Person();
        person.setFavoriteHoliday(expected);

        // Then
        String actual = person.getFavoriteHoliday();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetHairColor() {
        // Given
        String expected = "White";

        // When
        Person person = new Person();
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHairColor() {
        // Given
        String expected = "Gray";

        // When
        Person person = new Person();
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPets() {
        // Given
        Boolean expected = true;

        // When
        Person person = new Person();
        person.setPets(expected);

        // Then
        Assert.assertTrue(person.getPets());
    }

    @Test
    public void testSetPets() {
        // Given
        Boolean expected = false;

        // When
        Person person = new Person();
        person.setPets(true);
        person.setPets(expected);

        // Then
        Assert.assertFalse(person.getPets());
    }
}
