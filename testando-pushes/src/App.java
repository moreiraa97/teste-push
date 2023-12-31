public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        
        recebendo R = new recebendo(); 

        R.rec = "recebendo";

        testando T = new testando();
        
        T.nome = "testando"; 
        
        System.out.println("\nR: " + R.rec + "\nT: " + T.nome);


    }
}
