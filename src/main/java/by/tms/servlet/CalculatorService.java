package by.tms.servlet;

public class CalculatorService {
    public double calculate (double a, double b, String type) {
        switch (type) {
            case "sum":
                return sum(a, b);
            case "sub":
                return sub(a, b);
            case "mult":
                return mult(a, b);
            case "div":
                return div(a,b);
        }
        return 0;
    }

    private double sum(double a, double b) {
        return a + b;
    }

    private double sub(double a, double b) {
        return a - b;
    }

    private double mult(double a, double b) {
        return a * b;
    }
    private double div(double a, double b) {
        return a / b;
    }
}
