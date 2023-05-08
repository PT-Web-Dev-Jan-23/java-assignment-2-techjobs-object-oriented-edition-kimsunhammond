package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job = new Job();
        Job jobTwo = new Job();
        //Datatype variableName = new Datatype();
        assertNotEquals(job, jobTwo);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
    Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
    assertEquals(testJob.getEmployer().getValue(), "ACME");
    assertEquals(testJob.getLocation().getValue(), "Desert");
    assertEquals(testJob.getPositionType().getValue(), "Quality control");
    assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
    assertEquals(testJob.getName(), "Product tester");
    assertTrue(testJob.getName().equals("Product tester"));
    assertTrue(testJob.getEmployer().getValue().equals("ACME"));
    assertTrue(testJob.getLocation().getValue().equals("Desert"));
    assertTrue(testJob.getPositionType().getValue().equals("Quality control"));
    assertTrue(testJob.getCoreCompetency().getValue().equals("Persistence"));

    }

    @Test
    public void testJobsForEquality() {
        //Job testJob = new Job();
        //Job testJob2 = new Job();

        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertFalse(testJob.equals(testJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        System.out.println(testJob.toString());
        assertEquals(testJob.toString().charAt(0), ('\n'));
        assertEquals(testJob.toString().charAt(testJob.toString().length() - 1), ('\n'));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        System.out.println(testJob.toString());
        assertEquals(testJob.toString(),"\nID: " + testJob.getId() +
                "\nName: " + testJob.getName() +
                "\nEmployer: " + testJob.getEmployer().getValue() +
                "\nLocation: " + testJob.getLocation().getValue() +
                "\nPosition Type: " + testJob.getPositionType().getValue() +
                "\nCore Competency: " + testJob.getCoreCompetency().getValue() +
                "\n");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("Product tester",
                new Employer(""),
                new Location("Desert"),
                new PositionType(""),
                new CoreCompetency("Persistence"));
        System.out.println(testJob.toString());
        assertEquals(testJob.toString(),"\nID: " + testJob.getId() +
                "\nName: " + testJob.getName() +
                "\nEmployer: " + testJob.getEmployer() +
                "\nLocation: " + testJob.getLocation() +
                "\nPosition Type: " + testJob.getPositionType() +
                "\nCore Competency: " + testJob.getCoreCompetency() +
                "\n");
    }
}
