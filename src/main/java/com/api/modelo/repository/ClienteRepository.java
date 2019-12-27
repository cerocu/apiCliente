package com.api.modelo.repository;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import com.api.entity.Cliente;
//@Repository
//@Repository("ClienteRepository")

//public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
