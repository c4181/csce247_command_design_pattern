package csce247_Command;

import java.util.HashMap;

/**
 * This class parses all input commands for the document editor and calls the appropriate Command
 * 
 * @author Christopher Moyer
 *
 */
public class InputHandler {
  private HashMap<String, Command> commands;

  /**
   * Constructs a new InputHandler using the specified document
   * 
   * @param document Document to be opened
   */
  public InputHandler(Document document) {
    commands = new HashMap<String, Command>();
    commands.put("load", LoadCommand);
    commands.put("save", SaveCommand);
    commands.put("spell", SpellCheckCommand);
    commands.put("print", PrintCommand);
  }

  /**
   * Checks if the command entered is valid and calls the appropriate command
   * 
   * @param data Command to be executed
   */
  public void inputEntered(String data) {
    if (commands.containsKey(data) == false) {
      System.out.println("Sorry, we don't recognize that command");
      return;
    }
    commands.get(data).execute();
  }
}
