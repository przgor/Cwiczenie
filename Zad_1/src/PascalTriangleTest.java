import static org.junit.Assert.*;

import org.junit.Test;

public class PascalTriangleTest {

	@Test(expected = NullPointerException.class)
    public void pascalTriangleTest1() {
PascalTriangle pascalTriangle = PascalTriangle.compute(0);
}
	
	
@Test
public void pascalTriangleTest2() {
PascalTriangle pascalTriangle = PascalTriangle.compute(1);
int tab[][]= pascalTriangle.getTriangle();

assertTrue(tab[0][0]==1);
}
@Test
public void pascalTriangleTest3() {
PascalTriangle pascalTriangle = PascalTriangle.compute(4);
int tab[][]= pascalTriangle.getTriangle();

assertEquals(tab[0][0],1);
assertEquals(tab[1][0],1);
assertEquals(tab[1][1],1);
assertEquals(tab[2][0],1);
assertEquals(tab[2][1],2);
assertEquals(tab[2][2],1);
}

@Test(expected = NullPointerException.class)
public void pascalTriangleTest4() {
PascalTriangle trojkatPascala = PascalTriangle.compute(-3);

}


}
