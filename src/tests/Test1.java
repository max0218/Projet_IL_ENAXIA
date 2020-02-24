package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import buildOrder.BOFactory;
import buildOrderBuilder.*;
import interfaces.*;
import objectif.Objectif;
import techTree.*;


// my yellow SUBmOOrine 

public class Test1 {

	@Before
	public void setUp() throws Exception {
		
	}
/*
	@Test
	public void test1() {
		//bouchon BOBuilder? sans objectif
		IOptimizer bob=new MockBuilder();
		IBuildOrder bo=bob.getBO(null);
		System.out.println(bo.toString());
		System.out.println("GG");
	}
	
*/
	
	@Test
	public void test2() {
		//bouchon BOBuilder? sans objectif
		IObjectif obj=new Objectif();
		obj.addUnit(Unit.Factory.createHall(1));
		obj.addUnit(Unit.Factory.createBoss(1));
		IOptimizer naive=new NaiveBuilder();
		IBuildOrder bo=naive.getBO(obj);
		System.out.println(bo.toString());
		System.out.println("GG");
	}

}
