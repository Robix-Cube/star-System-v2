public class Point
{
	public static void main(String[] args)
	{
	//init window size
	int windWidth=1000;
	int windHeight=1000;
	
	SolarSystem sol=new SolarSystem(windWidth, windHeight);
	//initialising all objects in solar system

	Star sun=new Star();
	Planet earth=new Planet(275,90,22,"GREEN",0.3);
	Planet mars=new Planet(320,257,20,"RED",0.4);
	Planet mercury=new Planet(100,158.2,15,"GRAY",0.7);
	Planet venus=new Planet(140,12,20,"PINK",0.7);
	Moon theMoon=new Moon(earth.getDist(),earth.getAng(),70,180,earth.getSpeed(),1.2);
	
	while(true)
		{
			sun.drawStar(sol);	
			earth.movePlanet(sol);
			mars.movePlanet(sol);
			theMoon.moveMoon(sol);
			mercury.movePlanet(sol);
			venus.movePlanet(sol);
			sol.finishedDrawing();
		}
	}
}