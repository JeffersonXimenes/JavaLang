package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.StringJava;

public class TesteJavaLang {
    public static void main(String[] args) {
        StringJava c = new StringJava();

        // EXERCICIO 1 (NÃO-OPCIONAL)
        //c.verificandoString("hoje e sexta-feira", "hoje");
        //c.mudarEspacoBranco("testando o testando","-");
        //c.checarVazia("a");
        //c.contarCaractere("aaaaa");
        //System.out.println("");

        // EXERCICIO 2 (OPCIONAL)
        System.out.println("-----------------------");
        System.out.println(c.pularCaractere("ERA UMA VEZ"));


        // EXERCICIO 3 (OPCIONAL)
        System.out.println("-----------------------");
        //System.out.println(c.imprimaString("Socorram-me, subi no ônibus em Marrocos\" e \"anotaram a data da maratona\""));


        // EXERCICIO 4 (NÃO-OPCIONAL)
        System.out.println("-----------------------");
        c.converte("122");
    }
}
