

class Bubble {

    private Sketch s;
    /** the radius of the ball */
    private float radius;
    private float x;
    private float y;
    /** The number of pixels the ball moves right per frame */
    private float xSpeed;
    /** The number of pixels the ball moves down per frame */
    private float ySpeed;
    /** The color of the outside of the ball */
    private int borderColor;
   

     /** Empty constructor to keep the defaults. Only sets up our link. */
     public Bubble(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 2;
        ySpeed = -1;
        // I wanted to change the border color to white  
        borderColor = s.color(255, 255, 255);
    }

    /** Fully specified constructor to allow changes to size, position, speed */
    public Bubble(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
        this.borderColor =s.color(255, 255, 255);
    }
    // accessors for the radius, diameter, x, and y values 
    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void draw() {
        s.stroke(borderColor);
        // creates a transparent bubble i learned how to do this with this link: https://stackoverflow.com/questions/6734171/how-do-i-set-the-r-g-b-and-alpha-components-of-a-color?rq=1
        s.fill(00, 80, 20, 0);
        s.circle(x, y, radius*2);
    }


    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        /** if the bubble is close to the edge of the window (and would get cut out) the x 
        gets changed in order for the bubble to appear on the other side of the window **/
        
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}
