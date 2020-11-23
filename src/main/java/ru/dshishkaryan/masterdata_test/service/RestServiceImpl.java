package ru.dshishkaryan.masterdata_test.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestServiceImpl implements RestService {

    @Override
    public List<Integer> processIntegerList(List<Integer> integerList) {
        List<Integer> collect = integerList.parallelStream().distinct().collect(Collectors.toList());
        return collect;
    }
}
