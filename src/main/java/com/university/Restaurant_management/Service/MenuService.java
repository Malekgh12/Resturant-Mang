package com.university.Restaurant_management.Service;


import com.university.Restaurant_management.Entity.Menu;

import com.university.Restaurant_management.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;


    public  List<Menu> getAllMenu(){
        return menuRepository.findAll();
    }

    public Menu createMenu(Menu menu){
        return menuRepository.save(menu);
    }
}
