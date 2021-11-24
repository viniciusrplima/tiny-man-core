package com.pacheco.game.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Vector2fTest {

    @Test
    public void testDistance() {
        Vector2f vec1 = new Vector2f(2, 2);
        Vector2f vec2 = new Vector2f(-5, 2);
        Vector2f vec3 = new Vector2f(2, -1);

        assertEquals(7, vec1.distance(vec2), 0.1);
        assertEquals(3, vec1.distance(vec3), 0.1);
    }

}
