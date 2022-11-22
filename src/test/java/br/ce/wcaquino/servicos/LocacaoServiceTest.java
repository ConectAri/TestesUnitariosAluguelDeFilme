package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;
import br.ce.wcaquino.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LocacaoServiceTest {

    @Test
    public  void teste() {
        //cenario
        // Cenário: Onde as variáveis serão inicializadas

        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuario 1");
        Filme filme = new Filme("Filme 1", 2, 4.0);

        //acao
        //Ação onde vamos invocar o método que vamos testar

        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificacao
        // Validação, onde vamos coletar os resultados da ação com aquele
        // cenário especificado e podemos avaliar se o resultado está
        // de acordo ao esperado.

        // Aqui eu verifico se o valor da alocação é igual a 5
        Assert.assertTrue(locacao.getValor() == 4.0);

        //Aqui verifico se a data da alocação é a mesma data atual
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));

        // A data de retorno deve ser a data do dia seguinte, quantos dias eu quero além da data do dia de hoje
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
    }
}
