package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(job3.getName(), "Product tester");
        assertTrue(job3.getName() instanceof String);
        assertEquals(job3.getEmployer().getValue(), "ACME");
        assertTrue(job3.getEmployer() instanceof Employer);
        assertEquals(job3.getLocation().getValue(), "Desert");
        assertTrue(job3.getLocation() instanceof Location);
        assertEquals(job3.getPositionType().getValue(), "Quality control");
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertEquals(job3.getCoreCompetency().getValue(), "Persistence");
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String firstChar = String.valueOf(job4.toString().charAt(0));
        String lastChar = String.valueOf(job4.toString().charAt(job4.toString().length()-1));
        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.toString().contains("ID: "+job1.getId()));
        assertTrue(job1.toString().contains("Name: "+job1.getName()));
        assertTrue(job1.toString().contains("Employer: "+job1.getEmployer()));
        assertTrue(job1.toString().contains("Location: "+job1.getLocation()));
        assertTrue(job1.toString().contains("Position Type: "+job1.getPositionType()));
    }

    @Test
    public void testToStringHandlesEmptyField (){
        Job job1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertTrue(job1.toString().contains("ID: " + job1.getId()));
        assertTrue(job1.toString().contains("Name: Data not available"));
        assertTrue(job1.toString().contains("Employer: Data not available"));
        assertTrue(job1.toString().contains("Location: Data not available"));
        assertTrue(job1.toString().contains("Position Type: Data not available"));
    }
}
