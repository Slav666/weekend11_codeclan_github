

import java.util.ArrayList;
import java.util.HashMap;

public class GitHubAccount {



    private String userName;
    private String name;
    private ArrayList<Repository> repositories;
    private AccountType accountType;

    public GitHubAccount (String userName, String name, AccountType accountType){

        this.userName = userName;
        this.name = name;
        this.accountType = accountType;
        this.repositories = new ArrayList<>();
    }

    public String getUserName() {
        return this.userName;
    }

    public String getName(){
        return this.name;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public void addRepository( Repository repositories){
        this.repositories.add(repositories);
    }

    public int repositoryCount(){
        return this.repositories.size();
    }

    public Repository findRepositoryByName(String name) {
        Repository findRepositoryByName = null;
        for (Repository repositories : this.repositories) {
            if (repositories.getName() == name) {
                findRepositoryByName = repositories;
            }
        }
        return findRepositoryByName;
    }

    public Repository findAllCommitsCertainType( )


}
