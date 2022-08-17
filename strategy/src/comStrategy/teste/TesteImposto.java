package comStrategy.teste;

import comStrategy.model.Orcamento;
import comStrategy.model.calculos.CalculadoraDeImpostos;
import comStrategy.model.enums.TipoImposto;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcularImpostos(orcamento,
                TipoImposto.ICMS));
        System.out.println(calculadora.calcularImpostos(orcamento,
                TipoImposto.INSS));
    }
}
