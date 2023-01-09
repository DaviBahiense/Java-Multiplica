public class App {
    public static void main(String[] args) throws Exception {

        int numero = 6;

        int[] tabela = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < tabela.length; i++) {
            if(i==0){ 
                System.out.println("Tabela de multiplicação de "+ numero);
            }
            tabela[i] = tabela[i] * numero;
            
            System.out.println(tabela[i]);
        }
        
    }
}
