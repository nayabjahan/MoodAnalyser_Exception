package com.moodAnalyser;

public class MoodAnalyser {
    public static void main(String[] args) {
        System.out.println("welcome to Mood Analyser Programme");
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println(moodAnalyser.analyseMood("Hi, I Am Nayab , I am sad"));
    }

    public String analyseMood(String message) {
        return "sad";
    }
}
