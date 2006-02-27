/*
 * Topology.java
 *
 * Created on January 17, 2003, 6:28 PM
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

package net.sourceforge.cilib.PSO;

import java.io.*;
import java.util.*;

/**
 * This interface is implemented by all neighbourhood topologies. It provides a way
 * to iterate over all the particles as well as all the particles within a neighbourhood
 * of a particular particle.
 *
 * @author  espeer
 */
public interface Topology extends Serializable {

    /**
     * Returns an <code>Iterator</code> over all the particles in the topology.
     * 
     * @return A particle iterator.
     */
    public Iterator particles();
    
    /**
     * Returns an <code>Iterator</code> over all particles in the neighbourhood of
     * the particle referred to by the given <code>Iterator</code>.
     * 
     * @param An iterator that refers to a particle in this topology.
     * @return A particle iterator.
     */
    public Iterator neighbourhood(Iterator iterator);
    
    /** 
     * Initialises the topology.
     */
    public void initialise(Class particleClass); 
}
