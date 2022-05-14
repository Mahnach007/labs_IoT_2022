package test;




import java.util.ArrayList;

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


class CallCenterManagerTest{
	
	

	CallCenterManager manager;
	 
	ArrayList<CallCenterEquipment> items;
	 
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		manager = new CallCenterManager();
		items = new ArrayList<CallCenterEquipment>();
		items.add(new Phone(16,"cee","Apple234", 23, "wqd"));
		items.add(new Computer(16,"12","Bpple234","13","213"));
		items.add(new Monitor(13,"12","Cpple233",13.213,"213"));
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void findByPriceTest() throws Exception{
		var expectedFindPrice = 16 ;
		var actualFindPrice = manager.findByPrice(16, items);
		
			for (CallCenterEquipment foundPrice : actualFindPrice) {
		     Assertions.assertEquals(foundPrice.getPrice(),expectedFindPrice);
		}
	}
	@Test
	void findByTypeTest() throws Exception{
		var expectedFindType = "Iphone";
		var actualFindType = manager.findByType("Iphone", items);
		
			for (CallCenterEquipment foundType : actualFindType) {
		     Assertions.assertEquals(foundType.getType(),expectedFindType);
		}
	}
	@Test
	void sortByMarkTest() {
		String [] expectedSortByMark = {"Apple234","Bpple","Sumsung"};
		manager.sortByMark(items);
		Assertions.assertEquals(3,expectedSortByMark.length );
		Assertions.assertEquals("Bpple234", items.get(1).getMark());
		
	}
	@Test
	void reversSortByMark() {
		String [] expectedSortByMark = {"Sumsung","Bpple","Apple234"};
		manager.reversSortByMark(items);
		Assertions.assertEquals(3,expectedSortByMark.length );
		Assertions.assertEquals("Apple234", items.get(2).getMark());
		
	}
	@Test
	void addItemsTest() {
		Assertions.assertFalse(items.isEmpty());
		Assertions.assertEquals(3, items.size());
		
	}
	
}