package calculadora;

public class Testesoma {

    public static void main(String[] args) {
        Soma somando = new Soma();
    
        //Cenário de Teste 1: Soma de dois valores positivos.
        int somar = somando.somar(1,2);
        System.out.println(somar);
        
        //Cenário de Teste 2: Soma sendo o primeiro valor positivo e o segundo 0.
        somar = somando.somar(1,0);
        System.out.println(somar);
        
        //Cenário de Teste 3: Soma sendo o primeiro valor 0 e o segundo positivo.
        somar = somando.somar(0,2);
        System.out.println(somar);
        
        //Cenário de Teste 4: Soma sendo os dois valores 0.
        somar = somando.somar(0,0);
        System.out.println(somar);
        
        //Cenário de Teste 5: Soma sendo o primeiro valor negativo e o segundo positivo.
        somar = somando.somar(-1,2);
        System.out.println(somar);
        
        //Cenário de Teste 6: Soma sendo o primeiro valor positivo e o segundo negativo.
        somar = somando.somar(1,-2);
        System.out.println(somar);
        
        //Cenário de Teste 7: Soma sendo os dois valores negativos.
        somar = somando.somar(-1,-2);
        System.out.println(somar);
        
        //Cenário de Teste 8: Soma sendo o primeiro valor 0 e o segundo negativo.
        somar = somando.somar(0,-2);
        System.out.println(somar);
        
        //Cenário de Teste 9: Soma sendo o primeiro valor negativo e o segundo 0.
        somar = somando.somar(-1,0);
        System.out.println(somar);
    }
    
}
