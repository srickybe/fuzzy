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
class ReverseGrade extends Fuzzy {

    private final double x0;
    private final double x1;

    ReverseGrade(double x0, double x1) {
        if (!valid(x0, x1)) {
            throw new IllegalArgumentException();
        }
        
        this.x0 = x0;
        this.x1 = x1;
    }

    private boolean valid(double x0, double x1) {
        return x0 < x1;
    }

    @Override
    double value(double x) {
        if (x <= x0) {
            return 1;
        }

        if (x >= x1) {
            return 0;
        }

        return (x1 - x) / (x1 - x0);
    }
}
