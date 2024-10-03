package com.university.Restaurant_management.MenuService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/AddMenu")
    public Menu createMenu(@RequestBody Menu menu) {
        return menuService.createMenu(menu);
    }

    @GetMapping
    public ResponseEntity<List<Menu>> getAllMenu(){
        List<Menu> Menu = menuService.getAllMenu();
        return new ResponseEntity<>(Menu, HttpStatus.OK);
    }
    @PutMapping("/{id}")

    public Menu UpdateMenu(@PathVariable Long id, @RequestBody Menu menuDetails) {
        return menuService.UpadteMenu(id, menuDetails);
    }

    @DeleteMapping("/{id}")

    public ResponseEntity<?> deleteMenu(@PathVariable Long id ){
        menuService.deleteMenu(id);
        return ResponseEntity.ok().build();
    }

}
