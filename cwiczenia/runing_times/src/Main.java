public class Main {
    public static double getMinTime(double[] timeTable) {
        double minValue = timeTable[0];
        for (int i = 1; i < timeTable.length; i++) {
            if (timeTable[i] < minValue) {
                minValue = timeTable[i];
            }
        }
        return minValue;
    }

    public static double getMaxTime(double[] timeTable) {
        double maxValue = timeTable[0];
        for (int i = 1; i < timeTable.length; i++) {
            if (timeTable[i] > maxValue) {
                maxValue = timeTable[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {

        double[] timeTable = {3.59, 4.20, 3.33, 4.39, 2.58};

        System.out.println("Najlepszy czas to: " + getMinTime(timeTable) + " a najgorszy czas to: " + getMaxTime(timeTable));
    }
}
