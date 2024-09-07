public class FaturamentoDistribuidoraPorEstado {

    public static void main(String[] args) {
        // Valores de faturamento por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Calculando o faturamento total
        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Calculando o percentual de cada estado
        double percentualSP = (faturamentoSP / faturamentoTotal) * 100;
        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percentualMG = (faturamentoMG / faturamentoTotal) * 100;
        double percentualES = (faturamentoES / faturamentoTotal) * 100;
        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100;

        // Exibindo os resultados
        System.out.printf("Percentual de representação de SP: %.2f%%\n", percentualSP);
        System.out.printf("Percentual de representação de RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de representação de MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de representação de ES: %.2f%%\n", percentualES);
        System.out.printf("Percentual de representação de Outros: %.2f%%\n", percentualOutros);
    }
}
