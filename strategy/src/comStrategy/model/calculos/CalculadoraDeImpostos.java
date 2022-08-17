package comStrategy.model.calculos;

import comStrategy.model.Orcamento;
import comStrategy.model.enums.TipoImposto;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcularImpostos(Orcamento orcamento,
                                       TipoImposto tipoImposto){
        switch (tipoImposto){
            case ICMS:
                return orcamento.getValorOrcamento().multiply(new
                        BigDecimal("0.1"));
            case INSS:
                return orcamento.getValorOrcamento().multiply(new
                        BigDecimal("0.06"));
            default:
                return BigDecimal.ZERO;
        }


    }
}
