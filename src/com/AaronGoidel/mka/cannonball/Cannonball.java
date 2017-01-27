package com.AaronGoidel.mka.cannonball;

/**
 * Created by agoidel2019 on 11/14/16.
 */

import java.util.Scanner;

public class Cannonball
{
    //vars for x & y positions and velocities
    private double x;
    private double y;

    private double xVelocity;
    private double yVelocity;

    //constant for effect of gravity on acceleration
    private final double GRAVITATIONAL_ACCELERATION = -9.81;

    //constructor sets x to user inputted starting value, and runs "shoot" method using angle and velocity from user
    Cannonball(double initialX, double a, double v)
    {
        this.x = initialX;
        this.y = 0;

        shoot(a, v);
    }

    //method to apply velocity to the distance traveled by cannonball
    public void moveBall(double seconds)
    {
        //adds ground covered in n seconds at the current velocity
        setX(x + (xVelocity * seconds));
        setY(y + (yVelocity * seconds));

        //applies effect of gravity to y velocity
        yVelocity += GRAVITATIONAL_ACCELERATION;
    }

    //Getters
    public double getX()
    {
        //returns x... duh
        return x;
    }

    public double getY()
    {
        //guess what this one does? yep that's right it returns the current value of y!!!
        return y;
    }

    //Setters


    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    //Fires Cannonball
    private void shoot(double angle, double initialVelocity)
    {
        //calculates x and y velocities using the angle of fire
        xVelocity = initialVelocity * (Math.cos(angle));
        yVelocity = initialVelocity * (Math.sin(angle));

    }

    public static void main(String[] args)
    {
        //create super awesomely names scanner to take user input
        Scanner inputGetter9000 = new Scanner(System.in);

        //prompt user for initial x value
        System.out.println("Enter a starting 'x' position: ");
        double initialX = inputGetter9000.nextDouble();

        //prompt user for angle of fire
        System.out.println("Enter the angle at which to fire the cannonball: ");
        double angle = inputGetter9000.nextDouble();

        //prompt user for velocity of the shot
        System.out.println("Enter a starting velocity: ");
        double initialV = inputGetter9000.nextDouble();

        //create new cannonball, instance of Cannonball, aptly named... cannonball
        Cannonball cannonball = new Cannonball(initialX, angle, initialV);

        //updates and prints velocity and position of cannonball so long as it has not "hit the ground" otherwise known as y == 0
        do
        {
            System.out.println(cannonball.getX() + " " + cannonball.getY());
            cannonball.moveBall(.1);
        }while(cannonball.getY() > 0);
    }
}
