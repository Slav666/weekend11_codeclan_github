import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Repository repository;
    Commit commit;
    Commit commit1;
    Commit commit2;

    @Before
    public void before() {
        repository = new Repository("codeclan", "homework", RepoType.PRIVATE);
        commit = new Commit("First commit", CommitType.FEATURE, 1);
        commit1 = new Commit("Second commit", CommitType.BUGFIX, 2);
        commit2 = new Commit("Third commit", CommitType.FEATURE, 3);
    }

    @Test
    public void canGetName() {
        assertEquals("codeclan", repository.getName());
    }

    @Test
    public void canGetDescription(){
        assertEquals("homework", repository.getDescription());
    }

    @Test
    public void canGetRepoType(){
        assertEquals(RepoType.PRIVATE, repository.getRepoType());
    }


    @Test
    public void canfindCommit(){
        assertEquals(1, repository.findCommit(1));

    }
//    @Test
//    public void canfindCommitByType(){
//        assertEquals(1, repository.findCommitByType(CommitType.FEATURE));
//
//    }


}
