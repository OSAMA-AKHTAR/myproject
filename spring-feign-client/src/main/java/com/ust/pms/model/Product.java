package com.ust.pms.model;



import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode

public class Product {

	private @NonNull int productId;
	private @NonNull String productName;
	private @NonNull int quantityOnHand;
	private @NonNull int price;
	
}
