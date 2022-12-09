public class Main {
    public static void main(String[] args) {
                double[] numbers = {2.3, -6.7, 4.6, 5.9, -3.3, -8.4, 2.5, 1.4, 77.5, -97.6, 38.1, -7.56, 55.89, 1.22, 5.33};
                int kolichestvo = 0;
                double summa = 0;
                boolean proverka = false;

                for (double nums : numbers) {
                    if (nums < 0) {
                        proverka = true;
                    } else if (nums > 0 && proverka) {
                        summa += nums;
                        kolichestvo++;
                        System.out.println(nums);
                    }
                }
                System.out.println(summa / kolichestvo);

                int[] data={12,46,-98,70,-36};
                for (int i = 0; i < data.length; i++) {
                    int min = data[i];
                    int minId = i;
                    for (int j = i + 1; j < data.length; j++) {
                        if (data[j] < min) {
                            min = data[j];
                            minId = j;
                        }
                    }

                    int temp = data[i];
                    data[i] = min;
                    data[minId] = temp;
                }
            }
        }
    }
}