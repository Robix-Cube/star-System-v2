public class Moon
{
	double distance,diameter,angle,orbitAngle,orbitDistance,speed,orbitSpeed;
	String colour="GRAY";
	Moon(double dist,double ang,double orbitDis, double orbitAng, double spee, double orbitSpee)
	{
		distance=dist;
		angle=ang;
		diameter=8.5;
		orbitDistance=orbitDis;
		orbitAngle=orbitAng;
		speed=spee;
		orbitSpeed=orbitSpee;
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
	public void moveMoon(SolarSystem s)
	{
		s.drawSolarObjectAbout(this.distance,this.angle,this.diameter,this.colour,this.orbitDistance,this.orbitAngle);
		this.angle+=speed;
		this.orbitAngle+=orbitSpeed;
	}
}