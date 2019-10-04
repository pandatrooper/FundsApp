package com.example.fundscache.DAO;

import com.example.fundscache.model.FundDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("FundDAO")
public class FundsDataAccessObject implements FundsDAO {

    private static List<FundDetails> DB = new ArrayList<>();

    @Override
    public int insertFunds(FundDetails fundDetails) {
        DB.add(new FundDetails(fundDetails.getName(),fundDetails.getFundPrice(),fundDetails.getFundUnits()));
        return 0;
    }

    @Override
    public List<FundDetails> selectAllFunds() {
        return DB;
    }
}
