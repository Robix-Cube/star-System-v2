public class Planet
{
	double distance,diameter,angle,speed;
	String pColour;
	Planet(double dist,double ang,double size,String col,double spee)
	{
		distance=dist;
		angle=ang;
		diameter=size;
		pColour=col;
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
		return pColour;
	}
	public void movePlanet(SolarSystem s)
	{
		s.drawSolarObject(this.distance,this.angle,this.diameter,this.pColour);
		this.angle+=speed;
	}
}