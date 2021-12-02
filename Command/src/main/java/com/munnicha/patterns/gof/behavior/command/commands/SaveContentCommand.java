package com.munnicha.patterns.gof.behavior.command.commands;

import com.munnicha.patterns.gof.behavior.command.receiver.Document;
import java.util.Scanner;

/**
 *
 * @author munnicha
 */
public class SaveContentCommand implements BaseCommand{
    
    private Document doc;

    public SaveContentCommand(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter content");
        String content = scanner.nextLine();
        doc.saveContent(content);
        System.out.println("Content is saved.");
    }
    
}
