package com.lvl.patterns.structural.composite.neuralnetwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * A neuron has in and out connections from/to other neurons.
 */
public class Neuron implements SomeNeurons {

    public List<Neuron> in = new ArrayList<>();
    public List<Neuron> out = new ArrayList<>();
    
    @Override
    public void forEach(Consumer<? super Neuron> action) {
	action.accept(this);
    }

    @Override
    public Iterator<Neuron> iterator() {
        return Collections.singleton(this).iterator();
    }

    @Override
    public Spliterator<Neuron> spliterator() {
        return Collections.singleton(this).spliterator();
    }


}
