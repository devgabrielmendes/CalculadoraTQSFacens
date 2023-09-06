package calculadora;

public class Testesubtracao {

    public static void main(String[] args) {
        Subtracao subtraindo = new Subtracao();
    
        //Cenário de Teste 1: Subtração entre dois valores positivos.
        int subtrair = subtraindo.subtrair(1,2);
        System.out.println(subtrair);
        
        //Cenário de Teste 2: Subtração sendo o primeiro valor positivo e o segundo 0.
        subtrair = subtraindo.subtrair(1,0);
        System.out.println(subtrair);
        
        //Cenário de Teste 3: Subtração sendo o primeiro valor 0 e o segundo positivo.
        subtrair = subtraindo.subtrair(0,2);
        System.out.println(subtrair);
        
        //Cenário de Teste 4: Subtração sendo os dois valores 0.
        subtrair = subtraindo.subtrair(0,0);
        System.out.println(subtrair);
        
        //Cenário de Teste 5: Subtração sendo o primeiro valor negativo e o segundo positivo.
        subtrair = subtraindo.subtrair(-1,2);
        System.out.println(subtrair);
        
        //Cenário de Teste 6: Subtração sendo o primeiro valor positivo e o segundo negativo.
        subtrair = subtraindo.subtrair(1,-2);
        System.out.println(subtrair);
        
        //Cenário de Teste 7: Subtração sendo os dois valores negativos.
        subtrair = subtraindo.subtrair(-1,-2);
        System.out.println(subtrair);
        
        //Cenário de Teste 8: Subtração sendo o primeiro valor 0 e o segundo negativo.
        subtrair = subtraindo.subtrair(0,-2);
        System.out.println(subtrair);
        
        //Cenário de Teste 9: Subtração sendo o primeiro valor negativo e o segundo 0.
        subtrair = subtraindo.subtrair(-1,0);
        System.out.println(subtrair);
    }
    }
  
