package com.pacheco.game.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rect4f {

    private float left;

    private float top;

    private float width;

    private float height;

    public boolean contains(Vector2f vec) {
        return vec.getX() >= left && vec.getX() <= (left + width) && vec.getY() >= top && vec.getY() <= (top + height);
    }

    public float getBottom() {
        return top + height;
    }

    public float getRight() {
        return left + width;
    }

    public boolean intersects(Rect4f rect) {
        return left < rect.getRight() && getRight() > rect.left && top < rect.getBottom() && getBottom() > rect.top;
    }

}
