package comStrategy.model.calculos;

import comStrategy.model.Orcamento;
import java.math.BigDecimal;

public class Inss {

        public BigDecimal calcular(Orcamento orcamento){
            return orcamento.getValorOrcamento().multiply(new
                    BigDecimal("0.06"));
        }
    }

