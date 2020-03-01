package com.ssm.oa.biz.imp;

import com.ssm.oa.biz.ClaimVoucherBiz;
import com.ssm.oa.dao.ClaimVoucherDao;
import com.ssm.oa.dao.ClaimVoucherItemDao;
import com.ssm.oa.dao.DealRecordDao;
import com.ssm.oa.entity.ClaimVoucher;
import com.ssm.oa.entity.ClaimVoucherItem;
import com.ssm.oa.entity.DealRecord;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClaimVoucherBizImpl implements ClaimVoucherBiz{
    @Autowired
    public ClaimVoucherDao claimVoucherDao;
    @Autowired
    public ClaimVoucherItemDao claimVoucherItemDao;
    @Autowired
    public DealRecordDao dealRecordDao;

    public void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items) {

    }

    public ClaimVoucher get(int id) {
        return null;
    }

    public List<ClaimVoucherItem> getItems(int cvid) {
        return null;
    }

    public List<DealRecord> getRecords(int cvid) {
        return null;
    }
}
