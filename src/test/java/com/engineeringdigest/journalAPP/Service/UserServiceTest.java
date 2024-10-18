package com.engineeringdigest.journalAPP.Service;

import com.engineeringdigest.journalAPP.Repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTest {


    @Autowired

    private UserRepository userRepository;

    @Disabled
    @Test
    public void testFindByUserName() {
        assertEquals(4, 2 + 2);
        assertNotNull(userRepository.findByUserName("kunal"));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "ram",
            "shyam",
            "kunal"
    })

    public void testFindByUserName1(String name) {
        assertNotNull(userRepository.findByUserName(name));
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "10,2,12",
            "3,3,9"
    })
    public void test(int a, int b, int expected) {
        assertEquals(expected, a + b);
    }
}
