package com.example.fundscache.API;

import com.example.fundscache.Service.FundService;
import com.example.fundscache.model.FundDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class FundController {

    private final FundService fundService;

    @Autowired
    public FundController(FundService fundService) {
        this.fundService = fundService;
    }

    @PostMapping
    public void addFunds(@RequestBody FundDetails fundDetails)
    {
        fundService.addFunds(fundDetails);
    }

    @GetMapping
    public List<FundDetails> getAllFunds()
    {
        return fundService.getAllFunds();
    }
}
