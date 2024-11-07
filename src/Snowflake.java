class Snowflake {
    // ONLY THE DRAW METHOD IS INCLUDED. YOU MUST FINISH THE REST.
   /** The sketch that the ball is inside */
   private Sketch s;
   /** the radius of the ball */
   private float radius;
   private float x;
   private float y;
   /** The number of pixels the ball moves right per frame */
   private float xSpeed;
   /** The number of pixels the ball moves down per frame */
   private float ySpeed;
   /** The color of the inside of the ball */
   private int fillColor;
   /** The color of the outside of the ball */
   private int borderColor;

     /** Empty constructor to keep the defaults. Only sets up our link. */
     public Snowflake(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 2;
        ySpeed = -1;
        //borderColor = s.color(0, 0, 0);
    }

    public Snowflake(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
        //this.borderColor =s.color(0, 0, 0);
    }





    public void draw() {
        s.line(x + radius, y, x - radius, y);
        s.line(x, y + radius, x, y - radius);
        s.line(x + radius * .707f, y + radius * .707f,
               x - radius * .707f, y - radius * .707f);
        s.line(x + radius * .707f, y - radius * .707f,
               x - radius * .707f, y + radius * .707f);
    }

    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
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

