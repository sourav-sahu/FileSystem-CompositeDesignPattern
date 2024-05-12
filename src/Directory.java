import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String name;
    List<FileSystem> contents;
    public Directory(String name){
        this.name=name;
        contents=new ArrayList<>();
    }
    public void addContent(FileSystem fileSystem){
        contents.add(fileSystem);
    }
    public void pr(){
        System.out.println("Directory : " +name);
        for (FileSystem file:contents){
            file.pr();
        }
    }
}
