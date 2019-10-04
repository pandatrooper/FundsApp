package com.example.fundscache.Service;

import com.example.fundscache.DAO.FundsDAO;
import com.example.fundscache.model.FundDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundService {

    private final FundsDAO fundsDAO;

    @Autowired
    public FundService(@Qualifier("FundDAO") FundsDAO fundsDAO)
    {
        this.fundsDAO = fundsDAO;
    }

    public int addFunds(FundDetails fundDetails)
    {
        return fundsDAO.insertFunds(fundDetails);
    }

    public List<FundDetails> getAllFunds() {
        return fundsDAO.selectAllFunds();
    }
}
