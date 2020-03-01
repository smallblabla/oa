package com.ssm.oa.dao;

import com.ssm.oa.entity.DealRecord;
import com.ssm.oa.entity.Department;
import com.ssm.oa.entity.DealRecord;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("dealRecordDao")
public interface DealRecordDao {
    void insert(DealRecord dealRecord);
    List<DealRecord> selectByClaimVoucher(int cvid);
}
