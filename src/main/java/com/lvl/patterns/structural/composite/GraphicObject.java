package com.lvl.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphicObject {

    protected String name = "Group";
    public String color;
    public List<GraphicObject> children = new ArrayList<>();
    
    public GraphicObject() {
	
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	print(builder, 0);
	return builder.toString();
    }


    private void print(StringBuilder builder, int depth) {
	builder.append(String.join("", Collections.nCopies(depth, "*")))
	  .append(depth > 0 ? " " : "")
	  .append((color == null || color.isEmpty()) ? "" : color + " ")
	  .append(getName())
	  .append(System.lineSeparator());
	for (GraphicObject child : children)
	    child.print(builder, depth + 1);
    }
    
    
    
}
