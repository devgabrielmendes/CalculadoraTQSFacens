package com.mycompany.calculadoratqsfacens;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *@author Gabriel Mendes da Silva
 *data 06/11/2023
 *@version 1.2
 */

public class CalculadoraTQSFacens {

    public static void main(String[] args) {
        //Instanciando a calsse.
        testejunit teste = new testejunit();
            //Executa os testes.
            teste.testeSoma();
            teste.testeSubtracao();
            teste.testeDivisao();
            teste.testeMultiplicacao();
        }
        
    }
}
