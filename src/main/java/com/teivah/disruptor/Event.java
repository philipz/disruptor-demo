package com.teivah.disruptor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Event<T> {

  private T payload;

public char[] getPayload() {
	return null;
}

public void setPayload(String string) {
}
}
