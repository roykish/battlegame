package com.company;

public class Player1 {
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health){  //This is a constructor
        this.name = name;
        this.weapon = weapon;

        if(health < 0 || health > 100){  //player's health should be in between 0 to 100
            this.health = 100;
        }
        else{
            this.health = health;
        }
    }

    public void damageByGun1(){  //This function calculates the damage of gun1 if called.
        this.health -= 30;      //if gun1 hits to player 1, health will be reduced by 30.
        if(this.health <= 0){   //if health is 0 or bellow 0.
            this.health = 0;    //set health to 0.

        }
        System.out.println("Got hit by Gun 1. Health is reduced by 30" + ". New health is " + this. health );

        if(this.health == 0){   //if health is 0, print player is dead.
            System.out.println( this.getName() + " is dead");
        }
    }

    public void damageByGun2(){   //This function calculates the damage of gun2 if called.
        this.health -= 30;      //if gun2 hits player1, health will be reduced by 30.
        if(this.health <= 0){   //if health is 0 or bellow 0.
            this.health = 0;    //set health to 0

        }
        System.out.println("Got hit by Gun 2. Health is reduced by 30" + ". New health is " + this. health );

        if(this.health == 0){    //if health is 0, print player is dead.
            System.out.println(this.getName() + " is dead");
        }
    }

    public void heal(){   //This function increases health by 100 is called.
        if(this.health <= 0){   //if health is already 0 or bellow, heal won't be possile
            System.out.println("Player is dead, Healing not possible");
        }
        else{
            this.health = 100;   //set health by 100
            System.out.println( this.getName() + " is healed up. New health is " + this.health);
        }
    }

    //Setting the setters for the variables
    public void setName(String name){
        this.name = name;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public void setHealth(int health){
        this.health = health;
    }

    //setting the getters for the variables
    public String getName(){
        return name;
    }
    public String getWeapon(){
        return weapon;
    }
    public int getHealth(){
        return health;
    }


}
