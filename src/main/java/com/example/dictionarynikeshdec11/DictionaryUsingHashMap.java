package com.example.dictionarynikeshdec11;

import java.util.HashMap;
public class DictionaryUsingHashMap {
    private HashMap<String , String> dictionary;

    public DictionaryUsingHashMap(){
        this.dictionary = new HashMap<>();
        addWordList();
    }

    public boolean addWords(String word , String meaning){
        try {
            dictionary.put(word, meaning);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public String getMeaning(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        else{
            return "word does not exits in dictionary";
        }
    }

    private void addWordList(){
      addWords("yes" , " aprreciate");
        addWords("big" , " large");
        addWords("safe" , " secure");
        addWords("drink" , " fluid");
        addWords("vibes" , " signals");
        addWords("A" , " aprreciate");
        addWords("B" , " Ball");
        addWords("C" , " cat");
        addWords("D" , " dog");
        addWords("beautiful" , " pretty");

    }
}
