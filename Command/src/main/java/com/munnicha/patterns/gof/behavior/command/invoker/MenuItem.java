package com.munnicha.patterns.gof.behavior.command.invoker;

import com.munnicha.patterns.gof.behavior.command.commands.BaseCommand;

/**
 *
 * @author munnicha
 */
public class MenuItem {

    public MenuItem() {
        
    }
    
    public void onClick(BaseCommand command){
        command.execute();
    }
    
}
