package componentes;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void ligar() {
       System.out.println("fazeendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
       
    }

    @Override
    public void exobirPagina() {
        System.out.println("exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("pagina atualizada.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica....");
    }

    @Override
    public void pausar() {
        System.out.println("musica pausada....");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("musica selecionada " + musica);
    }

}
