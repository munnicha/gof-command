package com.munnicha.patterns.gof.behavior.command.commands;

import com.munnicha.patterns.gof.behavior.command.receiver.Document;
import com.munnicha.patterns.gof.behavior.command.receiver.Library;
import java.util.Scanner;

/**
 *
 * @author munnicha
 */
public class CreateNewDocumentCommand implements BaseCommand{
    
    private Library library;

    public CreateNewDocumentCommand(Library library) {
        this.library = library;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter title");
        String title = scanner.nextLine();
        System.out.println("Title is: " + title);
        Document newDocument = new Document(title,null);
        library.add(title, newDocument);
        System.out.println("Document is created.");
        newDocument.open();
    }
    
}
