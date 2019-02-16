import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount;
    Repository repository;
    Repository repository1;

    @Before
    public void before() {
        gitHubAccount = new GitHubAccount("slav666", "Slawomir Dyk", AccountType.FREE );
        repository = new Repository("Slav-homework", "why coding is so hard?", RepoType.PUBLIC);
        repository1 = new Repository("Alex_work", "it's not hard for me", RepoType.PRIVATE);
    }

    @Test
    public void canGetUserName() {
        assertEquals("slav666", gitHubAccount.getUserName());
    }

    @Test
    public void canGetName(){
        assertEquals("Slawomir Dyk", gitHubAccount.getName());
    }

    @Test
    public void canGetAccountType(){
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }
    @Test
    public void canAddRepository(){
    gitHubAccount.addRepository(repository);
    gitHubAccount.addRepository(repository1);
        assertEquals(2, gitHubAccount.repositoryCount());
    }

    @Test
    public void canFindRepositoryByName(){
        gitHubAccount.findRepositoryByName();
        assertEquals("Alex_work", repository1.getName());
    }


}
