package br.dev.rodrigocury.loja;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {

	@Test
	public void test() {
		String taErrado = "TA ERRADO";
		
		Produto p = new Produto("Rodrigo");
		
		Assert.assertEquals(taErrado , "Rodrigo", p.getNome());
		
		p.setNome("batatinha");
		
		Assert.assertEquals(taErrado , "batatinha", p.getNome());
		
		Produto p1 = new Produto("batatinha");
		
		Assert.assertEquals(taErrado , p, p1);
		
	}

}
