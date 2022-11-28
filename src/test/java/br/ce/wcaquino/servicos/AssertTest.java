package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Usuario;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class AssertTest {

    @Test
    public void test1() {

        Assert.assertTrue(true);
        Assert.assertFalse(false);

        //Aqui o teste passa pois verifica se 1 é igual a 1
        Assert.assertEquals(1, 1);
        System.out.println("Aqui o teste passa pois verifica se 1 é igual a 1");


        //Aqui o teste não passa passa pois verifica se 1 é igual a 5 e não é
        System.out.println("Aqui o teste não passa passa pois verifica se 1 é igual a 5 e não é");
        Assert.assertEquals(1, 5);


    }

    @Test
    public void test2() {

        //Aqui o teste  passa passa pois verifica se 0.51 é igual a 0.51 mas necessariamente
        // ...precisa de uma margem de erro de comparação que é o 0.001
        Assert.assertEquals(0.51, 0.51, 0.001);
        System.out.println(" //Aqui o teste  passa passa pois verifica se 0.51 é igual a 0.51 mas necessariamente\n" +
                "        // ...precisa de uma margem de erro de comparação que é o 0.001 ");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("//Aqui o teste NÃO PASSA passa pois verifica se 0.51 é igual a 0.51 mas necessariamente\n" +
                "        // ...precisa de uma margem de erro de comparação que é o 0.001");
        //Aqui o teste NÃO PASSA passa pois verifica se 0.51 é igual a 0.51 mas necessariamente
        // ...precisa de uma margem de erro de comparação que é o 0.001
        Assert.assertEquals(0.51, 0.51);


    }

    @Test

    public void Test3() {

        //Aqui passa pois compara os mesmos nomes
        Assert.assertEquals(" bola", " bola");
        System.out.println("esse teste passa");


        // Aqui não passa pois bola é diferente de Bola
        Assert.assertEquals(" bola", " Bola");
        System.out.println("esse teste NÃO passa");


        // Para bola ficar igual a Bola precisa fazer igual abaixo:
        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));

        Assert.assertTrue("bola".startsWith("bo"));
        System.out.println("Esse teste passa pois deixa como verdadeiro o que é diferente");
    }

    @Test
    public void Test4() {

        Usuario u1 = new Usuario("Usuario 1");
        Usuario u2 = new Usuario("Usuario 1");

        Assert.assertEquals(u1, u2);
        System.out.println("Neste caso o assertEquals NÃO considera os objetos iguais");
        System.out.println("ATENÇÃO, AGORA ESTÁ IGUAL PORQUE FUI NA CLASSE Usuario.java e incluí o método ");



    }

    @Test
    public void Test5() {

        Usuario u1 = new Usuario("Usuario Ariane");
        Usuario u2 = new Usuario("Usuario Layse");


        Assert.assertNotSame(u1, u2); // Assert NOT Same, afirma que NÃO SÃO IGUAIS
        System.out.println("Aqui  passa pois irá demonstrar que são diferentes");


    }

    @Test
    public void Test6() {

        // SEMPRE PRIMEIRO O ESPERADO E DEPOIS O ATUAL

        Assert.assertEquals("Java", "Matemática");

    }

}



