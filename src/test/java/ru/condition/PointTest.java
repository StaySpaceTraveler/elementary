package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }


    @Test
    void when53to81then3dot6() {
        double expected = 3.6;
        int x1 = 5;
        int y1 = 3;
        int x2 = 8;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }


    @Test
    void when47to19then3dot6() {
        double expected = 3.6;
        int x1 = 4;
        int y1 = 7;
        int x2 = 1;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }


    @Test
    void when26to38then2dot2() {
        double expected = 2.2;
        int x1 = 2;
        int y1 = 6;
        int x2 = 3;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.1));
    }
    }