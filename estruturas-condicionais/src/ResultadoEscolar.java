public class ResultadoEscolar {
    public static void main(String[] args) {
        // int nota = 6;

        // if(nota >=7 ){
        //     System.out.println("\nAprovado");
        // }else if(nota >= 5 && nota < 7){
        //     System.out.println("\nProva de recuperação");
        // }else{
        //     System.out.println("\nReprovado");
        // }

        //EXPRESSÃO TERNARIA
        int nota = 2;

        String resultado = nota >= 7 ? "Aprovado": nota >= 5 && nota < 7 ? "Recuperação":"Reprovado";

        System.out.println(resultado);
    }
}
