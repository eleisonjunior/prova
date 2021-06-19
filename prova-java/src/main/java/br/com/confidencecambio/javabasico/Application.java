package br.com.confidencecambio.javabasico;

    /*
        Create by @Eleison Jr
     */

import br.com.confidencecambio.javabasico.entity.Cliente;
import br.com.confidencecambio.javabasico.entity.Gerente;
import br.com.confidencecambio.javabasico.entity.Robo;
import br.com.confidencecambio.javabasico.util.StringUtil;


public class Application {


    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("    João Soares Silva   ");
            Gerente gerente = new Gerente("   Mario da Silva Teles   ");
            Robo robo = new Robo("   Katlin Ramos da Silva    ");


            System.out.println("Nome do cliente em maiúsculo: "+StringUtil.nomeMaisculo(cliente.getNome().strip()));
            System.out.println("Primeiro nome do cliente: "+StringUtil.obterPrimeiroNome(cliente.getNome().strip()));
            System.out.println("Últimos nomes do cliente: "+StringUtil.obterUltimoNome(cliente.getNome().strip()));
            System.out.println("Nome abreviado do cliente: "+StringUtil.abreviarNome(cliente.getNome().strip()));
            System.out.println("====================");

            System.out.println("Nome do gerente em maiúsculo: "+StringUtil.nomeMaisculo(gerente.getNome().strip()));
            System.out.println("Primeiro nome do gerente: "+StringUtil.obterPrimeiroNome(gerente.getNome().strip()));
            System.out.println("Últimos nomes do gerente: "+StringUtil.obterUltimoNome(gerente.getNome().strip()));
            System.out.println("Nome abreviado do gerente: "+StringUtil.abreviarNome(gerente.getNome().strip()));
            System.out.println("====================");

            System.out.println("Nome do robô em maiúsculo: "+StringUtil.nomeMaisculo(robo.getNome().strip()));
            System.out.println("Primeiro nome do robô: "+StringUtil.obterPrimeiroNome(robo.getNome().strip()));
            System.out.println("Últimos nomes do robô: "+StringUtil.obterUltimoNome(robo.getNome().strip()));
            System.out.println("Nome abreviado do robô: "+StringUtil.abreviarNome(robo.getNome().strip()));


        }catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
