package com.munnicha.patterns.gof.behavior.command.receiver;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author munnicha
 */
public class Library {
    
    private Map<String,Document> documents;
    
    public Library(){
        documents = new HashMap<>();
    }
    
    public void add(String title, Document doc){
        documents.put(title, doc);
    }

    public Map<String, Document> getDocuments() {
        return documents;
    }

    public void delete(String title){
        documents.remove(title);
    }
}
