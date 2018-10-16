public class Planet
{
	double distance,diameter,angle,speed;
	String colour;
	Planet(double dist,double ang,String col,double spee)
	{
		distance=dist;
		angle=ang;
		diameter=35;
		colour=col;
		speed=spee;
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
	public double getSpeed()
	{
		return speed;
	}
	public String getCol()
	{
		return colour;
	}
	public void movePlanet(SolarSystem s)
	{
		s.drawSolarObject(this.distance,this.angle,this.diameter,this.colour);
		this.angle+=speed;
	}
}