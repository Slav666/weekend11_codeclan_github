import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Repository repository;
    Commit commit;
    Commit commit1;
    Commit commit2;


    @Before
    public void before() {
//        ArrayList<Commit> commit;
        repository = new Repository("codeclan", "homework", RepoType.PRIVATE,??);
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
    public void canFindCommit(){
        assertEquals(1, repository.findCommit(1));

    }
//    @Test
//    public void canfindAllCommitByType(){
//        assertEquals(2, repository.findAllCommitByType(CommitType.FEATURE));
//
//    }
    @Test
    public void canAddCommit(){
        repository.addCommit(commit1);
        assertEquals(1, repository.commitCount());
    }

    @Test
    public void canGetAllTypeOfCommits(){
        repository.addCommit(commit1);
        repository.addCommit(commit2);
        repository.addCommit(commit);
        ArrayList<Commit> commitsOfType = repository.getAllCommitsOfType(CommitType.BUGFIX);
        assertEquals(1, commitsOfType.size());
    }
}
