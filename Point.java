public class Point
{
	public static void main(String[] args)
	{
	int windWidth=1000;
	int windHeight=1000;
	int centre=500;
	
	SolarSystem sol=new SolarSystem(windWidth, windHeight);
	Star sun=new Star();
	Planet earth=new Planet(275,90,"GREEN",0.5);
	Planet mars=new Planet(320,257,"RED",0.4);
	Moon theMoon=new Moon(earth.getDist(),earth.getAng(),70,180,earth.getSpeed(),1.2);
	
	while(true)
		{
			sun.drawStar(sol);	
			earth.movePlanet(sol);
			mars.movePlanet(sol);
			theMoon.moveMoon(sol);
			sol.finishedDrawing();
		}
	}
}