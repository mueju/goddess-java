package com.bjike.goddess.employeecontract.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.employeecontract.dto.ContractChangeDTO;
import com.bjike.goddess.employeecontract.entity.ContractChange;
import org.springframework.stereotype.Repository;

/**
 * 合同变更详细持久化接口, 继承基类可使用ｊｐａ命名查询
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-21 04:23 ]
 * @Description: [ 合同变更详细持久化接口, 继承基类可使用ｊｐａ命名查询 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Repository
public interface ContractChangeRep extends JpaRep<ContractChange, ContractChangeDTO> {

}