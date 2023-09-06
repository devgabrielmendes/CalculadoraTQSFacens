package calculadora;

public class Testemultiplicacao {

    public static void main(String[] args) {
        Multiplicacao multiplicando = new Multiplicacao();
    
        //Cenário de Teste 1: Multiplicação entre dois valores positivos.
        int multiplicar = multiplicando.multiplicar(1,2);
        System.out.println(multiplicar);
        
        //Cenário de Teste 2: Multiplicação sendo o primeiro valor positivo e o segundo 0.
        multiplicar = multiplicando.multiplicar(1,0);
        System.out.println(multiplicar);
        
        //Cenário de Teste 3: Multiplicação sendo o primeiro valor 0 e o segundo positivo.
        multiplicar = multiplicando.multiplicar(0,2);
        System.out.println(multiplicar);
        
        //Cenário de Teste 4: Multiplicação sendo os dois valores 0.
        multiplicar = multiplicando.multiplicar(0,0);
        System.out.println(multiplicar);
        
        //Cenário de Teste 5: Multiplicação sendo o primeiro valor negativo e o segundo positivo.
        multiplicar = multiplicando.multiplicar(-1,2);
        System.out.println(multiplicar);
        
        //Cenário de Teste 6: Multiplicação sendo o primeiro valor positivo e o segundo negativo.
        multiplicar = multiplicando.multiplicar(1,-2);
        System.out.println(multiplicar);
        
        //Cenário de Teste 7: Multiplicação sendo os dois valores negativos.
        multiplicar = multiplicando.multiplicar(-1,-2);
        System.out.println(multiplicar);
        
        //Cenário de Teste 8: Multiplicação sendo o primeiro valor 0 e o segundo negativo.
        multiplicar = multiplicando.multiplicar(0,-2);
        System.out.println(multiplicar);
        
        //Cenário de Teste 9: Multiplicação sendo o primeiro valor negativo e o segundo 0.
        multiplicar = multiplicando.multiplicar(-1,0);
        System.out.println(multiplicar);
    }
    
}
