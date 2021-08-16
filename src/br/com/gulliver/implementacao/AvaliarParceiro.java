package br.com.gulliver.implementacao;

import br.com.gulliver.beans.*;

import java.time.LocalDate;

public class AvaliarParceiro {
    public static void main(String[] args) {
        Estado estadoEnderecoGulliver = new Estado(1, "Sao Paulo", "SP");
        Cidade cidadeEnderecoGulliver = new Cidade(1, "Sao Paulo", "SP");
        Endereco enderecoGulliver = new Endereco(1, "Avenida do Gulliver", "12345-123","123","Bairro viagem", "Casa Unica",estadoEnderecoGulliver, cidadeEnderecoGulliver);
        Usuario gulliver = new Usuario(1,"Gulliver", "gulliver@gulliver.com.br","senha@1234", enderecoGulliver);

        Endereco enderecoPousadaParceiro = new Endereco(2, "Avenida do doSeuZe", "12345-123","123","Bairro do seu Ze", "Casa Dois", estadoEnderecoGulliver, cidadeEnderecoGulliver);
        Parceiro parceiroAvaliado = new Parceiro(1, "Pousada do SeuZe", "1234567890", "8791263182768319746193487618734698712354", "seuze@seuze.com.br", "Esta e a pousada do seu ze", enderecoPousadaParceiro);
        LocalDate dataAvaliacao = LocalDate.of(2021, 1, 8);
        Avaliacao avaliarParceiroGulliver = new Avaliacao(1, "Otimo lugar para passear com a familia!", dataAvaliacao, 4, gulliver, parceiroAvaliado);

        System.out.println(avaliarParceiroGulliver.toString());

    }
}
