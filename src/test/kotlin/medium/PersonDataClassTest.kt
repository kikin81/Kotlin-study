package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PersonDataClassTest {
    
    @Test
    fun testPersonCreation() {
        // This test will need to be uncommented once Person class is implemented
        // val person = Person("John", "Doe", 25, "john.doe@example.com")
        // assertEquals("John", person.firstName)
        // assertEquals("Doe", person.lastName)
        // assertEquals(25, person.age)
        // assertEquals("john.doe@example.com", person.email)
    }

    @Test
    fun testFullNameProperty() {
        // val person = Person("Alice", "Smith", 30, "alice@example.com")
        // assertEquals("Alice Smith", person.fullName)
    }

    @Test
    fun testIsAdultMethod() {
        // val adult = Person("Bob", "Johnson", 21, "bob@example.com")
        // val minor = Person("Emma", "Brown", 16, "emma@example.com")
        // assertTrue(adult.isAdult())
        // assertFalse(minor.isAdult())
    }

    @Test
    fun testIsAdultEdgeCase() {
        // val exactlyAdult = Person("Tom", "Wilson", 18, "tom@example.com")
        // assertTrue(exactlyAdult.isAdult())
    }

    @Test
    fun testToStringMethod() {
        // val person = Person("Jane", "Davis", 28, "jane@example.com")
        // val expected = "Person(firstName=Jane, lastName=Davis, age=28, email=jane@example.com)"
        // assertEquals(expected, person.toString())
    }

    @Test
    fun testCreateFromStringFactory() {
        // val data = "Mike,Taylor,35,mike.taylor@example.com"
        // val person = Person.createFromString(data)
        // assertEquals("Mike", person.firstName)
        // assertEquals("Taylor", person.lastName)
        // assertEquals(35, person.age)
        // assertEquals("mike.taylor@example.com", person.email)
    }

    @Test
    fun testDataClassEquality() {
        // val person1 = Person("Sarah", "Connor", 32, "sarah@example.com")
        // val person2 = Person("Sarah", "Connor", 32, "sarah@example.com")
        // val person3 = Person("Sarah", "Connor", 33, "sarah@example.com")
        // assertEquals(person1, person2)
        // assertNotEquals(person1, person3)
    }
}