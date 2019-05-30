package com.alodiga.services.provider.commons.utils;

import com.alodiga.services.provider.commons.models.ProductDenomination;
import java.util.Comparator;

public class AmmountComparator implements Comparator<Object> {

    public int compare(Object emp1, Object emp2) {
        Float amount1 = ((ProductDenomination) emp1).getAmount();
        Float amount2 = ((ProductDenomination) emp2).getAmount();
        return amount1.compareTo(amount2);

    }
}
