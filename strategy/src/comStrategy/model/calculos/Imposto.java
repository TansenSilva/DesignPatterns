package comStrategy.model.calculos;

import comStrategy.model.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
