package com.munnicha.patterns.gof.behavior.command.test;

import com.munnicha.patterns.gof.behavior.command.commands.CloseDocumentCommand;
import com.munnicha.patterns.gof.behavior.command.commands.OpenDocumentCommand;
import com.munnicha.patterns.gof.behavior.command.invoker.MenuItem;
import com.munnicha.patterns.gof.behavior.command.receiver.Document;
import com.munnicha.patterns.gof.behavior.command.receiver.Library;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author munnicha
 */
public class CommandTest {
    
    @Test
    public void testOpenDocumentCommand(){
        Library lib = new Library();
        Document doc=new Document("Unit test","Super content");
        lib.getDocuments().put(doc.getTitle(),doc);
        
        MenuItem menu=new MenuItem();
        menu.onClick(new OpenDocumentCommand(doc));
        
        assertTrue(doc.isIsOpen());
                
    }
    
    @Test
    public void testCloseDocumentCommand(){
        Library lib = new Library();
        Document doc=new Document("Unit test","Super content");
        lib.getDocuments().put(doc.getTitle(),doc);
        
        MenuItem menu=new MenuItem();
        menu.onClick(new OpenDocumentCommand(doc));
        menu.onClick(new CloseDocumentCommand(doc));
        
        assertFalse(doc.isIsOpen());
                
    }
    
}
