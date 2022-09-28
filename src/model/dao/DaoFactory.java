package model.dao;

import model.dao.impl.SellerDaoJDBC;

// a classe retorna um método do tipo da interface, mas internamente instancia uma implementação.
public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
