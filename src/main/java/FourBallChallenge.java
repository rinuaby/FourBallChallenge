import processing.core.PApplet;

public class FourBallChallenge extends PApplet{

    private int Width=640;
    private int Height=480;
    private int Diameter=10;
    private int x1=0,x2=0,x3=0,x4=0;
    @Override
    public void settings() {
        super.settings();
        size(Width,Height);
    }

    @Override
    public void setup() {
         background(255);
    }

    @Override
    public void draw() {
        ellipse(x1++,Height/5, Diameter, Diameter);
        ellipse(x2+=2,Height*2/5, Diameter, Diameter);
        ellipse(x3+=3,Height*3/5, Diameter, Diameter);
        ellipse(x4+=4,Height*4/5, Diameter, Diameter);
    }

    
}