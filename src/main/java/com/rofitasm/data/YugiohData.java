package com.rofitasm.data;

import lombok.Data;

@Data
public class YugiohData {
    private String cardName;
    private String attribute;
    private int rank;
    private String monsterType;
    private String cardType;
    private int atk;
    private int def;
    private String cardEffects;
}
