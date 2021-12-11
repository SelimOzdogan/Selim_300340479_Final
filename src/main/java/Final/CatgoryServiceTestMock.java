package Final;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CatgoryServiceTestMock {
    @Mock
    SavingInterface cs;
    @InjectMocks
    SavingService cc;

    @Captor
    ArgumentCaptor<String> ss;

    @Test
    void retrievecats() {
//        List<Saving> cats = Arrays.asList(new Saving("catcode1","catdesc1"),
//                                            new Saving("catcode2","catcode2"));
//        Mockito.when(cs.retrieveTodos()).thenReturn(cats);
//
//        List<Saving> ff = cc.retrieveTodos();
//        assertEquals(1, ff.size());
    }
}
