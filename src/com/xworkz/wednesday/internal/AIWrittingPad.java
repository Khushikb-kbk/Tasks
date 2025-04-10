package com.xworkz.wednesday.internal;

public class AIWrittingPad
{
    private String handwritingStyle;
    private boolean grammarCorrection;
    private int memoryPages;

    public AIWrittingPad(String handwritingStyle, boolean grammarCorrection, int memoryPages) {
        this.handwritingStyle = handwritingStyle;
        this.grammarCorrection = grammarCorrection;
        this.memoryPages = memoryPages;
    }

    @Override
    public String toString() {
        return "Style: " + handwritingStyle + ", Grammar Correction: " + grammarCorrection + ", Pages: " + memoryPages;
    }
    @Override
    public int hashCode() {
        return 90;
    }
}



