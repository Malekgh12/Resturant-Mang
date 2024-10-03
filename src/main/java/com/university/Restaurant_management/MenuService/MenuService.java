package com.university.Restaurant_management.MenuService;


import com.university.Restaurant_management.exceptions.ResourceNotFoundException;
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

    public Menu UpadteMenu(Long id , Menu menuDetails){
        Menu menu = menuRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Menu not found"));

        menu.setEntrees(menuDetails.getEntrees());
        menu.setSuite(menuDetails.getSuite());
        menu.setDessert(menuDetails.getDessert());
        menu.setPrix(menuDetails.getPrix());

        return menuRepository.save(menu);

    }

    public void deleteMenu(Long id){
        Menu menu = menuRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Menu not found"));

        menuRepository.delete(menu);
    }

}
