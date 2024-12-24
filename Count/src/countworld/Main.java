package countworld;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Validation Valid = new Validation();
//        String input = Valid.inputString("Enter your content: ");
//
//        String[] words = input.trim().split(" ");
//
//        Map<String, Integer> wordCount = new HashMap<>();
//        Map<Character, Integer> charCount = new HashMap<>();
//
//        for (String word : words) {
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
//
//        for (char ch : input.toLowerCase().toCharArray()) {
//            if (Character.isLetter(ch)) {
//                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
//            }
//        }

    

//        System.out.println(wordCount);
//        System.out.println(charCount);
    
          Validation Valid=new Validation();
          String input=Valid.inputString("Enter content: ");
          String[]words=input.trim().split(" ");
          
          Map<String, Integer> wordCount=new HashMap<>();
          Map<Character, Integer> charCount=new HashMap<>();
          
          for(String word: words){
              wordCount.put(word,wordCount.getOrDefault(word,0) +1);
          }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          for(char ch:input.toLowerCase().toCharArray()){
              if(Character.isLetter(ch)){
                  charCount.put(ch,charCount.getOrDefault(ch,0)+1);
              }
          }
          System.out.println(wordCount);
          System.out.println(charCount);
    }   
}


