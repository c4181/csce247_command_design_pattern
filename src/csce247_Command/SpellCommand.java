package csce247_Command;
/**
 * 
 * @author Chen
 *
 */
public class SpellCommand implements Command{
	private Document document;
	public SpellCommand(Document doc) {
		this.document=doc;		
	}
	public void execute() {
		document.spellCheck();
	}
}
