package project;
import java.util.Map;

public class Department {
    private String name;
    private Map<String, worker> workers;
    private Map<String, Project> projects;

    public Department(String depName){
        name = depName;
    }

    public worker getWorker(String newID){
            return(workers.get(newID));
    }

    public Project getProject(String newID){
        return(projects.get(newID));
    }
}
