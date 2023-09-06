package calculadora;

public class Testedivisao {

    public static void main(String[] args) {
        Divisao dividindo = new Divisao();
    
        //Cenário de Teste 1: Divisão entre dois valores positivos.
        float dividir = dividindo.dividir(1,2);
        System.out.println(dividir);
        
        //Cenário de Teste 2: Divisão sendo o primeiro valor positivo e o segundo 0. (O resultado será "Infinito")
        dividir = dividindo.dividir(1,0);
        System.out.println(dividir);
        
        //Cenário de Teste 3: Divisão sendo o primeiro valor 0 e o segundo positivo.
        dividir = dividindo.dividir(0,2);
        System.out.println(dividir);
        
        //Cenário de Teste 4: Divisão sendo os dois valores 0. (O resultado será "NaN")
        dividir = dividindo.dividir(0,0);
        System.out.println(dividir);
        
        //Cenário de Teste 5: Divisão sendo o primeiro valor negativo e o segundo positivo.
        dividir = dividindo.dividir(-1,2);
        System.out.println(dividir);
        
        //Cenário de Teste 6: Divisão sendo o primeiro valor positivo e o segundo negativo.
        dividir = dividindo.dividir(1,-2);
        System.out.println(dividir);
        
        //Cenário de Teste 7: Divisão sendo os dois valores negativos.
        dividir = dividindo.dividir(-1,-2);
        System.out.println(dividir);
        
        //Cenário de Teste 8: Divisão sendo o primeiro valor 0 e o segundo negativo.
        dividir = dividindo.dividir(0,-2);
        System.out.println(dividir);
        
        //Cenário de Teste 9: Divisão sendo o primeiro valor negativo e o segundo 0. (O resultado será "-Infinito")
        dividir = dividindo.dividir(-1,0);
        System.out.println(dividir);
    }
    
}
