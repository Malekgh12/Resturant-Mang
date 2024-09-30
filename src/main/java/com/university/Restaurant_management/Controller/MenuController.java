package com.university.Restaurant_management.Controller;


import com.university.Restaurant_management.Entity.Menu;
import com.university.Restaurant_management.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Menu")
public class MenuController {
    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService){
        this.menuService = menuService;
    }

    @GetMapping
    public ResponseEntity<List<Menu>> getAllMenu(){
        List<Menu> Menu = menuService.getAllMenu();
        return new ResponseEntity<>(Menu, HttpStatus.OK);
    }

}
