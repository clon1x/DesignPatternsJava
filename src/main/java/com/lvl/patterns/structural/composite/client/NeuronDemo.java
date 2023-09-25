package com.lvl.patterns.structural.composite.client;

import com.lvl.patterns.structural.composite.neuralnetwork.Neuron;
import com.lvl.patterns.structural.composite.neuralnetwork.NeuronLayer;
import com.lvl.patterns.structural.composite.neuralnetwork.SomeNeurons;

public class NeuronDemo {
    
    
    public static void main(String[] args) {
	
	SomeNeurons neuron1 = new Neuron();
	SomeNeurons neuron2 = new Neuron();
	SomeNeurons layer1 = new NeuronLayer();
	SomeNeurons layer2 = new NeuronLayer();

	neuron1.connectTo(neuron2);
	neuron1.connectTo(layer1);
	layer1.connectTo(neuron1);
	layer1.connectTo(layer2);
	
	
	System.out.println(neuron1);
    }

}
