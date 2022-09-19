package net.datafaker.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MilitaryTest extends AbstractBaseFakerTest {

    @Test
    void armyRank() {
        assertThat(faker.military().armyRank()).isNotEmpty();
    }

    @Test
    void marinesRank() {
        assertThat(faker.military().marinesRank()).isNotEmpty();
    }

    @Test
    void navyRank() {
        assertThat(faker.military().navyRank()).isNotEmpty();
    }

    @Test
    void airForceRank() {
        assertThat(faker.military().airForceRank()).isNotEmpty();
    }

    @Test
    void dodPaygrade() {
        assertThat(faker.military().dodPaygrade()).isNotEmpty();
    }

}