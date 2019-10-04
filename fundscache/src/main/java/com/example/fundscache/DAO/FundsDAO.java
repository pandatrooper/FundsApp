package com.example.fundscache.DAO;

import com.example.fundscache.model.FundDetails;

import java.util.List;
import java.util.UUID;

public interface FundsDAO {

    int insertFunds(FundDetails fundDetails);

    List<FundDetails> selectAllFunds();

}
