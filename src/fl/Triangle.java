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
class Triangle extends Fuzzy {

    private final double x0;
    private final double x1;
    private final double x2;

    Triangle(double x0, double x1, double x2) {
        if (!valid(x0, x1, x2)) {
            throw new IllegalArgumentException();
        }

        this.x0 = x0;
        this.x1 = x1;
        this.x2 = x2;
    }

    private boolean valid(double x0, double x1, double x2) {
        return (x0 < x1) && (x1 < x2);
    }

    @Override
    double value(double x) {
        if (x <= x0 || x >= x2) {
            return 0;
        }

        if (x == x1) {
            return 1;
        }

        if (x < x1) {
            return (x - x0) / (x1 - x0);
        }

        return (x2 - x) / (x2 - x1);
    }
}
