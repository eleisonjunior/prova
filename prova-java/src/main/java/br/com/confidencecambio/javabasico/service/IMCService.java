package br.com.confidencecambio.javabasico.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class IMCService {

    public String retornaValorIMC(@Nullable double peso, @Nullable double altura) {
        double resultado = peso/(altura*altura);
        return "Seu IMC é "+ resultado;
    }
}
