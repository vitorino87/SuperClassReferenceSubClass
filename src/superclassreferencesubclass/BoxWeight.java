/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclassreferencesubclass;

/**
 *
 * @author tiago.lucas
 */
public class BoxWeight extends Box{
    double weight;
    BoxWeight(double w, double h, double d, double m){
        width=w;
        height=h;
        depth=d;
        weight=m;
    }
}
