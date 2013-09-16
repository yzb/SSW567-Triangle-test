package yzb;

import junit.framework.*;
public class TriangleTest extends TestCase {
    public Triangle triangle = null; 
    public void testIsTriangle01() {
    	triangle = new Triangle(0, 3, 3);
        boolean expected = false;
        boolean result = triangle.isTriangle(triangle);
        boolean actual = result;
        assertEquals(expected, actual);
     }
    public void testType01() {
        triangle = new Triangle(0, 3, 3);
        String expected = "not a triangle.";																
        String result = triangle.isType(triangle);
        String actual = result;
        assertEquals(expected, actual);
    }  
    public void testIsTriangle02() {
    	triangle = new Triangle(3, 3, 3);
        boolean expected = true;
        boolean result = triangle.isTriangle(triangle);
        boolean actual = result;
        assertEquals(expected, actual);
     }
    public void testType02() {
        triangle = new Triangle(3, 3, 3);
        String expected = "equilateral.";																
        String result = triangle.isType(triangle);
        String actual = result;
        assertEquals(expected, actual);
    }   
    public void testIsTriangle03() {
    	triangle = new Triangle(3, 4, 5);
        boolean expected = true;
        boolean result = triangle.isTriangle(triangle);
        boolean actual = result;
        assertEquals(expected, actual);
     }
    public void testType03() {
        triangle = new Triangle(3, 4, 5);
        String expected = "scalene, and it is a right triangle as well.";																
        String result = triangle.isType(triangle);
        String actual = result;
        assertEquals(expected, actual);
    }  
    public void testIsTriangle04() {
    	triangle = new Triangle(3, 4, 6);
        boolean expected = true;
        boolean result = triangle.isTriangle(triangle);
        boolean actual = result;
        assertEquals(expected, actual);
     }
    public void testType04() {
        triangle = new Triangle(3, 4, 6);
        String expected = "scalene, and it is not a right triangle as well.";																
        String result = triangle.isType(triangle);
        String actual = result;
        assertEquals(expected, actual);
    }   
    public void testIsTriangle05() {
    	triangle = new Triangle(1, Math.sqrt(2), 1);
        boolean expected = true;
        boolean result = triangle.isTriangle(triangle);
        boolean actual = result;
        assertEquals(expected, actual);
     }
    public void testType05() {
    	triangle = new Triangle( Math.sqrt(2), Math.sqrt(2)* Math.sqrt(2),  Math.sqrt(2));
        String expected = "isosceles, and it is a right triangle as well.";																
        String result = triangle.isType(triangle);
        String actual = result;
        assertEquals(expected, actual);
    }
    public void testIsTriangle06() {
    	triangle = new Triangle(3, 4, 3);
        boolean expected = true;
        boolean result = triangle.isTriangle(triangle);
        boolean actual = result;
        assertEquals(expected, actual);
     }
    public void testType06() {
        triangle = new Triangle(3, 4, 3);
        String expected = "isosceles, and it is not a right triangle as well.";																
        String result = triangle.isType(triangle);
        String actual = result;
        assertEquals(expected, actual);
    }
}




