package com.sqli.demoIOC.service.Impl;

import com.sqli.demoIOC.dao.Impl.ProduitDAOMock;
import com.sqli.demoIOC.dao.ProduitDAO;
import com.sqli.demoIOC.model.Produit;
import com.sqli.demoIOC.service.ProduitService;

import java.util.List;

public class ProduitServiceImpl implements ProduitService {

    ProduitDAO produitDAO;
    @Override
    public List<Produit> getAll() {
        return produitDAO.getAll();
    }

    public void setProduitDAO(ProduitDAOMock produitDAO) {
        this.produitDAO=produitDAO;
    }
}
