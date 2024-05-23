package com.assignment.Assignment.controller;

import com.assignment.Assignment.entity.Customer;
import com.assignment.Assignment.entity.Wish;
import com.assignment.Assignment.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAllCustomer() {
        List<Customer> customers = customerService.GetAllCustomer();
        if (customers != null) {
            return new ResponseEntity<>(customers, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "- Create an API to return the wish list of a customer.\n",
            description = "Retrieve wishlist of a specific customer"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "wishes found successfully",
                            content = @Content(
                                    schema = @Schema(implementation = Wish.class),
                                    mediaType = "application/json"
                            )
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Data not found"
                    )
            }
    )
    public ResponseEntity<List<Wish>> getWishesByCustomerId(@PathVariable(name = "id") Integer id) {
        Customer customer = customerService.getCustomerById(id);
        List<Wish> wishes = customer.getWishes();
        if (wishes != null) {
            return new ResponseEntity<>(wishes, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}
