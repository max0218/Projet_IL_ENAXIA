package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import buildOrder.BOFactory;
import buildOrderBuilder.*;
import interfaces.*;
import objectif.Objectif;
import unités.*;


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
		obj.addUnit(new Caserne());
		IOptimizer bob=new NaiveBuilder();
		IBuildOrder bo=bob.getBO(obj);
		
		System.out.println(bo.toString());
		System.out.println("GG");
	}
	

}
