import java.util.*;
class VolOfCylinder1
{
public static void main(String args[])
{
Double r,h,v;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Radius of box:");
r = sc.nextDouble();
System.out.println("Enter Heigth of box:");
h = sc.nextDouble();
v = 3.14 * r * r * h;
System.out.println("Volume of Box:"+v);
}
}
