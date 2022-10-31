package com.java.website.AmazonApp.repository;

import com.java.website.AmazonApp.basket.Item;
import org.springframework.data.repository.CrudRepository;

public interface AmazonRepository extends CrudRepository<Item, Long>{

}
