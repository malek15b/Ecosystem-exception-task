import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class StudentRepoTest {

    @Test
    public void findById_ShouldBeReturn_Exception(){
        //Given
        String studentId = UUID.randomUUID().toString();
        //THEN
        assertThrows(NoSuchElementException.class, () -> {
            StudentRepo studentRepo = new StudentRepo();
            studentRepo.findById(studentId);
        });
    }

}