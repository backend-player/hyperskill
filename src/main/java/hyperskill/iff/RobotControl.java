/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyperskill.iff;

/**
 *
 * @author Rizky
 */

public class RobotControl {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        int toX = 10;
        int toY = 10;
        
        while (robot.getDirection() != Direction.UP) {            
            robot.turnRight();
        }
        
        System.out.println(robot.getDirection());
                
        if (robot.getX() < toX) {
            robot.turnRight();
            
            while (robot.getX() < toX) {                
                robot.stepForward();
            }  
            robot.turnLeft();
            
        } else if (robot.getX() > toX) {
            robot.turnLeft();
            
            while (robot.getX() > toX) {                
                robot.stepForward();
            }
            robot.turnRight();
            
        }
        
        if (robot.getY() < toY) {
            
            while (robot.getY() < toY) {                
                robot.stepForward();
            }
            
        } else if (robot.getY() > toY) {
            robot.turnRight();
            robot.turnRight();
            
            while (robot.getY() > toY) {                
                robot.stepForward();
            }
            
        }

        System.out.println(robot.getX() + "," + robot.getY());
    }
}
class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        robot.stepForward(); // your implementation here
        
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
