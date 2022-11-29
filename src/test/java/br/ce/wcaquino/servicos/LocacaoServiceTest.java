package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class LocacaoServiceTest {

    @Test
    public void teste() throws Exception {

        //cenário
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuario 1");
        Filme filme = new Filme("Filme1", 2, 4.0);

        //ação

        Locacao locacao = service.alugarFilme(usuario, filme);

        // verificação

        //valor da alocação é 5
        assertThat(locacao.getValor(), is(5.0));
        // Valor da alocação não é 6
        assertThat(locacao.getValor(), is(not(6.0)));
        assertThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
        assertThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), is(true));


    }

    private Object not(double v) {
        return null;
    }
}






