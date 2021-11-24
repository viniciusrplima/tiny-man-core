package com.pacheco.game.core;

import com.pacheco.game.core.Rect4f;
import com.pacheco.game.core.Vector2f;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Rect4fTest {

    @Test
    public void testContains() {
        Rect4f rect = new Rect4f(2, 2, 4, 4);
        Vector2f vector1 = new Vector2f(3, 3);
        Vector2f vector2 = new Vector2f(7, 3);
        Vector2f vector3 = new Vector2f(3, 7);
        Vector2f vector4 = new Vector2f(0, 0);

        assertTrue(rect.contains(vector1));
        assertFalse(rect.contains(vector2));
        assertFalse(rect.contains(vector3));
        assertFalse(rect.contains(vector4));
    }

    @Test
    public void testIntersects() {
        Rect4f rect1 = new Rect4f(2, 0, 2, 5);
        Rect4f rect2 = new Rect4f(0, 2, 5, 2);
        Rect4f rect3 = new Rect4f(5, 5, 2, 2);
        Rect4f rect4 = new Rect4f(3, 3, 3, 3);

        assertTrue(rect1.intersects(rect2));
        assertTrue(rect2.intersects(rect1));
        assertFalse(rect1.intersects(rect3));
        assertFalse(rect3.intersects(rect1));
        assertTrue(rect1.intersects(rect4));
        assertTrue(rect4.intersects(rect1));
        assertTrue(rect3.intersects(rect4));
        assertTrue(rect4.intersects(rect3));
    }

}
