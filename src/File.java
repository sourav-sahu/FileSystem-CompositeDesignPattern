public class File implements FileSystem{
    String name;
    public File(String name){
        this.name = name;
    }
    public void pr(){
        System.out.println("file name="+name);
    }
}
