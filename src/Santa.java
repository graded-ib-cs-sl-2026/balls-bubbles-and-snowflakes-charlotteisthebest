/** PImage is a Datatype for storing images. here is the link i used to learn about it :https://processing.org/reference/PImage.html
 */
import processing.core.PImage;


public class Santa {
  // Declare variable "img" of type PImage
    private PImage img;
    // Declare variable "s" of type Sketch  
    private Sketch s;


    /** Empty constructor to keep the defaults. Only sets up our link. */
    public Santa(Sketch sketch) {
      s = sketch;
      // I have a picture santaWithDeer saved in the same folder so loadImage loads this picture onto the sketch s 
      img = s.loadImage("santaWithDeer.png");  
     
  } 

public void draw() {
  // this displays the image onto the sketch with the cordinates (100,200)
  s.image(img, 100, 200);  

} 
}

/** Some problems that I have overcome along the way 
 *  One of the things I struggled with was bieng able to locate the downloaded file on my computer system and copy it through to the processing folder. 
 * In order to do this I used the "cp" command on terminal to copy the file from my downloads into the proccesing folder. I also used this link to help me :https://medium.com/@michael71314/java-lesson-22-inserting-images-onto-the-jframe-a0a0b6540cca
 * I learned how to navigate the terminal system briefly using commands such as "cd", "ls", "pwd" in order to achieve this task. I also used this link to help me: https://www.macworld.com/article/221277/command-line-navigating-files-folders-mac-terminal.html
 * which basically helped me learn what "cd" is (which is a change of directory to go to a specific folder) "ls" (which lists files and folders) and "pwd" (which is print working directory) which basically helps me verify the exact location of a file on my system.
 * After getting it to apear on the sketch the size of the image was way too big, so I increased the size of the window to see if it would help. It didn't, so I ended up manually changing the size of the image in my documents.
 * all 0f the sources I have used https://processing.org/reference/loadImage_.html
 * https://medium.com/@michael71314/java-lesson-22-inserting-images-onto-the-jframe-a0a0b6540cca
 * https://processing.org/reference/PImage.html
 * 
 */ */ 
