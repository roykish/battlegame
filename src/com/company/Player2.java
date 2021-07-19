package com.company;

public class Player2 extends Player1{
    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) { //This is a constructor
        super(name, weapon, health); //this is also a constructor method. But super keyword because it is called from it's parent class(Player1).
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if(armour){     //Player2 has an option of having armour. If armour is ON, reduce health by 20 if this function is called.(if gun1 hits)
            this.health -= 20;
            if(this.health <=0){
                this.health = 0;
            }
            System.out.println("Armour is On. Got hit by player 1. Health is reduced by 20" + ". New health is " + this.health);
            if(this.health == 0){
                System.out.println(this.getName() + " is Dead");
            }
        }

        if(!armour){   //If armour is OFF, reduce health by 30, if this function is called(if gun1 hits)
            this.health -= 30;
            if(this.health <=0) {
                this.health = 0;
            }
            System.out.println("Armour is not on. Got hit by player 1. Health is reduced by 30" + ". New health is " + this.health);
            if(this.health == 0){
                System.out.println(this.getName() + " is Dead");
            }
        }

    }

    @Override
    public void heal(){   //healing process is same as player1
        if(this.health <= 0){
            System.out.println("Player is dead, Healing not possible");
        }
        else{
            this.health = 100;
            System.out.println(this.getName() + " is healed up. New health is " + this.health);
        }
    }



    @Override
    public void damageByGun2(){
        if(armour){     //if armour is ON and this function has been called(gun2 hits), reduce health by 40.
            this.health -= 40;
            if(this.health <=0) {
                this.health = 0;
            }
            System.out.println("Armour is On. Got hit by player 1. Health is reduced by 40" + ". New health is " + this.health);
            if(this.health == 0){
                System.out.println(this.getName() + " is Dead");
            }

        }
        if(!armour){        //if armour is OFF and this function has been called(gun2 hits), reduce health by 40.
            this.health -= 50;
            if(this.health <=0) {
                this.health = 0;

            }
            System.out.println("Armour is not on. Got hit by player 1. Health is reduced by 50" + ". New health is " + this.health);
            if(this.health == 0){
                System.out.println(this.getName() + " is Dead");
            }
        }


    }
}

