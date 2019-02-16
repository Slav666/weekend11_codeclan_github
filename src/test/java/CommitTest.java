import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class CommitTest {

    Commit commit;
    Commit commit1;
    Commit commit2;

    @Before
    public void before() {
        commit = new Commit("Add first com", CommitType.FEATURE, 1);
        commit1 = new Commit("Add second com", CommitType.BUGFIX, 2);
        commit2 = new Commit("Add second com", CommitType.BUGFIX, 3);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Add first com", commit.getDescription());
    }

    @Test
    public void canGetCommitType(){
        assertEquals(CommitType.FEATURE, commit.getCommitType());
    }

    @Test
    public void canGetUniqueId(){
        assertEquals(1, commit.getUniqueId());
    }
}
