package www.inaroundaboutway.com;

public class Cylinder implements Circle{
	protected float radius;
	protected float height;
    /** this is a constructor
     * it inital r equal to radius
     * and inital h equal to height
     * @param r is a value of float type
     * @param h is a value of float type
     */
	
	public Cylinder(float r,float h)
	{
		radius=r;
		height=h;
	}
    /** getRadius method
     * used to retrieve the value of the radius
     * @return the value of radius
     */
	public float getRadius() {
		return radius;
	}
    /** getHeight method
     * used to retrieve the value of the height
     * @return the value of height
     */
	public float getHeight()
	{
		return height;
	}
    /** setRadius method
     * recieve a type of double
     * and inital it to side
     * @param s double type
     */
	public float setRadius(float r)
	{
		return this.radius=r;
		
	}
	public float calArea()
	{
		return (float) ( (OUR_PI_CONSTANT*radius*radius));
	}
	public float calPerimeter()
	{
		return (float) (2*OUR_PI_CONSTANT*radius);
	}
	public float calCylinderArea()
	{
		return (float) ( (calPerimeter()*height)+
				(2*calArea()));
	}
	public float calCylinderVolume()
	{
		return (float) (calArea()*height);
	}
}
