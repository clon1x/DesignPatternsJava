package com.lvl.patterns.structural.composite.client;

import com.lvl.patterns.structural.composite.neuralnetwork.Neuron;
import com.lvl.patterns.structural.composite.neuralnetwork.NeuronLayer;

public class NeuronDemo {

    public static void main(String[] args) {
	
	Neuron neuron1 = new Neuron();
	Neuron neuron2 = new Neuron();
	NeuronLayer layer1 = new NeuronLayer();
	NeuronLayer layer2 = new NeuronLayer();

	neuron1.connectTo(neuron2);
	neuron1.connectTo(layer1);
	layer1.connectTo(neuron1);
	layer1.connecTo(layer2);
	
    }

}
