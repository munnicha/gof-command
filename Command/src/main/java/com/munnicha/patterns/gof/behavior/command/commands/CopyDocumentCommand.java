package com.munnicha.patterns.gof.behavior.command.commands;

import com.munnicha.patterns.gof.behavior.command.receiver.Document;
import com.munnicha.patterns.gof.behavior.command.receiver.Library;
import java.util.Scanner;

/**
 *
 * @author munnicha
 */
public class CopyDocumentCommand implements BaseCommand{
    
    private Library lib;

    public CopyDocumentCommand(Library lib) {
        this.lib = lib;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter document title to copy");
        String title = scanner.nextLine();
        System.out.println("Title is: " + title);
        Document copyDocument=lib.getDocuments().get(title).copy();
        lib.getDocuments().put(copyDocument.getTitle(),copyDocument);
    }
    
}
