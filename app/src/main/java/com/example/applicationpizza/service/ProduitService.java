package com.example.applicationpizza.service;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import com.example.applicationpizza.classes.Produit;
import com.example.applicationpizza.dao.IDao;

public class ProduitService implements IDao<Produit> {

    private List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {
        Log.d("Create : ", o.toString());
        return produits.add(o);
    }

    @Override
    public Produit findById(int id) {
        Log.d("FindById : ", id+"");
        for(Produit f : produits)
            if(f.getid() == id)
                return f;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        Log.d("findAll : ", produits.size()+"");
        return produits;
    }

    @Override
    public boolean delete(Produit o) {
        Log.d("Delete : ", o.toString());
        return produits.remove(o);
    }

    @Override
    public boolean update(Produit o) {
        Produit f = findById(o.getid());
        f.setNom(o.getNom());
        f.setDuree(o.getDuree());
        f.setDescription(o.getDescription());
        f.setPreparation(o.getPreparation());

        return false;
    }
}