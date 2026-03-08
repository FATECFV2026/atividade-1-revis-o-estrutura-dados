package autograde;

import java.lang.reflect.Method;

public class Autograder {
    private static final double EPS = 0.01;

    public static void main(String[] args) {
        if (args.length == 0) {
            fail("Modo não informado. Use: ex1 | ex2 | ex3 | ex4");
        }

        try {
            String mode = args[0].trim().toLowerCase();
            switch (mode) {
                case "ex1":
                    testEx1();
                    break;
                case "ex2":
                    testEx2();
                    break;
                case "ex3":
                    testEx3();
                    break;
                case "ex4":
                    testEx4();
                    break;
                default:
                    fail("Modo inválido: " + mode);
            }
            pass();
        } catch (AssertionError e) {
            fail(e.getMessage());
        } catch (Exception e) {
            fail("Erro ao executar avaliação: " + e.getMessage());
        }
    }

    private static void testEx1() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("operacoesBasicas", double.class, double.class);

        Object result = method.invoke(null, 10.0, 2.0);
        if (!(result instanceof double[])) {
            throw new AssertionError("operacoesBasicas deve retornar double[]");
        }

        double[] values = (double[]) result;
        assertTrue(values.length == 4, "operacoesBasicas deve retornar 4 posições");
        assertApprox(values[0], 12.0, "Soma incorreta");
        assertApprox(values[1], 8.0, "Subtração incorreta");
        assertApprox(values[2], 20.0, "Multiplicação incorreta");
        assertApprox(values[3], 5.0, "Divisão incorreta");
    }

    private static void testEx2() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("calcularINSS", double.class);

        assertApprox((double) method.invoke(null, 1412.00), 1412.00 * 0.075, "INSS faixa 7,5% incorreto");
        assertApprox((double) method.invoke(null, 1412.01), 1412.01 * 0.09, "INSS faixa 9% incorreto");
        assertApprox((double) method.invoke(null, 2666.69), 2666.69 * 0.12, "INSS faixa 12% incorreto");
        assertApprox((double) method.invoke(null, 4000.04), 4000.04 * 0.14, "INSS faixa 14% incorreto");
    }

    private static void testEx3() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("calcularIRPF", double.class);

        assertApprox((double) method.invoke(null, 2259.20), 0.0, "IRPF isento incorreto");
        assertApprox((double) method.invoke(null, 2259.21), 2259.21 * 0.075, "IRPF faixa 7,5% incorreto");
        assertApprox((double) method.invoke(null, 2826.66), 2826.66 * 0.15, "IRPF faixa 15% incorreto");
        assertApprox((double) method.invoke(null, 3751.06), 3751.06 * 0.2255, "IRPF faixa 22,55% incorreto");
        assertApprox((double) method.invoke(null, 5000.00), 5000.00 * 0.275, "IRPF faixa 27,5% incorreto");
    }

    private static void testEx4() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("converterIdadeEmDias", int.class);

        Object result = method.invoke(null, 400);
        if (!(result instanceof int[])) {
            throw new AssertionError("converterIdadeEmDias deve retornar int[]");
        }

        int[] values = (int[]) result;
        assertTrue(values.length == 3, "converterIdadeEmDias deve retornar 3 posições");
        assertTrue(values[0] == 1, "Anos incorreto para 400 dias");
        assertTrue(values[1] == 1, "Meses incorreto para 400 dias");
        assertTrue(values[2] == 5, "Dias incorreto para 400 dias");
    }

    private static void assertApprox(double current, double expected, String message) {
        if (Math.abs(current - expected) > EPS) {
            throw new AssertionError(message + " | esperado=" + expected + " obtido=" + current);
        }
    }

    private static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void pass() {
        System.out.println("OK");
        System.exit(0);
    }

    private static void fail(String message) {
        System.out.println("FALHA: " + message);
        System.exit(1);
    }
}
