package com.AaronGoidel.mka.object_practice;

/**
 * Created by agoidel2019 on 5/22/17.
 */
abstract public class Shape
{
    private double a, b;

    Shape(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    abstract double getArea();
}

class Triangle extends Shape
{

    Triangle(double a, double b)
    {
        super(a, b);
    }

    @Override
    double getArea()
    {
        return (getA() * getB())/2;
    }
}

class Rectangle extends Shape
{
    Rectangle(double a, double b)
    {
        super(a, b);
    }

    @Override
    double getArea()
    {
        return getA() * getB();
    }
}




