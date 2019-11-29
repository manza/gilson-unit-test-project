import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste unitário para a Classe Person
 */
class PersonTest {

    @Test
    void testShowNameAndAgeMethod() {
        // Instancia uma classe Person com alguns parametros desejados
        Person p = new Person("Gilson", 20);
        // Chama o método showNameAndAge da classe e armazena a mensagem de saída em uma variável
        final String nameAndAge = p.showNameAndAge();

        // Com Junit fazemos o assert para ter certeza que não é Null o resultado e que
        // a mensagem tem a saída e conteúdo esperado
        assertNotNull(nameAndAge);
        assertEquals("Gilson-20", nameAndAge);
    }
}