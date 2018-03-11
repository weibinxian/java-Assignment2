package www.inaroundaboutway.com;

public class CylinderUser {

	public static void main(String[] args) {
	Cylinder a=new Cylinder(4,8);
	 print("height",a.getHeight());
     print("radius at base",a.getRadius());
     print("area",a.calCylinderArea());
     print("vloume",a.calCylinderVolume());
     print("circle underlying area",a.calArea());
     print("circle underlying perimeter",a.calPerimeter());
     
     
	}
     
     
    public static void print(String args,float val)
     {
         System.out.println("Cylinder's "+args+" is "+val+"\n"+"\n");
     }

}
