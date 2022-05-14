package test;




import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import manager.CallCenterManager;
import models.CallCenterEquipment;
import models.Computer;
import models.Monitor;
import models.Phone;
import write.CallCenterEquipmentWriter;



class CallCenterEquipmentWriterTest{
	
	CallCenterManager manager;
	CallCenterEquipmentWriter writer = new CallCenterEquipmentWriter();
	ArrayList<CallCenterEquipment> items = new ArrayList<>();
	File csvFile = new File("CallCenterEquipmentWriter.csv");

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	
		items.add(new Phone(16,"cee","Apple234", 23, "wqd"));
		items.add(new Computer(16,"12","Bpple234","13","213"));
		items.add(new Monitor(13,"12","Cpple233",13.213,"213"));
}


	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void writingToFileTest() throws IOException {
		
		Assertions.assertFalse(items.isEmpty());
        try (FileWriter writer1 = new FileWriter(csvFile)) {

            writer.WriteToFile(items);
        }
        assertTrue(csvFile.exists());
    }
}
