package net.datafaker.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpsonsTest extends AbstractBaseFakerTest {

    @Test
    void character() {
        assertThat(faker.simpsons().character()).isNotEmpty();
    }

    @Test
    void location() {
        assertThat(faker.simpsons().location()).isNotEmpty();
    }

    @Test
    void quote() {
        assertThat(faker.simpsons().quote()).isNotEmpty();
    }
}