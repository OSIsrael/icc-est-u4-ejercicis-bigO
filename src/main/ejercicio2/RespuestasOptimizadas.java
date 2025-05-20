package main.ejercicio2;

import java.util.HashSet;

public class RespuestasOptimizadas {
    // 1. Versión optimizada de tieneDuplicados (Complejidad: O(n))
    public static String tieneDuplicadosComplejidad = "O(n)";

    public static boolean tieneDuplicadosOpt(int[] arr) {
        HashSet<Integer> vistos = new HashSet<>();
        for (int num : arr) {
            if (vistos.contains(num)) {
                return true;
            }
            vistos.add(num);
        }
        return false;
    }

    // 2. Versión optimizada de contarMayores (Complejidad: O(n))
    public static String contarMayoresComplejidad = "O(n)";

    public static int contarMayoresOpt(int[] arr, int x) {
        int count = 0;
        int maxHastaAhora = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x && arr[i] > maxHastaAhora) {
                count++;
                maxHastaAhora = arr[i];
            } else if (arr[i] > maxHastaAhora) {
                maxHastaAhora = arr[i];
            }
        }

        return count;
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad: O(n))
    public static String encontrarMaximoComplejidad = "O(n)";

    public static int encontrarMaximoOpt(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
