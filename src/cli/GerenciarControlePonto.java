package cli;

import jdk.jfr.Registered;
import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setIdFunc(1);
        gerente.setNome("Igor Savioli");
        gerente.setEmail("igor.savioli@fatec.sp.gov.br");
        gerente.setDocumeto("123.654.789-01");
        gerente.setLogin("igor_s");
        gerente.setSenha("igo43#!");

        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setNome("Amanda Ramalho");
        secretaria.setEmail("amanda.ramalho@fatec.sp.gov.br");
        secretaria.setDocumeto("213.654.789-01");
        secretaria.setTelefone("(11)4664-8881");
        secretaria.setRamal("8881");

        Operador operador = new Operador();
        operador.setIdFunc(3);
        operador.setNome("Roberto Souza");
        operador.setEmail("roberto.souza@fatec.sp.gov.br");
        operador.setDocumeto("219.854.789-01");
        operador.setValorHora(12.50);

        RegistroPonto gerente1 = new RegistroPonto();
        RegistroPonto secretaria1 = new RegistroPonto();
        RegistroPonto operador1 = new RegistroPonto();

        adicionarEspera();
        gerente1.setFunc(gerente);
        gerente1.setDataRegistro(LocalDate.now());
        gerente1.setHoraEntrada(LocalDateTime.now());
        gerente1.apresentarRegistoPonto();

        adicionarEspera();
        secretaria1.setFunc(secretaria);
        secretaria1.setDataRegistro(LocalDate.now());
        secretaria1.setHoraEntrada(LocalDateTime.now());
        secretaria1.apresentarRegistoPonto();

        adicionarEspera();
        operador1.setFunc(operador);
        operador1.setDataRegistro(LocalDate.now());
        operador1.setHoraEntrada(LocalDateTime.now());
        operador1.apresentarRegistoPonto();

        adicionarEspera();
        gerente1.setHoraSaida(LocalDateTime.now());
        gerente1.apresentarRegistoPonto();

        adicionarEspera();
        secretaria1.setHoraSaida(LocalDateTime.now());
        secretaria1.apresentarRegistoPonto();

        adicionarEspera();
        operador1.setHoraSaida(LocalDateTime.now());
        operador1.apresentarRegistoPonto();
    }

    public static void adicionarEspera(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}