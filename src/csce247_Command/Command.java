package csce247_Command;

/**
 * Command interface to be implemented by all commands
 * 
 * @author Christopher Moyer
 *
 */
public interface Command {
  /**
   * Method to be called when a command is to be executed by the user
   */
  public void execute();
}
