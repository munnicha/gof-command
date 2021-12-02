package com.munnicha.patterns.gof.behavior.command.commands;

import com.munnicha.patterns.gof.behavior.command.receiver.Document;

/**
 *
 * @author munnicha
 */
public class OpenDocumentCommand implements BaseCommand{
    
    private Document doc;

    public OpenDocumentCommand(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }

}
