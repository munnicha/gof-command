package com.munnicha.patterns.gof.behavior.command.commands;

import com.munnicha.patterns.gof.behavior.command.receiver.Document;

/**
 *
 * @author munnicha
 */
public class CloseDocumentCommand  implements BaseCommand{
    
    private Document doc;

    public CloseDocumentCommand(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.close();
    }
    
}
