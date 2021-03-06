package com.xenione.libs.repoinapp.criteria.matcher;


import com.xenione.libs.repoinapp.criteria.Matchable;

public class AnyOf<T> implements Matchable<T> {

    @SafeVarargs
    public static <T> Matchable<T> anyOf(Matchable<T>... matchables) {
        return new AnyOf<>(matchables);
    }

    Matchable<T>[] matchables;

    @SafeVarargs
    AnyOf(Matchable<T>... matchables) {
        this.matchables = matchables;
    }

    @Override
    public boolean match(T aObject) {
        for (Matchable<T> matchable : matchables) {
            if (matchable.match(aObject)) {
                return true;
            }
        }
        return false;
    }
}
