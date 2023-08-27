package project;
import java.util.Set;;

public class worker {
    private String uid;
    private String name;
    private Set<String> projects;

    public worker(String idEntry, String nameEntry){
        uid = idEntry;
        name = nameEntry;
    }

    public Set<String> getProjects() {
        return projects;
    }

    public boolean addproject(String newProj){
        if (projects.contains(newProj)){
            return false;
        }
        else{
            projects.add(newProj);
            return true;
        }
    }

    public boolean removeProject(String remProj){
        if (projects.contains(remProj)){
            projects.remove(remProj);
            return true;
        }
        else{
            return false;
        }
    }
}
