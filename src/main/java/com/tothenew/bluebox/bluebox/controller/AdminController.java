package com.tothenew.bluebox.bluebox.controller;

import com.tothenew.bluebox.bluebox.configuration.MessageResponseEntity;
import com.tothenew.bluebox.bluebox.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

  @Autowired
  private AdminService adminService;


  @GetMapping(path = "/")
  public String adminTest() {
    return "Hello Admin";
  }

  @GetMapping(path = "/test-hello")
  public String test() {
    return "Hello World ";
  }

  /*
    URI for Getting the list of all Customers registered into the system.
    @Response - List of Objects with Customer id, Full name and activation status of Customer.
   */
  @GetMapping(path = "/customers")
  public ResponseEntity<MessageResponseEntity> getAllCustomers() {
    return adminService.getAllCustomers();
  }


  /*
    URI for Getting the list of all sellers registered into the system.
    @Response - List of Objects with Seller id, Full name and activation status, Address, company name
    and company contact of Seller.

    @missing - Still not returns Address
   */
  @GetMapping(path = "/sellers")
  public ResponseEntity<MessageResponseEntity> getAllSellers() {
    return adminService.getAllSellers();
  }

  /*
    URI to activate an user.
    @Response - User is Activated message if user exists in the system else User is not present message
   */
  @PatchMapping(path = "/activate/{id}")
  public ResponseEntity<MessageResponseEntity> activateUser(@PathVariable Long id) {
    return adminService.activateUser(id);
  }

  /*
   URI to deactivate an user.
   @Response - User is DeActivated message if user exists in the system else User is not present message
  */
  @PatchMapping(path = "/deactivate/{id}")
  public ResponseEntity<MessageResponseEntity> deactivateUser(@PathVariable Long id) {
    return adminService.deactivateUser(id);
  }
}
