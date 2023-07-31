package com.example.bankdemo.controller;

import com.example.bankdemo.data.Customer;
import com.example.bankdemo.data.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;
import java.util.List;

@Controller
public class CustomerController {
    private CustomerDao customerDao;


    @GetMapping("/")
    public String home(Model model) throws SQLException {
        List<Customer> customers = customerDao.findAll();
        model.addAttribute("customers", customers);
        return "home";
    }

    @GetMapping("/create")
    public String create() {

        return "create";
    }

    @PostMapping("/create")
    public String save() {
        return "test";
    }

    @GetMapping("/edit")
    public String edit()
    {
        return "edit";
    }
    @PostMapping("/edit")
    public String update()
    {
        return "test";
    }

}
