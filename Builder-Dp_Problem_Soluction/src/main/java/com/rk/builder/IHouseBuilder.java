//IHouseBuilder.java (Builder Interface)
package com.rk.builder;

import com.rk.product.house.House;

public interface IHouseBuilder {
   public void  constructRoof();
   public void  constructBasement();
   public void  constructStructor();
   public void  constructInterior();
   public House  getHouse();
}
