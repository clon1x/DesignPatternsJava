package com.lvl.patterns.structural.composite.neuralnetwork;

import java.util.ArrayList;

/**
 * A neuron has in and out connections from/to other neurons.
 */
public class Neuron {

    public ArrayList<Neuron> in, out;
    
    public void connectTo(Neuron other) {
	out.add(other);
	other.in.add(this);
    }
}
