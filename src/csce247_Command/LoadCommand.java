/**
 * @author Divine Walker
 * @version 1.0
 * @since 03-23-2020
 */
public class LoadCommand implements Command {
    private Document document;

    /**
     * 
     * @param doc
     */
    public loadCommand(Document doc){
        this.document = doc;
    }

    public void execute() {
        document.load();
    }
}