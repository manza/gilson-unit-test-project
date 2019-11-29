import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testShowNameAndAgeMethod() {
        Person p = new Person("Gilson", 20);
        final String nameAndAge = p.showNameAndAge();
        assertNotNull(nameAndAge);
        assertEquals("Gilson-20", nameAndAge);
    }
}