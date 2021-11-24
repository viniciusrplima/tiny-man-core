package com.pacheco.game.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static java.lang.Math.sqrt;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vector2f {

    private float x;

    private float y;

    public Vector2f add(Vector2f vec) {
        return this.add(vec.x, vec.y);
    }

    public Vector2f add(float x, float y) {
        return new Vector2f(this.x + x, this.y + y);
    }

    public Vector2f minus(Vector2f vec) {
        return this.minus(vec.x, vec.y);
    }

    public Vector2f minus(float x, float y) {
        return new Vector2f(this.x - x, this.y - y);
    }

    public Vector2f invert() {
        return this.scale(-1);
    }

    public Vector2f scale(float s) {
        return new Vector2f(x * s, y * s);
    }

    public Vector2f product(Vector2f vec) {
        return new Vector2f(x * vec.x, y * vec.y);
    }

    public float mod() {
        return (float) sqrt(x*x + y*y);
    }

    public float distance(Vector2f vec) {
        return this.minus(vec).mod();
    }

}
