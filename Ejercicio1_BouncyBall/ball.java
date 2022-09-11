import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class ball extends Actor
{
    
    private String moving = "BottomRight";
    
    public void act()
    {
        if(this.getY() < 10 || this.getY() > 390  || this.getX() < 20 || this.getX() > 580){
             
            switch(moving){
                case "TopRight":moving="BottomRight";
                break;
                case "BottomRight":moving="LeftBelow";
                break;
                case "LeftBelow":moving="TopLeft";
                break;
                case "TopLeft":moving="TopRight";
                break;
            }
        }
        
        if(moving == "TopRight"){
                this.moveRight();
                this.moveUp();
            }
            
        if(moving == "BottomRight"){
                this.moveRight();
                this.moveDown();
            }
            
        if(moving == "LeftBelow"){
                this.moveLeft();
                this.moveDown();
        }
        
        if(moving == "TopLeft"){
                this.moveLeft();
                this.moveUp();
        }
    }
    
    public void moveUp(){
        this.setLocation(this.getX(),this.getY() - 5);
    }
    
    public void moveDown(){
        this.setLocation(this.getX(),this.getY() + 5);
        }
    
    public void moveLeft(){
        this.setLocation(this.getX() - 5,this.getY());
    }
    
    public void moveRight(){
        this.setLocation(this.getX() + 5,this.getY());
    }
}

