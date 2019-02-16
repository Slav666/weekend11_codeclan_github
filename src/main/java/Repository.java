import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepoType repoType;
    private ArrayList<Commit> commits;

    public Repository(String name, String description, RepoType repoType){
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<>();
    }

    public String getName(){
       return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public RepoType getRepoType(){
        return this.repoType;
    }

    public Commit findCommit(int uniqueId) {
        Commit findCommit = null;
        for (Commit commits : this.commits) {
            if (commits.getUniqueId() == uniqueId) {
                findCommit = commits;
            }
        }
        return findCommit;
    }

//    public Commit findCommitByType(String commitType){
//        Commit foundCommitByType = null;
//        for (Commit commits : this.commits) {
//            if (commits.getCommitType() == commitType)
//                foundCommitByType = commits;
//            }
//
//        }
//        return foundCommitByType;
    }





