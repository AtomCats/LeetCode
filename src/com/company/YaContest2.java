package com.company;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YaContest2 {
    static class Arithmetics {
        private Map<Integer, Progression> progressions;

        public Arithmetics() {
            progressions = new HashMap<>();
        }

        public void addProgression(int a1, int d, int id) {
            Progression progression = new Progression(a1, d);
            progressions.put(id, progression);
        }

        public void removeProgression(int id) {
            progressions.remove(id);
        }

        public int getNextElement() {
            int minId = Integer.MAX_VALUE;
            int minFirstElement = Integer.MAX_VALUE;

            final Progression progression1 = progressions.entrySet().stream()
                    .sorted(Comparator.comparing(a -> a.getValue().getFirstElement()))
                    .min(Comparator.comparing(Map.Entry::getKey))
                    .get()
                    .getValue();
            minFirstElement = progression1.getFirstElement();
            int nextElement = minFirstElement + progression1.getDifference();
            progression1.setFirstElement(nextElement);

            return minFirstElement;
        }
    }

    static class Progression {
        private int firstElement;
        private int difference;

        public Progression(int firstElement, int difference) {
            this.firstElement = firstElement;
            this.difference = difference;
        }

        public int getFirstElement() {
            return firstElement;
        }

        public void setFirstElement(int firstElement) {
            this.firstElement = firstElement;
        }

        public int getDifference() {
            return difference;
        }
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int q = scanner.nextInt();
            Arithmetics arithmetics = new Arithmetics();

            for (int i = 0; i < q; i++) {
                int operationType = scanner.nextInt();

                if (operationType == 1) {
                    int a1 = scanner.nextInt();
                    int d = scanner.nextInt();
                    int id = scanner.nextInt();
                    arithmetics.addProgression(a1, d, id);
                } else if (operationType == 2) {
                    int id = scanner.nextInt();
                    arithmetics.removeProgression(id);
                } else if (operationType == 3) {
                    int nextElement = arithmetics.getNextElement();
                    System.out.println(nextElement);
                }
            }
        }
}
