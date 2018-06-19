package com.zt.study.controller;

import com.zt.study.pojo.DsxhOrder;
import com.zt.study.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 测试系统框架
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;
    @PostMapping("/demo")
    @ResponseBody
    public List<DsxhOrder> demo(@RequestBody DsxhOrder dsxhOrder){
        List<DsxhOrder> list = demoService.findDataForPage(dsxhOrder);
        return list;
    }

}
