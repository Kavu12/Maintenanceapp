package fr.r6a06;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void should_return_correct_name(){
        Customer customer = new Customer("Kavu");

        String excepted = "Kavu";
        String name = customer.getName();

        assertEquals(name, excepted);
    }
}