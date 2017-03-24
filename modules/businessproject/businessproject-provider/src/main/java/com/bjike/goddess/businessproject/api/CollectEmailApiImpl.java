package com.bjike.goddess.businessproject.api;

import com.bjike.goddess.businessproject.bo.CollectEmailBO;
import com.bjike.goddess.businessproject.dto.CollectEmailDTO;
import com.bjike.goddess.businessproject.service.CollectEmailSer;
import com.bjike.goddess.businessproject.to.CollectEmailTO;
import com.bjike.goddess.common.api.exception.SerException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商务项目合同邮件业务接口实现
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-16T19:08:18.889 ]
 * @Description: [ 商务项目合同邮件业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("collectEmailApiImpl")
public class CollectEmailApiImpl implements CollectEmailAPI {

    private CollectEmailSer collectEmailSer;

    @Override
    public List<CollectEmailBO> listCollectEmail(CollectEmailDTO collectEmailDTO) throws SerException {
        return collectEmailSer.listCollectEmail( collectEmailDTO );
    }

    @Override
    public CollectEmailBO addCollectEmail(CollectEmailTO collectEmailTO) throws SerException {
        return collectEmailSer.addCollectEmail( collectEmailTO);
    }

    @Override
    public CollectEmailBO editCollectEmail(CollectEmailTO collectEmailTO) throws SerException {
        return collectEmailSer.editCollectEmail(collectEmailTO);
    }

    @Override
    public void deleteCollectEmail(String id) throws SerException {
        collectEmailSer.deleteCollectEmail(id);
    }

    @Override
    public void congealCollectEmail(String id) throws SerException {
        collectEmailSer.congealCollectEmail(id);
    }

    @Override
    public void thawCollectEmail(String id) throws SerException {
        collectEmailSer.thawCollectEmail(id);
    }

    @Override
    public List<CollectEmailBO> collectCollectEmail(String[] works) throws SerException {
        return collectEmailSer.collectCollectEmail(works);
    }

    @Override
    public List<CollectEmailBO> collectBaseInfoEmail(String[] firstCompany) throws SerException {
        return collectEmailSer.collectBaseInfoEmail(firstCompany);
    }

    @Override
    public List<CollectEmailBO> collectDispatchEmail(String[] area) throws SerException {
        return collectEmailSer.collectDispatchEmail(area);
    }
}