public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    String serie;

    IPhone(String serie){
        this.serie = serie;
    }

    @Override
    public void Tocar() {
        System.out.println("TOCAR MUSICA");
    }

    @Override
    public void Pausar() {
        System.out.println("PAUSAR MUSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONAR MUSICA: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONAR NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZAR PAGINA");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA" + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDER LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INCIAR CORREIO DE VOZ");
    }

}
