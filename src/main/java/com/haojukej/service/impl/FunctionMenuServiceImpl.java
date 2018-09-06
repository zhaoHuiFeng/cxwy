package com.haojukej.service.impl;

import com.haojukej.mapper.FunctionMenuMapper;
import com.haojukej.pojo.FunctionMenu;
import com.haojukej.service.FunctionMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huifengzhao
 * @ClassName FunctionMenuServiceImpl
 * @date 2018/8/21
 */
@Service
public class FunctionMenuServiceImpl implements FunctionMenuService {

    @Resource
    private FunctionMenuMapper functionMenuMapper;

    @Override
    public List<FunctionMenu> getFunctionMenu() {

        return functionMenuMapper.selectAll();
}
}
