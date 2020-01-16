package com.likang.IDao;

import com.likang.model.Account;
import com.likang.model.AcountVo;

import java.util.List;

public interface IAccountDao {
    List<Account> findAll();
    List<AcountVo> findAllVo();
}
