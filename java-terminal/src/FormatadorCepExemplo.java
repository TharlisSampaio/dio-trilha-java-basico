public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376504");
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("o cep não corresponde com a regra de negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
            }
        return "23.765-064";
    }
}
