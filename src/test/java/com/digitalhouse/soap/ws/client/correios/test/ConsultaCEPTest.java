package com.digitalhouse.soap.ws.client.correios.test;

import com.digitalhouse.soap.ws.client.correios.generated.*;
import org.junit.Test;

import java.lang.Exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConsultaCEPTest {

    @Test
    public void consultaCepDeveRetornarBairroJardimIvone() {
        AtendeClienteService service = new AtendeClienteService();
        AtendeCliente client = service.getAtendeClientePort();

        try {
            ConsultaCEP cep = new ConsultaCEP();
            cep.setCep("03986100");
            EnderecoERP response = client.consultaCEP(cep.getCep());

            System.out.println(response.toString());
            assertEquals("Jardim Ivone",response.getBairro());
        } catch (SQLException_Exception e) {
            e.printStackTrace();
        } catch (SigepClienteException e) {
            e.printStackTrace();
        }
    }
}
