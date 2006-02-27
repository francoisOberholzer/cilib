/*
 * Rastrigin.java
 *
 * Created on January 12, 2003, 3:55 PM
 *
 * 
 * Copyright (C) 2003 - Edwin S. Peer
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA 
 *   
 */

package net.sourceforge.cilib.Functions;


import net.sourceforge.cilib.Problem.*;
import java.util.*;

/**
 *
 * @author  espeer
 */
public class Rastrigin extends Function {
    
    public static final int DEFAULT_DIMENSION = 30;
    public static final Domain DEFAULT_DOMAIN = new Domain(-5.12, 5.12);
    
    public Rastrigin() {
        super(DEFAULT_DIMENSION, DEFAULT_DOMAIN, 0);
    }
    
    public double evaluate(double[] x) {
        double tmp = 0;
        for (int i = 0; i < dimension; ++i) {
            tmp += x[i] * x[i] - 10.0 * Math.cos(2 * Math.PI * x[i]) + 10;
        }
        return tmp;
    }
}
