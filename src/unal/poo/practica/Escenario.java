package unal.poo.practica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escenario para configurar un escenario
 * @author Laura Moreno
 * @since 10/09/2018
 * @version 1.0
 */
import becker.robots.*;

public class Escenario {
private City city;
private Robot robot;
/**
 * Descripcion del constructor
 */
public Escenario(){
    this.city=new City();
    for(int i=1; i<7; i++){
        Wall pared= new Wall(city, 2, i, Direction.NORTH);
    }
    for(int j=2; j<8; j++){
        Wall pared= new Wall(city, j, 6, Direction.EAST);
    }
    for(int i=1; i<7; i++){
        Wall pared= new Wall(city, 7, i, Direction.SOUTH);
    }
    for(int j=2; j<8; j++){
        Wall pared= new Wall(city, j, 1, Direction.WEST);
    }
    
    this.robot=new Robot(city, 1, 1, Direction.EAST);
    }


/**
 *Recorre el perimetro específico del cuadrado
 */
public void recorrerAdentro(){
    for(int i=1; i<26; i++){
        this.robot.move();
        if(i%5==0){
            robot.turnLeft();
        }
    }
}
public void recorrerAfuera(){
    boolean busyUp=false, busyDown=false, busyRight=false, busyLeft=false;
    
}
}


