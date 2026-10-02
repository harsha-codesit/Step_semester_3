package week1.class_problems;

public class BMICalculator {

    static String getBmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    static void printWellnessReport(double[] heights, double[] weights) {

        System.out.println("Height\tWeight\tBMI\tStatus");

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {

        double[] heights = {1.65, 1.70, 1.75, 1.80};
        double[] weights = {50, 65, 80, 100};

        printWellnessReport(heights, weights);
    }
}