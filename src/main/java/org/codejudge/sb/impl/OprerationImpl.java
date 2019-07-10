package org.codejudge.sb.impl;

import org.codejudge.sb.service.IOperation;
import org.springframework.stereotype.Service;

@Service
public class OprerationImpl implements IOperation {

    @Override
    public Integer addNumber(Integer num1, Integer num2){
        return num1+num2;
    }


}
