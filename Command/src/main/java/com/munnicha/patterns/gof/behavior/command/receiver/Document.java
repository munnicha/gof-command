package com.munnicha.patterns.gof.behavior.command.receiver;

/**
 *
 * @author munnicha
 */
public class Document {
    
    private String title;
    private String content;
    private boolean isOpen;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
        this.isOpen=false;
    }
    
    public void open(){
        System.out.println("The document is open:\r\n"+title);
        System.out.println("Content:\r\n"+content);
        isOpen=true;
    }
    
    public void saveContent(String content){
       this.content=content;
    }
    
    public void close(){
        System.out.println("The document is closed: "+title);
        isOpen=false;
    }
    
    public Document copy(){
        String copyTitle=title+" Copy";
        return new Document(copyTitle,content);
    }

    public String getTitle() {
        return title;
    }

    public boolean isIsOpen() {
        return isOpen;
    }


}
