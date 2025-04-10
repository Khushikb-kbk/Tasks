package com.xworkz.wednesday.internal;

public class VoiceTranslator
{
    private String language;
    private boolean offlineSupport;
    private int wordLimit;

    public VoiceTranslator(String language, boolean offlineSupport, int wordLimit) {
        this.language = language;
        this.offlineSupport = offlineSupport;
        this.wordLimit = wordLimit;
    }

    @Override
    public String toString() {
        return "Language: " + language + ", Offline Support: " + offlineSupport + ", Word Limit: " + wordLimit;
    }
    @Override
    public int hashCode() {
        return 920;
    }
}


