public class NPrimos {

    void verificarPrimariedade(int numero){
        int contador = 0;
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                contador++;
            }
        }
        if (contador == 2){
            System.out.println(numero + " é primo!");
        } else {
            System.out.println(numero + " não é primo!");
        }
    }
}
