package com.AaronGoidel.mka.object_practice;

/**
 * Created by agoidel2019 on 5/22/17.
 */
import com.AaronGoidel.mka.object_practice.Triangle;
import com.AaronGoidel.mka.object_practice.Rectangle;
public class Tester
{
    public static void main(String[] args)
    {
        Triangle t = new Triangle(30, 40);
        System.out.println(t.getArea());

        Rectangle r = new Rectangle(50, 50);
        System.out.println(r.getArea());
    }
}
