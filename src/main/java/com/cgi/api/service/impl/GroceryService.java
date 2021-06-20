package com.cgi.api.service.impl;

import com.cgi.api.core.model.Grocery;
import com.cgi.api.dao.service.IGroceryDao;
import com.cgi.api.service.IGroceryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Aashish Thakran
 * @version 1.0
 */
@Service
@Validated
@RequiredArgsConstructor
public class GroceryService implements IGroceryService {

    private final IGroceryDao groceryDao;

    @Override
    public void saveAll(@Valid List<Grocery> groceryList) {
        groceryDao.saveAll(groceryList);
    }

    @Override
    public List<String> getDistinctNames() {
        return groceryDao.getDistinctNames();
    }

    @Override
    public List<Grocery> getAllByName(String name) {
        return groceryDao.findAllByName(name);
    }
}
