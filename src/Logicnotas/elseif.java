package Logicnotas;

import java.util.Scanner;

public class elseif {


    Scanner sc = new Scanner(System.in);

    System.out.println("ingrese su peso:");

    float peso = sc.nextFloat();

    System.out.println("ingrese su estatura:");

    float est = sc.nextFloat();

    float imc = Math.round (peso/(est*est));

    if(imc < 18.5){
        System.out.println("Su IMC es:" + imc + "corresponde a Bajo peso");
    }else if(imc >= 18.5 && imc <25){
        System.out.println("Peso normal");
    }else if(imc>=25 && imc <30){
        System.out.println("sobrepeso");
    }else if(imc>= 30>){
        System.out.println("Obesidad")
    }
}
