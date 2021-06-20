package com.cgi.api.dao.service;

import com.cgi.api.core.model.Grocery;

import java.util.List;

/**
 * @author Aashish Thakran
 * @version 1.0
 */
public interface IGroceryDao {

    void saveAll(List<Grocery> groceryList);

    List<String> getDistinctNames();

    List<Grocery> findAllByName(String name);
}
