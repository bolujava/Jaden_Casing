package org.example;

//capitalizing every first letter of each word.
public class Main {
    public static String capitalizer(String s){
        String [] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word: words){
            if (!word.isEmpty()){
                char firstchar = Character.toUpperCase(word.charAt(0));
                result.append(firstchar).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(capitalizer("hello pe. ople in neptune 1234"));
    }
}















