public class Main {
    public static void main(String[] args) {
        String nome = "";

        if(args.length > 0){
            nome = args[0].trim();
        }

        if(nome.isEmpty()){
            nome = "ospite";
        }
        
        System.out.println("Buongorno " + nome);
    }
}
