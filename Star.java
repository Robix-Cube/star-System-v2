public class Star
{
	private double distance,diameter,angle;
	String colour="YELLOW";
	Star()
	{
		distance=0;
		angle=0;
		diameter=50;
	}
	public double getDist()
	{
		return distance;
	}
	public double getAng()
	{
		return angle;
	}
	public double getDi()
	{
		return diameter;
	}
	public String getCol()
	{
		return colour;
	}
	public void drawStar(SolarSystem s)
	{
		s.drawSolarObject(this.distance,this.angle,this.diameter,this.colour);
	}
}