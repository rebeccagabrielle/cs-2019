package com.github.rebeccamoraes.ufg.cs.aula10;

import org.junit.jupiter.api.Test;
import com.github.rebeccamoraes.ufg.cs.aula10.domain.DiaDaSemana;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObtemDiaDaSemanaTest{

    final String[] tresArgs = {"20160928", "2016", "20160928"};
    final String[] doisArgs = {"20160928", "2016"};
    final String[] umArg = {"20160928"};

    final String[] primeiroArgNaoInteiro = {"a", "2019", "20190101", "2016"};
    final String[] segundoArgNaoInteiro = {"20190101", "a", "20190101", "2016"};
    final String[] terceiroArgNaoInteiro = {"20190101", "2019", "a", "2016"};
    final String[] quartoArgNaoInteiro = {"20190101", "2019", "20190101", "a"};
    final String[] nenhumArgInteiro = {"1.1", "a", "b", "c"};

    final String[] primeiroArgNegativo = {"-1", "2019", "20190101", "2016"};
    final String[] segundoArgNegativo = {"20190101", "-1", "20190101", "2016"};
    final String[] terceiroArgNegativo = {"20190101", "2019", "-1", "2016"};
    final String[] quartoArgNegativo = {"20190101", "2019", "20190101", "-1"};
    final String[] todosArgsNegativos = {"-1", "-1", "-1", "-1"};

    //R7
    @Test
    void quantidadeDeArgumentosInsuficienteRetornaMenos1(){
        //assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(null));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(umArg));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(doisArgs));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(tresArgs));
    }

    //R8
    @Test
    void umOuMaisArgumentosNaoInteirosRetornaMenos1(){
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(primeiroArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(segundoArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(terceiroArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(quartoArgNaoInteiro));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(nenhumArgInteiro));
    }

    //R9
    @Test
    void umOuMaisArgumentosNegativosRetornaMenos1(){
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(primeiroArgNegativo));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(segundoArgNegativo));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(terceiroArgNegativo));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(quartoArgNegativo));
        assertEquals(-1, DiaDaSemana.obtemDiaDaSemana(todosArgsNegativos));
    }
}