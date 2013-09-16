/**
 * 
 */
/**
 * @author Yzb
 *
 */
package yzb;
import java.lang.Math;
import java.math.BigDecimal;
public class Triangle
{
	protected double A=0;
	protected double B=0;
	protected double C=0;
	
	public Triangle(double A,double d,double C)
	{
		this.A=A;
		this.B=d;
		this.C=C;
	}
	
	public boolean isTriangle(Triangle triangle)
	{
		boolean isTrue=false;
		if((triangle.A<(triangle.B+triangle.C))
				&&(triangle.B<(triangle.A+triangle.C))
				&&(triangle.C<(triangle.A+triangle.B)))
			isTrue=true;
		return isTrue;
	}
	
	public String isType(Triangle triangle)
	{
		String strType="not a triangle.";
		if(this.isTriangle(triangle))
		{
			if(triangle.A==triangle.B&&triangle.B==triangle.C)
				strType="equilateral.";
			else if((triangle.A!=triangle.B)&&
					(triangle.B!=triangle.C)&&
					(triangle.A!=triangle.C))
			{
				if((triangle.A*triangle.A==triangle.B*triangle.B+triangle.C*triangle.C)
				  ||(triangle.B*triangle.B==triangle.A*triangle.A+triangle.C*triangle.C)
				  ||(triangle.C*triangle.C==triangle.A*triangle.A+triangle.B*triangle.B))
					strType="scalene, and it is a right triangle as well.";
				else
					strType="scalene, and it is not a right triangle as well.";
			}
			else
			{
				if((Math.abs((triangle.A*triangle.A-(triangle.B*triangle.B+triangle.C*triangle.C)))<0.0001)
				  ||(Math.abs((triangle.B*triangle.B-(triangle.A*triangle.A+triangle.C*triangle.C)))<0.0001)
				  ||(Math.abs((triangle.C*triangle.C-(triangle.A*triangle.A+triangle.B*triangle.B)))<0.0001))
					strType="isosceles, and it is a right triangle as well.";
				else
					strType="isosceles, and it is not a right triangle as well.";
			}
		}
		return strType;
    }
	
	public static void main(String args[])
	{
		//BigDecimal a = new BigDecimal(1000);
		//return a.doubleValue();
		Triangle tri = new Triangle(1,Math.sqrt(2),1);
		//if ( tri.isTriangle(tri) )
		System.out.println("This is "+tri.isType(tri));
		//else 
			//System.out.println("This is not triangle.");	
	}

}
    