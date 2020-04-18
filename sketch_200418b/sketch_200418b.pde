int rainY=50;
int score= 0;
int randomNumber=0;
void setup(){
   size(500, 500);
}
void draw(){
    
    background(#F50A0A);
    if (rainY==500){
          checkCatch(randomNumber);
      rainY=0;
       randomNumber = (int) random(width);
        }
    fill(#0D7DD1);
    stroke(#000103);
    ellipse(randomNumber, rainY, 50, 90);
    rainY+=2;
    fill(#444648);
    rect(mouseX, 450, 70, 50);
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
