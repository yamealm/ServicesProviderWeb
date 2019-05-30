package com.alodiga.services.provider.commons.utils;

import com.alodiga.services.provider.commons.models.ReportParameter;

import java.util.Comparator;

public class IndexComparator implements Comparator<Object> {

    public int compare(Object emp1, Object emp2) {
        Integer index1 = ((ReportParameter) emp1).getIndexOrder();
        Integer index2 = ((ReportParameter) emp2).getIndexOrder();
        return index1.compareTo(index2);

    }
}
