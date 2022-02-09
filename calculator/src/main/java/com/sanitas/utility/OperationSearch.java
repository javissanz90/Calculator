package com.sanitas.utility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.sanitas.operations.Operation;
import com.sanitas.operations.Subtract;
import com.sanitas.operations.Sum;


public class OperationSearch {

    private static final Map<String, Supplier<Operation>> OPERATION_SUPPLIER;

    static{
        final Map<String, Supplier<Operation>> operationMap = new HashMap<>();

        operationMap.put("Sum", Sum::new);
        operationMap.put("Subtract", Subtract::new);

        OPERATION_SUPPLIER = Collections.unmodifiableMap(operationMap);
    }

    public static <T> Supplier<T> supplyOperation (String operation){
        Supplier<T> op = (Supplier<T>) OPERATION_SUPPLIER.get(operation);
        if(op == null){
            throw new IllegalArgumentException("Invalid operation: "+operation);
        }
        return (Supplier<T>) op;
    }
}
