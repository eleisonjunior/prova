package br.com.confidencecambio.javabasico.util;

    /*
        Create by @Eleison Jr
     */
import java.util.Arrays;
import java.util.Locale;

public class StringUtil {

    /*
    Função responsável por deixar todo o nome maiúsculo
 */
    public static String nomeMaisculo(String nome){
        return nome = nome.toUpperCase(Locale.ROOT);
    }
    /*
        Função responsável por retornar o primeiro nome
     */
    public static String obterPrimeiroNome(String nome){
        String[] nomes = nome.split(" ");
        return nomes[0];
    }
    /*
        Função responsável por retornar o último nome
     */
    public static String obterUltimoNome(String nome){
        String[] nomes = nome.split(" ");
        return nomes[nomes.length-2] + " " +nomes[nomes.length-1];
    }

    /*
        Função responsável por criar as abreviações dos nomes
     */
    public static String abreviarNome(String nome){
        String meio = " ";
        String[] nomes = nome.split(" ");
        var preposicoes = new String[] { "de", "da", "do", "das", "dos" };
        for (int i = 1; i < nomes.length - 1; i++)
        {
            if(!Arrays.asList(preposicoes).contains(nomes[i]))
            {
                meio += nomes[i].substring(0, 1);
                meio += ". ";
            }
            if(Arrays.asList(preposicoes).contains(nomes[i]))
                meio += nomes[i]+" ";
        }
        return nomes[0] + meio + nomes[nomes.length - 1];
    }

}
