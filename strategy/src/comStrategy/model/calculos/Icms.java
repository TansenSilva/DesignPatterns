package comStrategy.model.calculos;

import comStrategy.model.Orcamento;

import java.math.BigDecimal;

public class Icms {
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValorOrcamento().multiply(new
                BigDecimal("0.1"));
    }
}
