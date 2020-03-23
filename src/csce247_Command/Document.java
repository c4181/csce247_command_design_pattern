package csce247_Command;

/**
 * @author Divine Walker
 * @version 1.0
 * @since 03-23-2020
 */

public class Document {
    public String name;

    /**
     * 
     * @param name
     */
    public Document(String name) {
        this.name = name;
        System.out.println("Document named " + name + " is created.");
    }

    public void load() {
        System.out.println("Document " + name + " is loaded into view");
    }

    public void save() {
        System.out.println("Document " + name + " is being saved...");
    }

    public void spellCheck() {
        System.out.println("Document " + name + " is being checked for spelling errors");
    }

    public void print() {
        System.out.println("Document " + name + " is printing...");
    }
}