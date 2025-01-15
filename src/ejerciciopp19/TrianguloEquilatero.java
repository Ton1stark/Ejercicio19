/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopp19;

public class TrianguloEquilatero {
    int lado;
    
    
    TrianguloEquilatero(int lado){
       this.lado = lado;  
  }  
    double obtenerArea(){
        return (Math.pow(lado,2)*Math.sqrt(3))/4;
    }
    double obteneraltura(){
        return (lado*Math.sqrt(3))/2;
    }
    double obtenerperimetro(){
        return lado*3;
    }
}
