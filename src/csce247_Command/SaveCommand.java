package csce247_Command;
/**
 * 
 * @author Chen
 *
 */
public class SaveCommand implements Command{
	private Document document;
	public SaveCommand(Document doc) { 
		this.document=doc;
	}
	public void execute() {
		document.save();
	}
}
