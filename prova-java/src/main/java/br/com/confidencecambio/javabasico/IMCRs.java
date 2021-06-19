package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.service.IMCService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class IMCRs {

    private IMCService imcService;

    public IMCRs(final IMCService service) {

        this.imcService = service;
    }

    @RequestMapping(value = "/calculaimc", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> calculaIMC(@RequestParam(value = "peso") double peso, @RequestParam(value = "altura") double altura){
        String retorno = imcService.retornaValorIMC(peso,altura);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }
}
