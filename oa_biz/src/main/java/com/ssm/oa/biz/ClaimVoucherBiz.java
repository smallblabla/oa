package com.ssm.oa.biz;

import com.ssm.oa.entity.ClaimVoucher;
import com.ssm.oa.entity.ClaimVoucherItem;
import com.ssm.oa.entity.DealRecord;

import java.util.List;

public interface ClaimVoucherBiz {

    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);
    ClaimVoucher get(int id);
    List<ClaimVoucherItem> getItems(int cvid);
    List<DealRecord> getRecords(int cvid);


}
