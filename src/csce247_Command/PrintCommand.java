package csce247_Command;
/**
 * 
 * @author Chen
 *
 */
public class PrintCommand implements Command{
	private Document document;
	public PrintCommand(Document doc) {
		this.document=doc;
	}
	public void execute() {
		document.print();
	}
}
