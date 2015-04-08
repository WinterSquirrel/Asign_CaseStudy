/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseStudy;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 *
 * @author Fred
 */
public class ButtonHandler implements EventHandler{
    private CaseStudy caseStudy;
    public ButtonHandler(CaseStudy caseStudy)
    {
        this.caseStudy=caseStudy;
    }
    @Override
    public void handle(Event event) {
      if(event.getSource() instanceof Button)
      {
          Button b=(Button)event.getSource();
          switch(b.getText())
          {
              case "play":caseStudy.currentAnimation.start();
              case "reset":caseStudy.currentAnimation.reset();
          }
          
      }
    }
    
}