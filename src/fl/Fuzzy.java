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
abstract class Fuzzy {
    abstract double value(double x);
    
    static double and(double lhs, double rhs) {
        return Math.min(lhs, rhs);
    }
    
    static double or(double lhs, double rhs) {
        return Math.max(lhs, rhs);
    }
    
    static double not(double lhs) {
        return 1.0 - lhs;
    }
}
