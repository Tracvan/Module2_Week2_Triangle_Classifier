public class TriangleClassifier {
    public static String triangleCheck(double a, double b, double c) {
        String result = "";
        if (a == b && a == c) {
            result = "Tam giác đều";
        } else if (a == b || a == c || b == c) {
            result = "Tam giác cân";
        }
        return result;
    }
}
