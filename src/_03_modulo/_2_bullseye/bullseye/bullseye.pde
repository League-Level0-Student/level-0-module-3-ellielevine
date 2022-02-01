
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
 
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=8; i>0; i--) {
    ellipse(250, 250, i*50, i*50);
     if (i % 2 == 0) {
      fill(#FF0000);
    }
     else {
      fill(#000000);
      }
} 
    
  }
  //Use an if statement and modulo to alternate the color of your rings.
