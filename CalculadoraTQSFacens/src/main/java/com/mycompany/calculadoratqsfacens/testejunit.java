package com.mycompany.calculadoratqsfacens;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class testejunit {
    
   @Test
    public void testeSoma(){
        //Instanciando a classe Calculadora.
        Calculadora calcular = new Calculadora();
        //Passando os parâmetros 1 e 2 para x e y respectivamente.
        int resultado = calcular.soma(1, 2);
        //Checando se o resultado está correto.
        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void testeSubtracao(){
        //Instanciando a classe Calculadora.
        Calculadora calcular = new Calculadora();
        //Passando os parâmetros 2 e 1 para x e y respectivamente.
        int sub = calcular.subtracao(2, 1);
        //Checando se o resultado está correto.
        Assertions.assertEquals(1,sub);
    }

    @Test
    public void testeDivisao(){
        //Instanciando a classe Calculadora.
        Calculadora calcular = new Calculadora();
        //Passando os parâmetros 2 e 2 para x e y respectivamente.
        int div = calcular.divisao(2, 2);
        //Checando se o resultado está correto.
        Assertions.assertEquals(1,div);
    }
    
    @Test
    public void testeMultiplicacao(){
        //Instanciando a classe Calculadora.
        Calculadora calcular = new Calculadora();
        //Passando os parâmetros 2 e 2 para x e y respectivamente.
        int mult = calcular.multiplicacao(2, 2);
        //Checando se o resultado está correto.
        Assertions.assertEquals(4,mult);
    }
}
