package com.teivah.disruptor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Event<T> {

  String payload;

  public String getPayload() {
    return this.payload;
  }

  public void setPayload(String string) {
    this.payload = string;
  }
}
