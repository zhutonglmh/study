package com.zt.study.service.impl;

import com.zt.study.dao.DsxhOrderMapper;
import com.zt.study.pojo.DsxhOrder;
import com.zt.study.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DsxhOrderMapper dsxhOrderMapper;
    @Override
    public List<DsxhOrder> findDataForPage(DsxhOrder dsxhOrder) {

        List<DsxhOrder> list = null;
        try {
            list = dsxhOrderMapper.findDataForPage(dsxhOrder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
