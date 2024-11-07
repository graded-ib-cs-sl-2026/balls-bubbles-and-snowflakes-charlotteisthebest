import processing.core.PApplet;

public class Sketch extends PApplet {

    /** Represents 4 balls */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
      /** Represents 4 bubbles  */
    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;
      /** Represents 4 snow flakes */
    private Snowflake sf1; 
    private Snowflake sf2;
    private Snowflake sf3;
    private Snowflake sf4;
      /** Represents one Santa */
    private Santa s1;

    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);

    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
        public void setup() {  
        /**from Ball.java you can create a ball object with the following arguments 
        this first one is THIS wich is the sketch and the second perameter is the RADIUS the third one is THE X position 
        the fourth one is the Y POSITION the 5th nd 6th ones are the X AND Y SPEEDS  
         for the color I used the set setColors() method the this.color represents that i am changing the color of a ball in that window
          and the colors have to be less than 255 all the diferent numbers represent red blue or green */
        ball1 = new Ball(this); 
        /**  One has to be careful when selecting radius, x and y positions, as this will impact the movement of the object 
         *  the definition of move() method for Ball, Bubble etc to determine best radius and positions for each object
         */
        ball2 = new Ball(this, 15, 10, 20, 5, 8);
        ball2.setColors(this.color(150,55,100),this.color(20,78,99)); 
        ball3 = new Ball(this, 10, 15, 15, 8, 3);
        ball3.setColors(this.color(39,120,55),this.color(22,12,15));
        ball4 = new Ball(this, 8, 12, 14, 2, 7); 
        ball4.setColors(this.color(10,67,28),this.color(22,44,89));
        //creating new bubble objects 
        bubble1 = new Bubble(this);
        bubble2 = new Bubble(this,10,40,16,0,-2); 
        bubble3 = new Bubble(this,25,100,16,0,-4); 
        bubble4 = new Bubble(this,13,50,16,2,-6);
        // creating new snow flake objects 
        sf1 = new Snowflake(this,22,47,5,0,3);
        sf2 = new Snowflake(this,53,123,10,0,4);
        sf3 = new Snowflake(this,58,200,12,0,6);
        sf4 = new Snowflake(this,44,300,8,0,8);
        // creating a new santa object 
        s1 = new Santa(this);

        //bubble2.setColors(this.color(100,80,20),this.color(100,100,100));


        
        
        
    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        // changed color of background to black 
        background(0, 0, 0);
        // each object has a draw() method and a move() method 
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball4.draw();
        ball4.move();
        bubble1.draw();
        bubble1.move();
        bubble2.draw();
        bubble2.move();
        bubble3.draw();
        bubble3.move();
        bubble4.draw();
        bubble4.move();
        sf1.draw();
        sf1.move();
        sf2.draw();
        sf2.move();
        sf3.draw();
        sf3.move();
        sf4.draw();
        sf4.move();
        s1.draw();
        
        
    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
