// Composite Pattern

// Component interface
public interface FileSystemComponent {
    void print(int indent);
}

// Leaf component
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
        System.out.println(name);
    }
}

// Composite component
public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void print(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
        System.out.println(name);

        for (FileSystemComponent child : children) {
            child.print(indent + 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory documents = new Directory("documents");
        Directory pictures = new Directory("pictures");

        root.add(documents);
        root.add(pictures);

        documents.add(new File("document1.txt"));
        documents.add(new File("document2.txt"));

        pictures.add(new File("picture1.jpg"));
        pictures.add(new File("picture2.jpg"));

        root.print(0);
    }
}
