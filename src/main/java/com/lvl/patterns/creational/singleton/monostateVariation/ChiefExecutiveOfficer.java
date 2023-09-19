package com.lvl.patterns.creational.singleton.monostateVariation;

public class ChiefExecutiveOfficer {
    
    private static String name;
    private static int age;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
	ChiefExecutiveOfficer.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
	ChiefExecutiveOfficer.age = age;
    }
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("ChiefExecutiveOfficer [name=");
	builder.append(name);
	builder.append(", age=");
	builder.append(age);
	builder.append("]");
	return builder.toString();
    }

}
