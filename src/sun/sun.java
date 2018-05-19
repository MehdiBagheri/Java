package sun;


import processing.core.*;

public class sun extends PApplet{
	private String URL = "https://cseweb.ucsd.edu/~minnes/palmTrees.jpg";
	private PImage backgroundImg;
	public void setup() {
		size(400, 400); //set canvas size
		background(250); // set canvas color
		
		stroke(0); //set pen color
	
		backgroundImg = loadImage(URL, "jpg");
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
	}
	
	public void draw() {
		int [] color = sunColorSec(second());
		
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/5, width/4, height/5);
		
	}
	
	public int[] sunColorSec(float seconds) {
		// set time
		int[] rgb = new int[3];
		
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		return rgb;
	}
	
}
