package io.quicktype;

public class Message {
    private A a;
    private String greeting;
    private String[] instructions;

    public A getA() { return a; }
    public void setA(A value) { this.a = value; }

    public String getGreeting() { return greeting; }
    public void setGreeting(String value) { this.greeting = value; }

    public String[] getInstructions() { return instructions; }
    public void setInstructions(String[] value) { this.instructions = value; }
}
