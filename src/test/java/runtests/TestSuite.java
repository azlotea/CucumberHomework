package runtests;

import com.endava.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({

        HomePageTest.class,
        OwnersPageTest.class,
        SpecialtiesPageTest.class,
        VeterinariansPageTest.class,
        PetTypePageTest.class
})

public class TestSuite {
}  	