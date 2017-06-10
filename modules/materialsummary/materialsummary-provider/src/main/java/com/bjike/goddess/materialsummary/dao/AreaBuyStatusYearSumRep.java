package com.bjike.goddess.materialsummary.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.materialsummary.dto.AreaBuyStatusYearSumDTO;
import com.bjike.goddess.materialsummary.entity.AreaBuyStatusYearSum;

/**
 * 地区购买情况年汇总持久化接口, 继承基类可使用ｊｐａ命名查询
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-05-22 10:56 ]
 * @Description: [ 地区购买情况年汇总持久化接口, 继承基类可使用ｊｐａ命名查询 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface AreaBuyStatusYearSumRep extends JpaRep<AreaBuyStatusYearSum, AreaBuyStatusYearSumDTO> {

}