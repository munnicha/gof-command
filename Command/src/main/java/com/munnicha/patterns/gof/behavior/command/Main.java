package com.munnicha.patterns.gof.behavior.command;

import com.munnicha.patterns.gof.behavior.command.commands.CloseDocumentCommand;
import com.munnicha.patterns.gof.behavior.command.commands.CopyDocumentCommand;
import com.munnicha.patterns.gof.behavior.command.commands.CreateNewDocumentCommand;
import com.munnicha.patterns.gof.behavior.command.commands.OpenDocumentCommand;
import com.munnicha.patterns.gof.behavior.command.commands.SaveContentCommand;
import com.munnicha.patterns.gof.behavior.command.invoker.MenuItem;
import com.munnicha.patterns.gof.behavior.command.receiver.Library;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author munnicha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library lib = new Library();
        
        MenuItem menu=new MenuItem();
        System.out.println("Create and open new document");
        menu.onClick(new CreateNewDocumentCommand(lib));
        
        System.out.println("Close documents");
        for(String t: lib.getDocuments().keySet()){
            System.out.println(t);
            menu.onClick(new CloseDocumentCommand(lib.getDocuments().get(t)));
        }
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter document title to open");
        String title = scanner.nextLine();
        menu.onClick(new OpenDocumentCommand(lib.getDocuments().get(title)));
        
        System.out.println("Let's save content to: "+title);
        menu.onClick(new SaveContentCommand(lib.getDocuments().get(title)));
        
        System.out.println("Close document: "+title);
        menu.onClick(new CloseDocumentCommand(lib.getDocuments().get(title)));
        
        System.out.println("Create a copy of a document");
        menu.onClick(new CopyDocumentCommand(lib));
        
        System.out.println("Available documents");
        for(String t: lib.getDocuments().keySet()){
            System.out.println(t);
        }
        
        scanner = new Scanner(System.in); 
        System.out.println("Enter document title to open");
        title = scanner.nextLine();
        menu.onClick(new OpenDocumentCommand(lib.getDocuments().get(title)));
        
        
    }
    
}
