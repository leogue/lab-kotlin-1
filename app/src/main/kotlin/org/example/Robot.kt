package org.example

class Robot {

    private var _direction: Direction
    private var _x: Int // East is positive, West is negative
    private var _y: Int // North is positive, South is negative


    constructor(direction: Direction, x: Int, y: Int) {
        this._direction = direction

        if (x >= -100 && x <= 100) {
            this._x = x
        } else {
            throw IllegalArgumentException("X coordinate out of bounds")
        }

        if (y >= -100 && y <= 100) {
            this._y = y
        } else {
            throw IllegalArgumentException("Y coordinate out of bounds")
        }
    }

    override fun toString(): String {
        return "Robot(direction=$_direction, x=$_x, y=$_y)"
    }

    // getters
    fun getDirection(): Direction { return _direction }
    fun getX(): Int { return _x }
    fun getY(): Int { return _y }


    fun turn(turn: String) {
        when (turn) {
            "L" -> _direction = Direction.entries[(_direction.ordinal + 1) % 4]
            "R" -> _direction = Direction.entries[(_direction.ordinal + 3) % 4]
        }
    }


    fun advance() {
        when (_direction) {
            Direction.NORTH -> _y += 1
            Direction.EAST -> _x += 1
            Direction.SOUTH -> _y -= 1
            Direction.WEST -> _x -= 1
        }
    }


    fun handleCommand(command: String) {
        when (command) {
            "L" -> turn("L")
            "R" -> turn("R")
            "A" -> advance()
        }
    }

}