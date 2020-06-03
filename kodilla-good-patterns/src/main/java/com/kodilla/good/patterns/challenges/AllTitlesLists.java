package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class AllTitlesLists {
    private final String signature;
    private final TitleList titleList;
    private final Map<String,TitleList> allTitlesListsMap = new HashMap();

    public AllTitlesLists(String signature, TitleList titleList) {
        this.signature = signature;
        this.titleList = titleList;
    }

    public String getSignature() {
        return signature;
    }

    public TitleList getTitleList() {
        return titleList;
    }

    public Map<String, TitleList> getAllTitlesListsMap() {
        return allTitlesListsMap;
    }
}
