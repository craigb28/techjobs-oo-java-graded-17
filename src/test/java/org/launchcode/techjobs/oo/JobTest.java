package org.launchcode.techjobs.oo;

import org.junit.Test;

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
}
