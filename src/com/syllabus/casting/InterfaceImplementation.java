package com.syllabus.casting;

interface Players{
    void exercise();
}

class SoccerPlayers implements Players{
    public void exercise(){
        System.out.println("Soccer Exercise");
    }
}

class FootballPlayers implements Players{
    public void exercise(){
        System.out.println("Football Exercise");
    }
}

public class InterfaceImplementation {
    public static void main(String[] args) {
        new InterfaceImplementation().doExercise(new SoccerPlayers());

//        InterfaceImplementation i = new InterfaceImplementation();
//        Players p = new SoccerPlayers();
//        p.exercise();
//        Players p2 = new FootballPlayers();
//        p2.exercise();
    }

    public void doExercise(Players players){
        players.exercise();
    }
}
