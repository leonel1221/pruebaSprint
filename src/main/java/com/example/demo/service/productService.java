package com.example.demo.service;

import com.example.demo.modelo.product;
import com.example.demo.repositiry.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class productService implements productRepository{
    @Autowired
    private com.example.demo.repositiry.productRepository productRepository;

    @Override
    public List<product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<product> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<product> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<product> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
       productRepository.deleteById(aLong);
    }

    @Override
    public void delete(product product) {
         productRepository.delete(product);
    }

    @Override
    public void deleteAll(Iterable<? extends product> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends product> S save(S s) {
        return productRepository.save(s);
    }

    @Override
    public <S extends product> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<product> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends product> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<product> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public product getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends product> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends product> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends product> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends product> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends product> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends product> boolean exists(Example<S> example) {
        return false;
    }
}
