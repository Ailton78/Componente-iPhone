package application;

import componentes.Iphone;

public class Program {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.selecionarMusica("Raridade");
        iphone.tocar();
        System.out.println();
        iphone.exobirPagina();
        iphone.adicionarNovaAba();
    }

}
