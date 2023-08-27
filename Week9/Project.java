package project;
import java.util.Set;

public class Project {
    private String uid;
    private String title;
    private Set<String> collaborators;

    public Project(String idEntry, String titleEntry){
        uid = idEntry;
        title = titleEntry;
    }

    public Set<String> getCollaborators() {
        return collaborators;
    }

    public boolean addCollaborator(String newID){
        if (collaborators.contains(newID)){
            return false;
        }
        else{         
            collaborators.add(newID);
            return true;
        }
    }

    public boolean removeCollaborator(String remID){
        if (collaborators.contains(remID)){
            collaborators.remove(remID);
            return true;
        }
        else{
            return false;
        }
    }
}
