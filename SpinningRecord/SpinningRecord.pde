PImage pictureOfRecord;
void setup(){
     size(600,600);                                 
     pictureOfRecord= loadImage("record.png");
       pictureOfRecord.resize(600,600);
}
void draw(){
  rotateImage(pictureOfRecord, 300);
   image(pictureOfRecord, 0, 0);
}
   void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
}
