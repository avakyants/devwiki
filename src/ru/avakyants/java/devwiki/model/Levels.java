package ru.avakyants.java.devwiki.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Levels {
	JUNIOR(1), MIDDLE(2), SENIOR(3), EXPERT(4);
	
	int value;
	
	Levels(int level){
		this.value = level;
	}
	
	public int getValue() {
		return this.value;
	}
	
	private static Map<Integer, Levels> map = new HashMap<>();

    static {
        for (Levels status : Levels.values()) {
            map.put(status.value, status);
        }
    }
	
	@JsonCreator
    public static Levels forValue(int value) {
        return map.get(value);
    }

    @JsonValue
    public int toValue() {
        return this.value;
    }
	
}
