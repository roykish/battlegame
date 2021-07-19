package com.company;

public class Main {

    public static void main(String[] args) {
	    Player1 player = new Player1("Kishor", "sward", 90);

//        System.out.println(player.getName());
//        System.out.println(player.getWeapon());
//        System.out.println(player.getHealth());

//        player.damageByGun1();
//        player.damageByGun1();
//        player.damageByGun2();

        Player2 opponentPlayer = new Player2("Mastaan", "m416", 80, false);

//        System.out.println(opponentPlayer.getName());
//        System.out.println(opponentPlayer.getWeapon());
//        System.out.println(opponentPlayer.getHealth());

        opponentPlayer.damageByGun1();
        opponentPlayer.damageByGun1();
        opponentPlayer.heal();





    }
}
