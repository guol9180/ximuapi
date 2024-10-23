package com.ximu.ximuapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ximu.ximuapi.model.entity.InterfaceInfo;
import com.ximu.ximuapi.service.InterfaceInfoService;
import com.ximu.ximuapi.mapper.InterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author 析木
* @description 针对表【interface_info(接口信息表)】的数据库操作Service实现
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

}




