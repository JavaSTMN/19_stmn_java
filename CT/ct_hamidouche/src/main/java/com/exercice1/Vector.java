/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercice1;

import java.lang.Math;

/**
 *
 * @author mehdi
 */
public class Vector {

    public float v1;
    public float v2;
    
    public Vector(float v1, float v2) {
        this.v1=v1;
        this.v2=v2;
    }
    
    public float norm () {
       float normV;
       
       normV = (float) java.lang.Math.sqrt((v1*v1)+(v2*v2));
       
       return normV;
    }
    
    public Vector scale(float k) {
        
        Vector w = new Vector(k*this.v1,k*this.v2);
        return w;
        
    }
    
    public Vector normalize() {
        float w1 = this.v1/this.norm();
        float w2 = this.v2/this.norm();
        Vector w =new Vector(w1,w2);
        return w;
    }
    
    public Vector add (Vector w) {
        float x1 = this.v1 + w.v1;
        float x2 = this.v2 + w.v2;
        Vector x = new Vector(x1,x2);
        return x;
    }
    
    
}
