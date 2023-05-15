package com.hi.app1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderCommand {

    private List<OrderItem> orderItems;
    private Address address;

}