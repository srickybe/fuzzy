/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl;

/**
 *
 * @author srick
 */
class Trapezoid extends Fuzzy {

    private final double x0;
    private final double x1;
    private final double x2;
    private final double x3;

    Trapezoid(double x0, double x1, double x2, double x3) {
        if (!valid(x0, x1, x2, x3)) {
            throw new IllegalArgumentException();
        }
        
        this.x0 = x0;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    private boolean valid(double x0, double x1, double x2, double x3) {
        return (x0 < x1) && (x1 < x2) && (x2 < x3);
    }

    @Override
    double value(double x) {
        if (x <= x0 || x >= x3) {
            return 0;
        }

        if (x >= x1 && x <= x2) {
            return 1;
        }

        if (x < x1) {
            return (x - x0) / (x1 - x0);
        }

        return (x3 - x) / (x3 - x2);
    }
}
