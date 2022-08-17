package model.calculoIcms;

public class IcmsFactory {
    public static CalculoPorRegiao getIcmsPorEstado(String nomeEstado) {
        if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {
            return new IcmsMg();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_SP")) {
            return new IcmsSp();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_ES")) {
            return new IcmsEs();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_RJ")) {
            return new IcmsRj();
        }else {
            return null;
        }
    }
}

